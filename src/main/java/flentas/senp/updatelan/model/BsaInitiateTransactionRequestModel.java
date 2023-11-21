package flentas.senp.updatelan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;




@Entity
@Table(name = "log_Bsa_initiateTransaction_req",schema="senp_middleware_bsa")
public class BsaInitiateTransactionRequestModel {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		int initiateTransactionReqId;
		
		public String loanAmount;
		public String loanDuration;
		public String loanType;
		public String processingType;
		public String transactionCompleteCallbackUrl;
		public String txnId;
		public String acceptancePolicy;
		public String institutionId;
		public String uploadingScannedStatements;
		public String yearMonthFrom;
		public String yearMonthTo;
		public String employmentType;
		
		public String traceId;
		
		public String lan;
		public String cif;
		
		@OneToOne(mappedBy = "bsaInitiateTransactionRequestModel")
	    BsaInitiateTransactionResponseModel bsaInitiateTransactionResponseModel;
		
		public int getInitiateTransactionReqId() {
			return initiateTransactionReqId;
		}
		public void setInitiateTransactionReqId(int initiateTransactionReqId) {
			this.initiateTransactionReqId = initiateTransactionReqId;
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
		public String getProcessingType() {
			return processingType;
		}
		public void setProcessingType(String processingType) {
			this.processingType = processingType;
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
		public String getAcceptancePolicy() {
			return acceptancePolicy;
		}
		public void setAcceptancePolicy(String acceptancePolicy) {
			this.acceptancePolicy = acceptancePolicy;
		}
		public String getInstitutionId() {
			return institutionId;
		}
		public void setInstitutionId(String institutionId) {
			this.institutionId = institutionId;
		}
		public String getUploadingScannedStatements() {
			return uploadingScannedStatements;
		}
		public void setUploadingScannedStatements(String uploadingScannedStatements) {
			this.uploadingScannedStatements = uploadingScannedStatements;
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
		public String getEmploymentType() {
			return employmentType;
		}
		public void setEmploymentType(String employmentType) {
			this.employmentType = employmentType;
		}
		
		
		public BsaInitiateTransactionResponseModel getBsaInitiateTransactionResponseModel() {
			return bsaInitiateTransactionResponseModel;
		}
		public void setBsaInitiateTransactionResponseModel(
				BsaInitiateTransactionResponseModel bsaInitiateTransactionResponseModel) {
			this.bsaInitiateTransactionResponseModel = bsaInitiateTransactionResponseModel;
		}
		public String getTraceId() {
			return traceId;
		}
		public void setTraceId(String traceId) {
			this.traceId = traceId;
		}
		
		
		public String getLan() {
			return lan;
		}
		public void setLan(String lan) {
			this.lan = lan;
		}
		public String getCif() {
			return cif;
		}
		public void setCif(String cif) {
			this.cif = cif;
		}
	
		
	

}
