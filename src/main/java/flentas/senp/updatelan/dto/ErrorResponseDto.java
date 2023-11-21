package flentas.senp.updatelan.dto;

import java.util.UUID;

public class ErrorResponseDto {

	private boolean status;
	private String statusCode;
	private String errorType;
	private String message;
	private Object error;
	private UUID traceId;

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getErrorType() {
		return errorType;
	}

	public void setErrorType(String errorType) {
		this.errorType = errorType;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getError() {
		return error;
	}

	public void setError(Object error) {
		this.error = error;
	}

	public UUID getTraceId() {
		return traceId;
	}

	public void setTraceId(UUID traceId) {
		this.traceId = traceId;
	}

	@Override
	public String toString() {
		return "ErrorResponseDto [status=" + status + ", statusCode=" + statusCode + ", errorType=" + errorType
				+ ", message=" + message + ", error=" + error + ", traceId=" + traceId + "]";
	}

}
