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

import org.springframework.beans.factory.annotation.Autowired;

import flentas.senp.updatelan.dto.ItrStartTransactionOptionalParamDto;

@Entity
@Table(name = "log_Itr_Start_Transaction_req_master",schema="senp_middleware_itr")
public class ItrStartTransactionRequestModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int itr_startTransaction_id;
	public String clientTransactionId;
	public String transactionCompleteUrl;
	public String type;
	public String redirectionUrl;
	public String additionalParams;
	public String scanned;
	public String pan;
	public String traceId;
	public String lan_id;
	public String cif;
	@Column(name="triggerby")
	public String user;
	@OneToOne(mappedBy = "ItrStartTransactionRequest")
	ItrStartTransactionOptionalRequestModel ItrStartTransactionOptionalrequest;
	@OneToOne(mappedBy = "ItrStartTransactionRequest")
	ItrStartTransactionResponseModel ItrStartTransactionResponse;

	
	
	
	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	public String getLan_id() {
		return lan_id;
	}

	public void setLan_id(String lan_id) {
		this.lan_id = lan_id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getTraceId() {
		return traceId;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

	public ItrStartTransactionOptionalRequestModel getItrStartTransactionOptionalrequest() {
		return ItrStartTransactionOptionalrequest;
	}

	public void setItrStartTransactionOptionalrequest(
			ItrStartTransactionOptionalRequestModel itrStartTransactionOptionalrequest) {
		ItrStartTransactionOptionalrequest = itrStartTransactionOptionalrequest;
	}

	public ItrStartTransactionResponseModel getItrStartTransactionResponse() {
		return ItrStartTransactionResponse;
	}

	public void setItrStartTransactionResponse(ItrStartTransactionResponseModel itrStartTransactionResponse) {
		ItrStartTransactionResponse = itrStartTransactionResponse;
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

	public String getTransactionCompleteUrl() {
		return transactionCompleteUrl;
	}

	public void setTransactionCompleteUrl(String transactionCompleteUrl) {
		this.transactionCompleteUrl = transactionCompleteUrl;
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

	public String getScanned() {
		return scanned;
	}

	public void setScanned(String scanned) {
		this.scanned = scanned;
	}

//	@Override
//	public String toString() {
//		return "ItrStartTransactionRequestModel [itr_startTransaction_id=" + itr_startTransaction_id
//				+ ", clientTransactionId=" + clientTransactionId + ", transactionCompleteUrl=" + transactionCompleteUrl
//				+ ", type=" + type + ", redirectionUrl=" + redirectionUrl + ", additionalParams=" + additionalParams
//				+ ", scanned=" + scanned + ", pan=" + pan + ", traceId=" + traceId + ", lan_id=" + lan_id + ", cif="
//				+ cif + ", user=" + user + ", ItrStartTransactionOptionalrequest=" + ItrStartTransactionOptionalrequest
//				+ ", ItrStartTransactionResponse=" + ItrStartTransactionResponse + "]";
//	}



}
