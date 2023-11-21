package flentas.senp.updatelan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "log_gst_patchPdfParsing_request")
public class PatchPdfparsingRequestModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int patchPdfReqId;
	public String requestId;
	public String proceed;
	public String traceId;
	public String lan;
	public String cif;
	@Column(name = "triggerby")
	public String user;
	@OneToOne(mappedBy = "patchPdfparsingRequestModel")
	PatchPdfparsingResponseModel patchPdfparsingResponseModel;
	
	
	
	public String getTraceId() {
		return traceId;
	}
	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}
	public int getPatchPdfReqId() {
		return patchPdfReqId;
	}
	public void setPatchPdfReqId(int patchPdfReqId) {
		this.patchPdfReqId = patchPdfReqId;
	}
	public String getRequestId() {
		return requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getProceed() {
		return proceed;
	}
	public void setProceed(String proceed) {
		this.proceed = proceed;
	}
	public PatchPdfparsingResponseModel getPatchPdfparsingResponseModel() {
		return patchPdfparsingResponseModel;
	}
	public void setPatchPdfparsingResponseModel(PatchPdfparsingResponseModel patchPdfparsingResponseModel) {
		this.patchPdfparsingResponseModel = patchPdfparsingResponseModel;
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
