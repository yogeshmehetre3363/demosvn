package flentas.senp.updatelan.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import com.vladmihalcea.hibernate.type.array.ListArrayType;

@Entity
@Table(name = "log_gst_postPdfParsing_request",schema="senp_middleware_gst")
@TypeDefs({ @TypeDef(name = "list-array", typeClass = ListArrayType.class) })
public class PostgstPdfParsingRequestModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int postPdfReqId;
	public String consent;
	public String extendedPeriod;
	public String gstIn;
	public String traceId;
	public String lan;
	public String cif;
	@Column(name = "triggerby")
	public String user;
	@Type(type = "list-array")
	@Column(name = "gstPdfUploadedUrl", columnDefinition = "text[]")
	public List<String>gstPdfUploadedUrl;
	@OneToOne(mappedBy = "postgstPdfParsingRequestModel")
	PostgstPdfParsingResponseModel postgstPdfParsingResponseModel;
	
	
	
	public String getTraceId() {
		return traceId;
	}
	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}
	public int getPostPdfReqId() {
		return postPdfReqId;
	}
	public void setPostPdfReqId(int postPdfReqId) {
		this.postPdfReqId = postPdfReqId;
	}
	public String getConsent() {
		return consent;
	}
	public void setConsent(String consent) {
		this.consent = consent;
	}
	public String getExtendedPeriod() {
		return extendedPeriod;
	}
	public void setExtendedPeriod(String extendedPeriod) {
		this.extendedPeriod = extendedPeriod;
	}
	public String getGstIn() {
		return gstIn;
	}
	public void setGstIn(String gstIn) {
		this.gstIn = gstIn;
	}
	
	public List<String> getGstPdfUploadedUrl() {
		return gstPdfUploadedUrl;
	}
	public void setGstPdfUploadedUrl(List<String> gstPdfUploadedUrl) {
		this.gstPdfUploadedUrl = gstPdfUploadedUrl;
	}
	
	public PostgstPdfParsingResponseModel getPostgstPdfParsingResponseModel() {
		return postgstPdfParsingResponseModel;
	}
	public void setPostgstPdfParsingResponseModel(PostgstPdfParsingResponseModel postgstPdfParsingResponseModel) {
		this.postgstPdfParsingResponseModel = postgstPdfParsingResponseModel;
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
