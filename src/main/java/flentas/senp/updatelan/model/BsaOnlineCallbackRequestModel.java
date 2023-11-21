package flentas.senp.updatelan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;

@Entity
@Table(name = "log_BsaOnline_callback_req",schema="senp_middleware_bsa")
@TypeDefs({ @TypeDef(name = "json", typeClass = JsonBinaryType.class) })
public class BsaOnlineCallbackRequestModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int callback_id;
	
	String perfiosTransactionId;
	String clientTransactionId;
	String status;
	String errorCode;
	String errorMessage;
	String incomeTaxDocumentsFetched;
	String errorDetailsForITFetchFailure;
	String lan;
	String cif;
	
	@Column(columnDefinition = "json")
	@Type(type = "json")
	String jsonReport;
	
	String byteReport;

	public int getCallback_id() {
		return callback_id;
	}

	public void setCallback_id(int callback_id) {
		this.callback_id = callback_id;
	}

	public String getPerfiosTransactionId() {
		return perfiosTransactionId;
	}

	public void setPerfiosTransactionId(String perfiosTransactionId) {
		this.perfiosTransactionId = perfiosTransactionId;
	}

	public String getClientTransactionId() {
		return clientTransactionId;
	}

	public void setClientTransactionId(String clientTransactionId) {
		this.clientTransactionId = clientTransactionId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getIncomeTaxDocumentsFetched() {
		return incomeTaxDocumentsFetched;
	}

	public void setIncomeTaxDocumentsFetched(String incomeTaxDocumentsFetched) {
		this.incomeTaxDocumentsFetched = incomeTaxDocumentsFetched;
	}

	public String getErrorDetailsForITFetchFailure() {
		return errorDetailsForITFetchFailure;
	}

	public void setErrorDetailsForITFetchFailure(String errorDetailsForITFetchFailure) {
		this.errorDetailsForITFetchFailure = errorDetailsForITFetchFailure;
	}

	public String getJsonReport() {
		return jsonReport;
	}

	public void setJsonReport(String jsonReport) {
		this.jsonReport = jsonReport;
	}

	public String getByteReport() {
		return byteReport;
	}

	public void setByteReport(String byteReport) {
		this.byteReport = byteReport;
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
