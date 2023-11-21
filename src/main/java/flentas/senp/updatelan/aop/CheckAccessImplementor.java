package flentas.senp.updatelan.aop;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.security.interfaces.RSAPublicKey;
import java.sql.Timestamp;
import java.text.ParseException;
import java.time.Instant;
import java.util.Base64;
import java.util.Date;
import java.util.UUID;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.CodeSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.auth0.jwk.Jwk;
import com.auth0.jwk.JwkException;
import com.auth0.jwk.JwkProvider;
import com.auth0.jwk.UrlJwkProvider;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.SignatureVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;

import flentas.senp.updatelan.dto.OutputResponseDto;
import flentas.senp.updatelan.dto.UserContext;
import flentas.senp.updatelan.exception.CustomException;
import flentas.senp.updatelan.exception.ValidationException;
import flentas.senp.updatelan.messages.Messages;
import flentas.senp.updatelan.model.TbApplicationMaster;
import flentas.senp.updatelan.model.TbPermissionMaster;
import flentas.senp.updatelan.repository.ApplicationMasterRepository;
import flentas.senp.updatelan.repository.ApplicationRoleMasterRepository;
import flentas.senp.updatelan.repository.PermissionMasterRepository;
import flentas.senp.updatelan.utility.Constants;
import flentas.senp.updatelan.utility.ResponseEntityGenerator;

@Aspect
@Component
public class CheckAccessImplementor {
	public static final String JWK_URl_SUFFIX = Constants.JWK_URl_SUFFIX;
	public static final String JWK_FILE_PREFIX = Constants.JWK_FILE_PREFIX;
	public static final String JWK_FILE_SUFFIX = Constants.JWK_FILE_SUFFIX;
	public static final String ISS = Constants.ISS;
//	@Autowired
//	UserRoleMappingRepository userRoleMappingRepository;
//	@Autowired
//	PermissionMasterRepository permissionMasterRepository;
	@Autowired
	Messages messages;
	@Autowired
	OutputResponseDto outputResponseDto;

	@Autowired(required = false)
	ResponseEntityGenerator responseEntityGenerator;

