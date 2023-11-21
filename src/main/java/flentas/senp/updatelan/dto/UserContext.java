package flentas.senp.updatelan.dto;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;

@Scope(value = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
@Component
public class UserContext {

	@Autowired
	Gson gson;
	private UUID traceId;
	private Long userId;
	private String appId;
	private String userType;
	private String action;
	private String actionDescription;
	private Boolean success;
	private String service;
	private Long deviceId;
	private String serialNo = "-";

	public Gson getGson() {
		return gson;
	}

	public void setGson(Gson gson) {
		this.gson = gson;
	}

	public UUID getTraceId() {
		return traceId;
	}

	public void setTraceId(UUID traceId) {
		this.traceId = traceId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Long getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(Long deviceId) {
		this.deviceId = deviceId;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public String getActionDescription() {
		return actionDescription;
	}

	public void setActionDescription(String actionDescription) {
		this.actionDescription = actionDescription;
	}

	public String getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	@Override
	public String toString() {
		return "UserContext [gson=" + gson + ", traceId=" + traceId + ", userId=" + userId + ", appId=" + appId
				+ ", userType=" + userType + ", action=" + action + ", actionDescription=" + actionDescription
				+ ", success=" + success + ", service=" + service + ", deviceId=" + deviceId + ", serialNo=" + serialNo
				+ "]";
	}

}
