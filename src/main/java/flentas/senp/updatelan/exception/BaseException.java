package flentas.senp.updatelan.exception;

import java.util.UUID;

/**
 * @author Shyam Sunder Meena
 * @CreatedOn 17/02/2020
 * @apiNote This is BaseException class Which will send following parameters
 *          when ever exception is thrown. member function get and set values of
 *          fields.
 */

public class BaseException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	// Type of exception
	private String type;
	// Response is true or false
	private boolean status;
	// StatusCode of response
	private String statuscode;

	private String message;

	private UUID traceId;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getStatuscode() {
		return statuscode;
	}

	public void setStatuscode(String statuscode) {
		this.statuscode = statuscode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public UUID getTraceId() {
		return traceId;
	}

	public void setTraceId(UUID traceId) {
		this.traceId = traceId;
	}

	public BaseException() {
		// TODO Auto-generated constructor stub
	}

	public BaseException(String type, boolean status, String statuscode, String message) {
		super();
		this.type = type;
		this.status = status;
		this.statuscode = statuscode;
		this.message = message;
	}

	public BaseException(boolean status, String message, String statuscode, UUID traceId) {
		super();

		this.status = status;
		this.statuscode = statuscode;
		this.message = message;
		this.traceId = traceId;
	}

	public BaseException(String message) {
		this.message = message;

	}

	public BaseException(String statusCode, String message) {

		this.statuscode = statusCode;
		this.message = message;
	}

}
