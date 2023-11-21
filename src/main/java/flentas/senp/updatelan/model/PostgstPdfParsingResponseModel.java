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

import com.vladmihalcea.hibernate.type.array.ListArrayType;
import com.vladmihalcea.hibernate.type.json.JsonBinaryType;

@Entity
@Table(name = "log_gst_postPdfParsing_response",schema="senp_middleware_gst")
@TypeDefs({ @TypeDef(name = "list-array", typeClass = ListArrayType.class) })
@TypeDef(name = "json", typeClass = JsonBinaryType.class)
public class PostgstPdfParsingResponseModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int postPdfResId;
	public String responseStatus;
	public int responseStatusCode;
	public String requestId;
	public String traceId;
	public String filingstatusCheck;
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "postPdfReqId")
	PostgstPdfParsingRequestModel postgstPdfParsingRequestModel;
	@Type(type = "json")
	@Column(name = "result_alert_doubtfulDocs", columnDefinition = "jsonb")
	public String result_alert_doubtfulDocs;
	@Type(type = "json")
	@Column(name = "result_alert_missingReturnDocs", columnDefinition = "jsonb")
	public String result_alert_missingReturnDocs;
	public String error;
	public String lan;
	public String cif;
	@Column(name = "triggerby")
	public String user;

	
	
	public String getTraceId() {
		return traceId;
	}
	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public PostgstPdfParsingRequestModel getPostgstPdfParsingRequestModel() {
		return postgstPdfParsingRequestModel;
	}
	public void setPostgstPdfParsingRequestModel(PostgstPdfParsingRequestModel postgstPdfParsingRequestModel) {
		this.postgstPdfParsingRequestModel = postgstPdfParsingRequestModel;
	}
	public int getPostPdfResId() {
		return postPdfResId;
	}
	public void setPostPdfResId(int postPdfResId) {
		this.postPdfResId = postPdfResId;
	}
	public String getResponseStatus() {
		return responseStatus;
	}
	public void setResponseStatus(String responseStatus) {
		this.responseStatus = responseStatus;
	}
	public int getResponseStatusCode() {
		return responseStatusCode;
	}
	public void setResponseStatusCode(int responseStatusCode) {
		this.responseStatusCode = responseStatusCode;
	}
	public String getRequestId() {
		return requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getFilingstatusCheck() {
		return filingstatusCheck;
	}
	public void setFilingstatusCheck(String filingstatusCheck) {
		this.filingstatusCheck = filingstatusCheck;
	}
	public String getResult_alert_doubtfulDocs() {
		return result_alert_doubtfulDocs;
	}
	public void setResult_alert_doubtfulDocs(String result_alert_doubtfulDocs) {
		this.result_alert_doubtfulDocs = result_alert_doubtfulDocs;
	}
	public String getResult_alert_missingReturnDocs() {
		return result_alert_missingReturnDocs;
	}
	public void setResult_alert_missingReturnDocs(String result_alert_missingReturnDocs) {
		this.result_alert_missingReturnDocs = result_alert_missingReturnDocs;
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
