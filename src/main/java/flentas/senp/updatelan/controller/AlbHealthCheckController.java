/**
 *7-Feb-2020 
 * @author Ayush Mehta
 */
package flentas.senp.updatelan.controller;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.interfaces.RSAPublicKey;
import java.util.Base64;
import java.util.Collections;
import java.util.UUID;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.auth0.jwk.Jwk;
import com.auth0.jwk.JwkException;
import com.auth0.jwk.JwkProvider;
import com.auth0.jwk.UrlJwkProvider;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.SignatureVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.google.gson.Gson;

import flentas.senp.updatelan.aop.CheckAccess;
import flentas.senp.updatelan.dto.AccessTokenInputDto;
import flentas.senp.updatelan.dto.OutputResponseDto;
import flentas.senp.updatelan.dto.UserContext;
import flentas.senp.updatelan.messages.Messages;
import flentas.senp.updatelan.model.TbPermissionMaster;
import flentas.senp.updatelan.repository.ApplicationMasterRepository;
import flentas.senp.updatelan.repository.PermissionMasterRepository;
import flentas.senp.updatelan.utility.Constants;
import io.swagger.annotations.ApiOperation;


@RestController
@CrossOrigin(origins = "*")
public class AlbHealthCheckController {

	@Autowired
	Messages messages;

	@Autowired
	PermissionMasterRepository permissionMasterRepository;

	@Autowired
	Gson gson;
	@Autowired
	UserContext userContext;
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	// This is healtcheck API for ALB
//	@CheckAccess
	@RequestMapping(value = "/healthcheck", method = RequestMethod.GET)
	public ResponseEntity<OutputResponseDto> healthcheck() throws AddressException, MessagingException {
		logger.info("returning healthcheck in ums");
		userContext.setTraceId(UUID.randomUUID());
		try {
			// createSignature.test("hello");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ResponseEntity<OutputResponseDto>(
				new OutputResponseDto(true, null, messages.get("ums.success.healtcheck.message"),
						messages.getStatusCode("ums.success.healtcheck.message.id"), userContext.getTraceId()),
				HttpStatus.OK);

	}

	// This is healtcheck API for ALB
	// @CheckAccess
	@ApiOperation(value = "This API will be used to get token for authentication")
	@RequestMapping(value = "/getAccessToken", method = RequestMethod.GET)
	public ResponseEntity<OutputResponseDto> getAccessToken() {
		logger.info("inside get access token");
		try {
			RestTemplate restTemplate = new RestTemplate();
			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
			headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
			MultiValueMap<String, String> map = new LinkedMultiValueMap<>();
			map.add(Constants.grant_type, Constants.grant_type_value);
			map.add(Constants.scope, Constants.scope_value);
			// map.add("password", LnPassword);
			map.add(Constants.clinet_id, Constants.clinet_id_value);
			map.add(Constants.client_secret, Constants.client_secret_value);
			HttpEntity<MultiValueMap<String, String>> entity = new HttpEntity<>(map, headers);
			ResponseEntity<String> response = restTemplate.exchange(Constants.getTokenUrl, HttpMethod.POST, entity,
					String.class);
			userContext.setTraceId(UUID.randomUUID());
			return new ResponseEntity<OutputResponseDto>(
					new OutputResponseDto(true, response.getBody(), messages.get("ums.success.healtcheck.message"),
							messages.getStatusCode("ums.success.healtcheck.message.id"), userContext.getTraceId()),
					HttpStatus.OK);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

	// This is healtcheck API for ALB
	@CheckAccess
	@RequestMapping(value = "/verifyAccessToken", method = RequestMethod.GET)
	public ResponseEntity<OutputResponseDto> verifyAccessToken(HttpServletRequest req) {
		logger.info("Inside verifyAccessToken");
		return null;
	}

}