	@Autowired
	PermissionMasterRepository permissionMasterRepository;
	@Autowired
	ApplicationMasterRepository applicationMasterRepository;
	@Autowired
	ApplicationRoleMasterRepository applicationRoleMasterRepository;
	@Autowired
	UserContext userContext;
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Around("execution(@flentas.senp.updatelan.aop.CheckAccess * *(..)) && @annotation(checkAccess)")
	public Object checkAccessAdvice(ProceedingJoinPoint proceedingJoinPoint, CheckAccess checkAccess) {
		try {

			Timestamp timestampIn = new Timestamp(System.currentTimeMillis());
			logger.info("CheckAccess In Time" + timestampIn.toString());
			// logger.info("In checkAccessAdvice | AwsCognitoPoolId :" + AwsCognitoPoolId);
			userContext.setTraceId(UUID.randomUUID());
			Object returnValue = null;
			logger.info("proceedingJoinPoint.getArgs() : " + proceedingJoinPoint.getArgs().length);
			Object[] signatureArgs = proceedingJoinPoint.getArgs();
			CodeSignature methodSignature = (CodeSignature) proceedingJoinPoint.getSignature();
			logger.info("signatureArgs : " + methodSignature.getParameterNames(),
					" | signatureArgs[0] : " + signatureArgs[0]);
			HttpServletRequest req = (HttpServletRequest) signatureArgs[0];
			logger.info("Authorization Header : " + req.getHeader("Authorization"), "| Method :" + req.getMethod());
			String reqUrl = req.getRequestURL().toString();
			String url = splitReqUrl(reqUrl);
			url = req.getMethod() + "/" + url;
			logger.info("Request Method Type & URL : " + url);
			logger.info("req.getHeader(\"Authorization\") :" + req.getHeader("Authorization"));
			if (req.getHeader("Authorization") == null) {
				logger.error("Authorization header is missing | req.getHeader(\"Authorization\") :"
						+ req.getHeader("Authorization"));

				throw new ValidationException(Constants.booleanFalse, messages.get("dms.failure.message.emptyHeader"),
						messages.getStatusCode("dms.failure.message.emptyHeader.id"), userContext.getTraceId());
			}
			// decode request url
			final String authHeader = URLDecoder.decode(req.getHeader("Authorization"), "UTF-8");
			logger.info("authHeader is : " + authHeader);
			if (!authHeader.startsWith("Bearer ")) {
				logger.error("Invalid Authorization Header | authHeader :" + authHeader);

				throw new ValidationException(Constants.booleanFalse, messages.get("dms.failure.message.invalidHeader"),
						messages.getStatusCode("dms.failure.message.invalidHeader.id"), userContext.getTraceId());
			}
			final String token = authHeader.substring(7); // The part after "Bearer "
			logger.info("token is" + token);

			// token verification

			DecodedJWT jwt = JWT.decode(token);

			String tid = jwt.getClaim("tid").toString();

			logger.info(jwt.getKeyId());

			JwkProvider provider = null;
			Jwk jwk = null;
			Algorithm algorithm = null;

//				provider = new UrlJwkProvider(new URL("https://login.microsoftonline.com/common/discovery/v2.0/keys"));
//				provider = new UrlJwkProvider(new URL("https://login.microsoftonline.com/1675ffb0-1bb2-4326-a219-670dbf57c7b3/discovery/keys"));
			provider = new UrlJwkProvider(new URL(Constants.authenticationUrl));
			byte[] bytes = Base64.getUrlDecoder().decode(jwt.getPayload());
			String decodedString = new String(bytes, StandardCharsets.UTF_8);
			logger.info("Decoded: " + decodedString);
			jwk = provider.get(jwt.getKeyId());

//				             algorithm = Algorithm.RSA256((RSAPublicKey) jwk.getPublicKey(), null);

			algorithm = Algorithm.RSA256((RSAPublicKey) jwk.getPublicKey(), null);
			try {
				algorithm.verify(jwt);// if the token signature is invalid, the method will throw
			} catch (Exception e) {

				throw new ValidationException(Constants.booleanFalse, messages.get("dms.failure.message.authorization"),
						messages.getStatusCode("dms.failure.message.authorization.id"), userContext.getTraceId());
			}
			// check token is expired
			if (jwt.getExpiresAt().before(Date.from(Instant.now()))) {

				throw new ValidationException(Constants.booleanFalse,
						messages.get("senp.failure.message.tokenExpired.authentication"),
						messages.getStatusCode("senp.failure.message.tokenExpired.authentication.id"),
						userContext.getTraceId());
			}
			// SignatureVerificationException
			logger.info("Valid token!");
			String appid = jwt.getClaim(Constants.getAppId).toString();
			appid = appid.replace("\"", "");

			TbPermissionMaster tbPermissionMaster = permissionMasterRepository.findOneBySPermissionPath(url);
			if (tbPermissionMaster == null) {

				throw new ValidationException(Constants.booleanFalse, messages.get("dms.failure.message.authorization"),
						messages.getStatusCode("dms.failure.message.authorization.id"), userContext.getTraceId());
			}
			TbApplicationMaster tbUpdateApplicationMaster = applicationMasterRepository.getApplicationDataByAppId(appid);
			if (tbUpdateApplicationMaster == null) {

				throw new ValidationException(Constants.booleanFalse, messages.get("dms.failure.message.authorization"),
						messages.getStatusCode("dms.failure.message.authorization.id"), userContext.getTraceId());
			}
			userContext.setAppId(tbUpdateApplicationMaster.getNappid());

			logger.info("Inside check access" + userContext.getTraceId());
			int IsAuthorized = applicationRoleMasterRepository
					.checkUserPermission(tbUpdateApplicationMaster.getNapplicationid(), url);

			Timestamp timestampAf = new Timestamp(System.currentTimeMillis());
			logger.info("After CheckUserPermission DBCall" + timestampAf.toString());
			logger.info("IsAuthorized : " + IsAuthorized);
			if (IsAuthorized != 0) {
				logger.info("User is authorized");
				returnValue = proceedingJoinPoint.proceed();
				logger.debug("Returning from checkAccess");
				Timestamp timestampOut = new Timestamp(System.currentTimeMillis());
				logger.info("CheckAccess Out Time" + timestampOut.toString());
				return returnValue;
			} else {
				logger.info("User is not authorized");
				MDC.clear();

				throw new ValidationException(Constants.booleanFalse, messages.get("dms.failure.message.authorization"),
						messages.getStatusCode("dms.failure.message.authorization.id"), userContext.getTraceId());
			}

		} catch (CustomException e) {
			throw e;
		} catch (ValidationException e) {
			throw e;

		} catch (UnsupportedEncodingException e) {

			throw new ValidationException(Constants.booleanFalse, messages.get("dms.failure.message.emptyHeader"),
					messages.getStatusCode("dms.failure.message.emptyHeader.id"), userContext.getTraceId());
		} catch (MalformedURLException e) {
			e.printStackTrace();

			throw new ValidationException(Constants.booleanFalse, messages.get("dms.failure.message.MalformedURL"),
					messages.getStatusCode("dms.failure.message.MalformedURL.id"), userContext.getTraceId());

		} catch (ParseException e) {
			e.printStackTrace();
			throw new CustomException(Constants.EX_TYPE_AUTHENTICATION, false,
					messages.getStatusCode("dms.failure.message.Parse.id"), messages.get("dms.failure.message.Parse"),
					responseEntityGenerator.getSCodeFromStatusCode(
							messages.getStatusCode("dms.failure.message.Parse.id")),
					e.getMessage());

		} catch (Throwable e) {
			e.printStackTrace();
			throw new ValidationException(Constants.booleanFalse, messages.get("dms.failure.token.message"),
					messages.getStatusCode("dms.failure.token.message.id"), userContext.getTraceId());

		}

		// return checkAccess;
	}

	/*
	 * Desc :modifying request url to verify with permission path from database for
	 * user permission I/P : url (extracted url from request url) O/P : modified url
	 */
	public String splitReqUrl(String url) {
		int flag = 0;
		boolean isContainPathParameter = false;
		String finalApiUrl = "";

		String[] reqApiUrl = url.split("/"); // keep in Constants
		for (String w : reqApiUrl) {

		}
//		String[] reqApiUrl = url.split("user-management"); // keep in Constants
		String[] splitUrl = reqApiUrl[1].split("/");
		for (String w : splitUrl) {
			isContainPathParameter = Pattern.compile("[0-9]").matcher(w).find();
			if (isContainPathParameter)
				flag = 1;
		}
		if (flag == 1) {
			for (int i = 1; i < splitUrl.length; i++) {
				if (Pattern.compile("[0-9]").matcher(splitUrl[i]).find()) {
					splitUrl[i] = "*";
					finalApiUrl = finalApiUrl.concat("/" + splitUrl[i]);
				} else {
					finalApiUrl = finalApiUrl.concat("/" + splitUrl[i]);
				}
			}
			return finalApiUrl;
		} else {
			for (String w : reqApiUrl) {
				finalApiUrl = w;
			}
			return finalApiUrl;
		}
	}

}