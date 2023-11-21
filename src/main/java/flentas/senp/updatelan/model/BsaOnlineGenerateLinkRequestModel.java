package flentas.senp.updatelan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "log_bsaonline_generatelink_req",schema="senp_middleware_bsa")
public class BsaOnlineGenerateLinkRequestModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int generateLinkReqId;
	
	public String apiVersion;
	public String destination;
	public String loanAmount;
	public String loanDuration;
	public String loanType;
	public String transactionCompleteCallbackUrl;
	public String txnId;
	
	public String institutionId;
	public String form26ASDOB;
	public String incomeTaxDocuments1;
	public String incomeTaxDocuments2;
	public String acceptancePolicy;
	public String returnUrl;
	public String yearMonthFrom;
	public String yearMonthTo;
	public String facility;
	public String employmentType;
	public String sanctionLimitFixedAmount;
	public String sanctionLimitFixed;
    public String cif;
	public String lan;
	public String traceId;
	
	@OneToOne(mappedBy = "bsaOnlineGenerateLinkRequestModel")
	BsaOnlineGenerateLinkResponseModel bsaOnlineGenerateLinkResponseModel;
	
	public int getGenerateLinkReqId() {
		return generateLinkReqId;
	}

	public void setGenerateLinkReqId(int generateLinkReqId) {
		this.generateLinkReqId = generateLinkReqId;
	}

	public String getApiVersion() {
		return apiVersion;
	}

	public void setApiVersion(String apiVersion) {
		this.apiVersion = apiVersion;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(String loanAmount) {
		this.loanAmount = loanAmount;
	}

	public String getLoanDuration() {
		return loanDuration;
	}

	public void setLoanDuration(String loanDuration) {
		this.loanDuration = loanDuration;
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public String getTransactionCompleteCallbackUrl() {
		return transactionCompleteCallbackUrl;
	}

	public void setTransactionCompleteCallbackUrl(String transactionCompleteCallbackUrl) {
		this.transactionCompleteCallbackUrl = transactionCompleteCallbackUrl;
	}

	public String getTxnId() {
		return txnId;
	}

	public void setTxnId(String txnId) {
		this.txnId = txnId;
	}


	public String getInstitutionId() {
		return institutionId;
	}

	public void setInstitutionId(String institutionId) {
		this.institutionId = institutionId;
	}

	public String getForm26ASDOB() {
		return form26ASDOB;
	}

	public void setForm26ASDOB(String form26asdob) {
		form26ASDOB = form26asdob;
	}

	public String getIncomeTaxDocuments1() {
		return incomeTaxDocuments1;
	}

	public void setIncomeTaxDocuments1(String incomeTaxDocuments1) {
		this.incomeTaxDocuments1 = incomeTaxDocuments1;
	}

	public String getIncomeTaxDocuments2() {
		return incomeTaxDocuments2;
	}

	public void setIncomeTaxDocuments2(String incomeTaxDocuments2) {
		this.incomeTaxDocuments2 = incomeTaxDocuments2;
	}

	public String getAcceptancePolicy() {
		return acceptancePolicy;
	}

	public void setAcceptancePolicy(String acceptancePolicy) {
		this.acceptancePolicy = acceptancePolicy;
	}

	public String getReturnUrl() {
		return returnUrl;
	}

	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}

	public String getYearMonthFrom() {
		return yearMonthFrom;
	}

	public void setYearMonthFrom(String yearMonthFrom) {
		this.yearMonthFrom = yearMonthFrom;
	}

	public String getYearMonthTo() {
		return yearMonthTo;
	}

	public void setYearMonthTo(String yearMonthTo) {
		this.yearMonthTo = yearMonthTo;
	}

	public String getFacility() {
		return facility;
	}

	public void setFacility(String facility) {
		this.facility = facility;
	}

	public String getEmploymentType() {
		return employmentType;
	}

	public void setEmploymentType(String employmentType) {
		this.employmentType = employmentType;
	}

	public String getSanctionLimitFixedAmount() {
		return sanctionLimitFixedAmount;
	}

	public void setSanctionLimitFixedAmount(String sanctionLimitFixedAmount) {
		this.sanctionLimitFixedAmount = sanctionLimitFixedAmount;
	}

	public String getSanctionLimitFixed() {
		return sanctionLimitFixed;
	}

	public void setSanctionLimitFixed(String sanctionLimitFixed) {
		this.sanctionLimitFixed = sanctionLimitFixed;
	}

	public String getTraceId() {
		return traceId;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

	public BsaOnlineGenerateLinkResponseModel getBsaOnlineGenerateLinkResponseModel() {
		return bsaOnlineGenerateLinkResponseModel;
	}

	public void setBsaOnlineGenerateLinkResponseModel(
			BsaOnlineGenerateLinkResponseModel bsaOnlineGenerateLinkResponseModel) {
		this.bsaOnlineGenerateLinkResponseModel = bsaOnlineGenerateLinkResponseModel;
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
