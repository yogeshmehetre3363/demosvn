package flentas.senp.updatelan.model;

import java.sql.Timestamp;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.beans.factory.annotation.Autowired;


@Entity
@Table(name = "log_tb_itr_online_start_transaction_req_master",schema="senp_middleware_itr")
public class ItrOnlineStartTransactionRequestModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int itr_startTransaction_id;
	//@Size(min=1,max=64,message = "Please Enter the Client transaction Id less Than 64 character")
	public String clientTransactionId;
	public String transactionCompleteCallbackUrl;
	public String type;
	public String redirectionUrl;
	public String additionalParams;
	public String dob ;
	public String pan;
	public UUID traceId;
	public String lan;
	public String cif;

	@OneToOne(mappedBy = "itrOnlineStartTransactionRequest")
	ItrOnlineStartTransactionOptionalRequestModel itrOnlineStartTransactionOptionalrequest;
	@OneToOne(mappedBy = "itrOnlineStartTransactionRequest")
	ItrOnlineStartTransactionResponseModel itrOnlineStartTransactionResponse;

	public ItrOnlineStartTransactionOptionalRequestModel getItrStartTransactionOptionalrequest() {
		return itrOnlineStartTransactionOptionalrequest;
	}

	public void setItrStartTransactionOptionalrequest(
			ItrOnlineStartTransactionOptionalRequestModel itrStartTransactionOptionalrequest) {
		itrOnlineStartTransactionOptionalrequest = itrStartTransactionOptionalrequest;
	}

	public ItrOnlineStartTransactionResponseModel getItrStartTransactionResponse() {
		return itrOnlineStartTransactionResponse;
	}

	public void setItrStartTransactionResponse(ItrOnlineStartTransactionResponseModel itrStartTransactionResponse) {
		itrOnlineStartTransactionResponse = itrStartTransactionResponse;
	}

	public int getItr_startTransaction_id() {
		return itr_startTransaction_id;
	}

	public void setItr_startTransaction_id(int itr_startTransaction_id) {
		this.itr_startTransaction_id = itr_startTransaction_id;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public String getClientTransactionId() {
		return clientTransactionId;
	}

	public void setClientTransactionId(String clientTransactionId) {
		this.clientTransactionId = clientTransactionId;
	}

	public String getTransactionCompleteCallbackUrl() {
		return transactionCompleteCallbackUrl;
	}

	public void setTransactionCompleteCallbackUrl(String transactionCompleteCallbackUrl) {
		this.transactionCompleteCallbackUrl = transactionCompleteCallbackUrl;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRedirectionUrl() {
		return redirectionUrl;
	}

	public void setRedirectionUrl(String redirectionUrl) {
		this.redirectionUrl = redirectionUrl;
	}

	public String getAdditionalParams() {
		return additionalParams;
	}

	public void setAdditionalParams(String additionalParams) {
		this.additionalParams = additionalParams;
	}
	
	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public UUID getTraceId() {
		return traceId;
	}

	public void setTraceId(UUID traceId) {
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

	public ItrOnlineStartTransactionOptionalRequestModel getItrOnlineStartTransactionOptionalrequest() {
		return itrOnlineStartTransactionOptionalrequest;
	}

	public void setItrOnlineStartTransactionOptionalrequest(
			ItrOnlineStartTransactionOptionalRequestModel itrOnlineStartTransactionOptionalrequest) {
		this.itrOnlineStartTransactionOptionalrequest = itrOnlineStartTransactionOptionalrequest;
	}

	public ItrOnlineStartTransactionResponseModel getItrOnlineStartTransactionResponse() {
		return itrOnlineStartTransactionResponse;
	}

	public void setItrOnlineStartTransactionResponse(
			ItrOnlineStartTransactionResponseModel itrOnlineStartTransactionResponse) {
		this.itrOnlineStartTransactionResponse = itrOnlineStartTransactionResponse;
	}

	
}
