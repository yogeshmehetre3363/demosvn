package flentas.senp.updatelan.dto;

import org.springframework.stereotype.Component;

@Component
public class ServicesDto {

	String request_id;
	String service;
	public String getRequest_id() {
		return request_id;
	}
	public void setRequest_id(String request_id) {
		this.request_id = request_id;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	@Override
	public String toString() {
		return "ServicesDto [request_id=" + request_id + ", service=" + service + "]";
	}
	
	
}
