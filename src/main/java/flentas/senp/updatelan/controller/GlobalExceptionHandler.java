
package flentas.senp.updatelan.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import flentas.senp.updatelan.dto.ErrorResponseDto;
import flentas.senp.updatelan.messages.Messages;

@RestController
@ControllerAdvice
@Order(Ordered.LOWEST_PRECEDENCE)
public class GlobalExceptionHandler {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	Messages messages;

	@ExceptionHandler(value = MethodArgumentTypeMismatchException.class)
	public ResponseEntity<ErrorResponseDto> handleExceptionForFormate(MethodArgumentTypeMismatchException e) {

		ErrorResponseDto errorResponseDto = new ErrorResponseDto();
		errorResponseDto.setStatus(false);
		errorResponseDto.setStatusCode(messages.getStatusCode("NumberFormatException.id"));
		errorResponseDto.setMessage(messages.get("NumberFormatException.message"));
		logger.warn(e.getMessage());

		return new ResponseEntity<ErrorResponseDto>(errorResponseDto, HttpStatus.INTERNAL_SERVER_ERROR);
//		return errorResponseDto;
	}

	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<ErrorResponseDto> handleException(Exception e) {

		ErrorResponseDto errorResponseDto = new ErrorResponseDto();
		errorResponseDto.setStatus(false);
		errorResponseDto.setStatusCode(messages.getStatusCode("global.exception.message.id"));
		errorResponseDto.setMessage(messages.get("global.exception.message"));
		logger.warn(e.getMessage());
		e.printStackTrace();

		return new ResponseEntity<ErrorResponseDto>(errorResponseDto, HttpStatus.INTERNAL_SERVER_ERROR);
//		return errorResponseDto;
	}

}
