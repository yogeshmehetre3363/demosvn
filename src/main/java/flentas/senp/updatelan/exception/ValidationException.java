package flentas.senp.updatelan.exception;

import java.util.UUID;

import org.springframework.http.HttpStatus;

/**
 * @author Shyam Sunder Meena
 * @CreatedOn 20/02/2020
 * @apiNote This is ValidationException class Which will extend BaseException
 *          member function get and set values of fields
 */

public class ValidationException extends BaseException {

	private static final long serialVersionUID = 1L;
	// http status code
	private HttpStatus httpstatus;

	private UUID traceId;

	public HttpStatus getHttpstatus() {
		return httpstatus;
	}

	public void setHttpstatus(HttpStatus httpstatus) {
		this.httpstatus = httpstatus;
	}

	public UUID getTraceId() {
		return traceId;
	}

	public void setTraceId(UUID traceId) {
		this.traceId = traceId;
	}

	public ValidationException(HttpStatus httpstatus) {
		super();
		this.httpstatus = httpstatus;
	}

	public ValidationException(boolean status, String message, String statuscode, UUID traceId) {
		super(status, message, statuscode, traceId);
		this.httpstatus = HttpStatus.BAD_REQUEST;
		this.traceId = traceId;
		// TODO Auto-generated constructor stub
	}

	public ValidationException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public ValidationException() {

	}

}
