package flentas.senp.updatelan.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;

@Entity
@Table(name = "log_Gst_credlink_res",schema="senp_middleware_gst")
@TypeDefs({ @TypeDef(name = "json", typeClass = JsonBinaryType.class) })
public class CredlinkGstResponseModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int credlinkResId;
	public String webLink;
	public int statuscode;
	public String requestId;
	public String response;
	private String traceId;
    private String errorMessage;
    private String lan;
    private String cif;
    @Column(name = "triggerby")
    private String user;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Gst_Credlink_report_req")
	CredlinkGstRequestModel credlinkGstRequestModel;
	
	
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getWebLink() {
		return webLink;
	}
	public void setWebLink(String webLink) {
		this.webLink = webLink;
	}
	public int getStatuscode() {
		return statuscode;
	}
	public void setStatuscode(int statuscode) {
		this.statuscode = statuscode;
	}
	public String getRequestId() {
		return requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getResponse() {
		return response;
	}
	public void setResponse(String response) {
		this.response = response;
	}
	public String getTraceId() {
		return traceId;
	}
	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}
	public CredlinkGstRequestModel getCredlinkGstRequestModel() {
		return credlinkGstRequestModel;
	}
	public void setCredlinkGstRequestModel(CredlinkGstRequestModel credlinkGstRequestModel) {
		this.credlinkGstRequestModel = credlinkGstRequestModel;
	}
	
	
	public int getCredlinkResId() {
		return credlinkResId;
	}
	public void setCredlinkResId(int credlinkResId) {
		this.credlinkResId = credlinkResId;
	}
	
	
	
	public String getLan() {
		return lan;
	}
	public void setLan(String lan) {
		this.lan = lan;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getCif() {
		return cif;
	}
	public void setCif(String cif) {
		this.cif = cif;
	}

	
	
	
	
	
	
	

}
