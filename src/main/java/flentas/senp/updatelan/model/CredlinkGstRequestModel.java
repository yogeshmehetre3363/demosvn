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
import org.springframework.beans.factory.annotation.Autowired;

import com.vladmihalcea.hibernate.type.array.ListArrayType;
import com.vladmihalcea.hibernate.type.json.JsonBinaryType;

import flentas.senp.updatelan.dto.AdditionalContact;
import flentas.senp.updatelan.dto.GstinList;
import flentas.senp.updatelan.dto.SimulateData;


@Entity
@Table(name = "log_Gst_Credlink_req",schema="senp_middleware_gst")
//@TypeDefs({ @TypeDef(name = "list-array", typeClass = ListArrayType.class) })
@TypeDefs({ @TypeDef(name = "json", typeClass = JsonBinaryType.class) })
public class CredlinkGstRequestModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int credlinkReqId;
	@Type(type = "json")
	@Column(name = "additionalContact", columnDefinition = "jsonb")
	public String additionalContact;
	
	private String consent;
	private String cif;
	private boolean gstCertFlag;
	
	@Type(type = "json")
	@Column(name = "gstinList", columnDefinition = "jsonb")
	public String gstinList;
	
	@Type(type = "json")
	@Column(name = "simulateData", columnDefinition = "jsonb")
	private String simulateData;
	
	private String businessName;
    private String refId;
    private String applicationId;
    private String traceId;
    
    private String callBackUrl;
    
    private String lan;
    @Column(name = "triggerby")
    private String user;
    
    @OneToOne(mappedBy = "credlinkGstRequestModel")
    CredlinkGstResponseModel credlinkGstResponseModel;
    
    
    
	public String getTraceId() {
		return traceId;
	}
	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}
	
	public String getConsent() {
		return consent;
	}
	public void setConsent(String consent) {
		this.consent = consent;
	}
	public boolean isGstCertFlag() {
		return gstCertFlag;
	}
	public void setGstCertFlag(boolean gstCertFlag) {
		this.gstCertFlag = gstCertFlag;
	}
	
	public String getAdditionalContact() {
		return additionalContact;
	}
	public void setAdditionalContact(String additionalContact) {
		this.additionalContact = additionalContact;
	}
	public String getGstinList() {
		return gstinList;
	}
	public void setGstinList(String gstinList) {
		this.gstinList = gstinList;
	}
	public String getSimulateData() {
		return simulateData;
	}
	public void setSimulateData(String simulateData) {
		this.simulateData = simulateData;
	}
	public CredlinkGstResponseModel getCredlinkGstResponseModel() {
		return credlinkGstResponseModel;
	}
	public void setCredlinkGstResponseModel(CredlinkGstResponseModel credlinkGstResponseModel) {
		this.credlinkGstResponseModel = credlinkGstResponseModel;
	}
	public String getBusinessName() {
		return businessName;
	}
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	public String getRefId() {
		return refId;
	}
	public void setRefId(String refId) {
		this.refId = refId;
	}
	public String getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}
	
	
	public int getCredlinkReqId() {
		return credlinkReqId;
	}
	public void setCredlinkReqId(int credlinkReqId) {
		this.credlinkReqId = credlinkReqId;
	}
	
	
	public String getCallBackUrl() {
		return callBackUrl;
	}
	public void setCallBackUrl(String callBackUrl) {
		this.callBackUrl = callBackUrl;
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