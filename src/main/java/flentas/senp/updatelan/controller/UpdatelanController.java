package flentas.senp.updatelan.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import flentas.senp.updatelan.dto.OutputResponseDto;
import flentas.senp.updatelan.dto.UpdatelanDto;
import flentas.senp.updatelan.dto.UserContext;
import flentas.senp.updatelan.exception.CustomException;
import flentas.senp.updatelan.exception.ValidationException;
import flentas.senp.updatelan.messages.Messages;
import flentas.senp.updatelan.service.UpdatelanService;
import flentas.senp.updatelan.utility.Constants;
import flentas.senp.updatelan.utility.ResponseEntityGenerator;
import flentas.senp.updatelan.utility.UpdateLanValidations;
import io.swagger.annotations.ApiOperation;

@RestController
public class UpdatelanController {

	@Autowired
	Messages messages;

	@Autowired
	UserContext userContext;
	
	@Autowired
	UpdatelanService updatelanService;
	@Autowired
	ResponseEntityGenerator responseEntityGenerator;
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	UpdateLanValidations updateLanValidations = new UpdateLanValidations();
	

	@RequestMapping(value = "/mw/api/updateLan", method = RequestMethod.POST)
	public ResponseEntity<OutputResponseDto> updatelan(HttpServletRequest req, @RequestBody UpdatelanDto updatelanDto)
			throws Exception {
		logger.info("INFO" + "|" + new SimpleDateFormat("ddMMyyyy").format(new Date()) + "|"
				+ new SimpleDateFormat("HHmm").format(new Date()) + "|" + "Controller" + "|" + "updatelan" );
		userContext.setTraceId(UUID.randomUUID());
		
		if (updateLanValidations.checklan_id(updatelanDto.getLan_id())) {
			throw new ValidationException(Constants.booleanFalse, Constants.invalidLan_id,
					Constants.invalid_input_code, userContext.getTraceId());
		}
//		if (updateLanValidations.checkusername(updatelanDto.getUsername())) {
//			throw new ValidationException(Constants.booleanFalse, Constants.invalidUsername,
//					Constants.invalid_input_code, userContext.getTraceId());
//		}
		if (updateLanValidations.checkcif(updatelanDto.getCif())) {
			throw new ValidationException(Constants.booleanFalse, Constants.invalidCif,
					Constants.invalid_input_code, userContext.getTraceId());
		}
        if (updatelanDto.getServices() == null) {
			
			throw new ValidationException(Constants.booleanFalse, messages.get("credlink.invalid.gstinList"),
					Constants.invalid_input_code, userContext.getTraceId());

		}

		if (updatelanDto.getServices().size() == 0) {
			throw new ValidationException(Constants.booleanFalse, messages.get("credlink.invalid.gstinList"),
					Constants.invalid_input_code, userContext.getTraceId());
		}
		
		List<String> services=Arrays.asList("ITR","ITR-ONLINE","FSA","GST","GST-CRED","BSA","BSA-ONLINE");	
		for(int h=0;h<updatelanDto.getServices().size();h++) {
			
			if(services.contains(updatelanDto.getServices().get(h).getService())==false) {
				throw new ValidationException(Constants.booleanFalse, messages.get("invalid.service.provided"),
						Constants.invalid_input_code, userContext.getTraceId());
			}
				
		}
	
		try {

			
			OutputResponseDto outputResponseDto = updatelanService.updatelanService(updatelanDto);
			return responseEntityGenerator.getResponseEntity(outputResponseDto);
		} catch (Exception e) {
			logger.error("ERROR" + "|" + new SimpleDateFormat("ddMMyyyy").format(new Date()) + "|"
					+ new SimpleDateFormat("HHmm").format(new Date()) + "|" + "Controller" + "|"
					+ "updatelan" + e.getMessage());

			throw new CustomException(Constants.customException, Constants.booleanFalse,
					messages.getStatusCode("senp.updatelan.failure.invalidInput.message.id"), e.getMessage(),
					responseEntityGenerator
							.getSCodeFromStatusCode(messages.getStatusCode("senp.updatelan.failure.invalidInput.message.id")),userContext.getTraceId());
		}
	}

	
	
	
	
}
