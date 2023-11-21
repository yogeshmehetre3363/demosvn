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
//import org.json.simple.JSONObject;

import com.vladmihalcea.hibernate.type.array.ListArrayType;
import com.vladmihalcea.hibernate.type.json.JsonBinaryType;

@Entity
@Table(name = "log_Itr_Start_Transaction_res",schema="senp_middleware_itr")
@TypeDefs({ @TypeDef(name = "json", typeClass = JsonBinaryType.class) })
public class ItrStartTransactionResponseModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int itrTransactionResId;
	public String status;
	public String message;
	public int statusCode;
	public String transactionId;
	public String Url;
	public String code;
	public String traceId;
	public String lan_id;
	public String cif;
	@Column(name="triggerby")
	public String user;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "itr_starttransaction_req")
	ItrStartTransactionRequestModel ItrStartTransactionRequest;

	
	
	
	
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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getUrl() {
		return Url;
	}

	public void setUrl(String url) {
		Url = url;
	}

	public int getItrTransactionResId() {
		return itrTransactionResId;
	}

	public void setItrTransactionResId(int itrTransactionResId) {
		this.itrTransactionResId = itrTransactionResId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public ItrStartTransactionRequestModel getItrStartTransactionRequest() {
		return ItrStartTransactionRequest;
	}

	public void setItrStartTransactionRequest(ItrStartTransactionRequestModel itrStartTransactionRequest) {
		ItrStartTransactionRequest = itrStartTransactionRequest;
	}

//	@Override
//	public String toString() {
//		return "ItrStartTransactionResponseModel [itrTransactionResId=" + itrTransactionResId + ", status=" + status
//				+ ", message=" + message + ", statusCode=" + statusCode + ", transactionId=" + transactionId + ", Url="
//				+ Url + ", code=" + code + ", traceId=" + traceId + ", lan_id=" + lan_id + ", cif=" + cif + ", user="
//				+ user + ", ItrStartTransactionRequest=" + ItrStartTransactionRequest + "]";
//	}



}
