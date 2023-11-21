package flentas.senp.updatelan.dto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class UpdatelanDto {
	String lan_id;
	String username;
	String cif;
	
	
	 @Autowired
	    private List<ServicesDto> services;

	public String getLan_id() {
		return lan_id;
	}

	public void setLan_id(String lan_id) {
		this.lan_id = lan_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<ServicesDto> getServices() {
		return services;
	}

	public void setServices(List<ServicesDto> services) {
		this.services = services;
	}

	
	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	@Override
	public String toString() {
		return "UpdatelanDto [lan_id=" + lan_id + ", username=" + username + ", cif=" + cif + ", services=" + services
				+ "]";
	}


	
	
	
	


	
}
