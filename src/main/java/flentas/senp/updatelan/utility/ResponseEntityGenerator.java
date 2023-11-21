package flentas.senp.updatelan.utility;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import flentas.senp.updatelan.dto.OutputResponseDto;
import flentas.senp.updatelan.exception.CustomException;

@Component
public class ResponseEntityGenerator {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	// Response Entity
	public ResponseEntity<OutputResponseDto> getResponseEntity(OutputResponseDto outputResponseDto) {
		HttpStatus st = null;
		String sCode = "";
		String sAppCode = "-";
		try {
			sAppCode = outputResponseDto.getStatusCode().toString();
			logger.info("INFO" +"|" +new SimpleDateFormat("ddMMyyyy").format(new Date())+"|"+new SimpleDateFormat("HHmm").format(new Date())+ "|"+"ResponseEntityGenerator"+ "|"+"sAppCode"+ "|"+"getStatusCode",outputResponseDto.getStatusCode().toString());

			sCode = sAppCode.split("-")[1].toString();
			logger.info("INFO" +"|" +new SimpleDateFormat("ddMMyyyy").format(new Date())+"|"+new SimpleDateFormat("HHmm").format(new Date())+ "|"+"ResponseEntityGenerator"+ "|"+"sAppCode",sAppCode);
			logger.info("INFO" +"|" +new SimpleDateFormat("ddMMyyyy").format(new Date())+"|"+new SimpleDateFormat("HHmm").format(new Date())+ "|"+"ResponseEntityGenerator"+ "|"+"sAppCodesplit->sCode",sAppCode);
		
			st = HttpStatus.valueOf(Integer.parseInt(sCode));
			logger.info("INFO" +"|" +new SimpleDateFormat("ddMMyyyy").format(new Date())+"|"+new SimpleDateFormat("HHmm").format(new Date())+ "|"+"ResponseEntityGenerator"+ "|"+"st",st);

		} catch (Exception e) {
			st = HttpStatus.I_AM_A_TEAPOT;
			logger.error("ERROR" +"|" +new SimpleDateFormat("ddMMyyyy").format(new Date())+"|"+new SimpleDateFormat("HHmm").format(new Date())+ "|"+"ResponseEntityGenerator"+ "|"+"Incorrect Http Header set | sAppCod"+ sAppCode+" | HttpCode:" + sCode);

		}
		return new ResponseEntity<OutputResponseDto>(outputResponseDto, st);
	}

	/*
	 * Extract sCode from StatusCode dms-401-3001 => 401
	 * 
	 */
	public String getSCodeFromStatusCode(String statusCode) {
		HttpStatus st = null;
		String sCode = "";
		String sAppCode = "-";
		sAppCode = statusCode;
		logger.info("INFO" +"|" +new SimpleDateFormat("ddMMyyyy").format(new Date())+"|"+new SimpleDateFormat("HHmm").format(new Date())+ "|"+"ResponseEntityGenerator"+ "|"+"getSCodeFromStatusCode"+"|"+"sappCode " + sAppCode);

		sCode = sAppCode.split("-")[1].toString();
		logger.info("INFO" +"|" +new SimpleDateFormat("ddMMyyyy").format(new Date())+"|"+new SimpleDateFormat("HHmm").format(new Date())+ "|"+"ResponseEntityGenerator"+ "|"+"getSCodeFromStatusCode"+"|"+"sAppCodesplit->sCode " + sCode);

//		logger.info("sAppCode", sAppCode);
//		logger.info("sCode " + sCode);

		return sCode;

	}

}
