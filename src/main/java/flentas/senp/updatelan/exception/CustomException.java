/**
 * @author Shyam Sunder Meena
 * @CreatedOn 17/02/2020 
 * @apiNote  CustomException class use to throw custom exception.
 *   member function get and set values of fields.
 */
package flentas.senp.updatelan.exception;

import java.util.UUID;

import org.springframework.http.HttpStatus;

public class CustomException extends BaseException {
	private static final long serialVersionUID = 1L;
	HttpStatus httpStatus;
	private Object o;
	private UUID traceId;

	public CustomException() {
		super("Custom exceptions");
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}

	public Object getO() {
		return o;
	}

	public void setO(Object o) {
		this.o = o;
	}

	public UUID getTraceId() {
		return traceId;
	}

	public void setTraceId(UUID traceId) {
		this.traceId = traceId;
	}

	public CustomException(String message) {
		super(message);
	}

	public CustomException(String type, boolean status, String statuscode, String message, String st, Object obj) {
		super(type, status, statuscode, message);
		httpStatus = HttpStatus.valueOf(Integer.parseInt(st));
		o = obj;
	}

	public CustomException(String type, boolean status, String statuscode, String message, String st) {
		super(type, status, statuscode, message);
		httpStatus = HttpStatus.valueOf(Integer.parseInt(st));
	}

	public CustomException(String type, boolean status, String statuscode, String message, String st, UUID traceId) {
		// super(type, status, statuscode, message);

		super(status, message, statuscode, traceId);
		this.traceId = traceId;
		httpStatus = HttpStatus.valueOf(Integer.parseInt(st));
	}
	/*
	 * public CustomException(HttpStatus httpStatus, String errorReason, String
	 * message) { super(errorReason + message); }
	 * 
	 * public CustomException(HttpStatus httpStatus, String type, boolean status,
	 * String statuscode, String message) { super(type, status, statuscode,
	 * message); httpStatus = httpStatus; }
	 */
}
