package flentas.senp.updatelan.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.http.HttpStatus;


@Entity
@Table(name = "log_BsaOnline_generateLink_res",schema="senp_middleware_bsa")
public class BsaOnlineGenerateLinkResponseModel {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int generateLinkResId;
	
	public String expires;
	public String url;
	
	public String statuscode;
	public String traceId;
	public String message;
	String cif;
	String lan;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "bsa_GenerateLink_report_req")
	BsaOnlineGenerateLinkRequestModel bsaOnlineGenerateLinkRequestModel;

	public int getGenerateLinkResId() {
		return generateLinkResId;
	}

	public void setGenerateLinkResId(int generateLinkResId) {
		this.generateLinkResId = generateLinkResId;
	}

	public String getExpires() {
		return expires;
	}

	public void setExpires(String expires) {
		this.expires = expires;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	
	public String getStatuscode() {
		return statuscode;
	}

	public void setStatuscode(String statuscode) {
		this.statuscode = statuscode;
	}

	public String getTraceId() {
		return traceId;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public BsaOnlineGenerateLinkRequestModel getBsaOnlineGenerateLinkRequestModel() {
		return bsaOnlineGenerateLinkRequestModel;
	}

	public void setBsaOnlineGenerateLinkRequestModel(BsaOnlineGenerateLinkRequestModel bsaOnlineGenerateLinkRequestModel) {
		this.bsaOnlineGenerateLinkRequestModel = bsaOnlineGenerateLinkRequestModel;
	}

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	public String getLan() {
		return lan;
	}

	public void setLan(String lan) {
		this.lan = lan;
	}

	
	

}
