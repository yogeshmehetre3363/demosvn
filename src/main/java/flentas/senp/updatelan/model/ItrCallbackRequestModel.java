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
@Table(name = "log_Itr_callback_req_master",schema="senp_middleware_itr")
@TypeDefs({ @TypeDef(name = "json", typeClass = JsonBinaryType.class) })
public class ItrCallbackRequestModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int callback_id;
	String perfiosTransactionId;
	String clientTransactionId;
	String status;
	String errorCode;
	String message;
	@Column(columnDefinition = "json")
	@Type(type = "json")
	String jsonReport;
	String lan_id;
	@Column(name = "triggerby")
	String user;
	String cif;
	
	
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

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	
	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

//	@Override
//	public String toString() {
//		return "ItrCallbackRequestModel [callback_id=" + callback_id + ", perfiosTransactionId=" + perfiosTransactionId
//				+ ", clientTransactionId=" + clientTransactionId + ", status=" + status + ", errorCode=" + errorCode
//				+ ", message=" + message + ", jsonReport=" + jsonReport + ", lan_id=" + lan_id + ", user=" + user
//				+ ", cif=" + cif + ", byteReport=" + byteReport + "]";
//	}

	

}
