package flentas.senp.updatelan.model;

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

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import com.vladmihalcea.hibernate.type.array.ListArrayType;
import com.vladmihalcea.hibernate.type.json.JsonBinaryType;

@Entity
@Table(name = "log_tb_itr_online_start_transaction_res",schema="senp_middleware_itr")
@TypeDefs({ @TypeDef(name = "list-array", typeClass = ListArrayType.class) })
public class ItrOnlineStartTransactionResponseModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int itr_online_res_TransactionResId;
	public String status;
	public String message;
	public int statusCode;
	public String transactionId;
	public String Url;
	public String code;
	public String lan;
	public String cif;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "itr_starttransaction_req")
	ItrOnlineStartTransactionRequestModel itrOnlineStartTransactionRequest;
	public UUID traceId;
	

	public UUID getTraceId() {
		return traceId;
	}

	public void setTraceId(UUID traceId) {
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
		return itr_online_res_TransactionResId;
	}

	public void setItrTransactionResId(int itrTransactionResId) {
		this.itr_online_res_TransactionResId = itrTransactionResId;
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

	public ItrOnlineStartTransactionRequestModel getItrStartTransactionRequest() {
		return itrOnlineStartTransactionRequest;
	}

	public void setItrStartTransactionRequest(ItrOnlineStartTransactionRequestModel itrOnlinereqModel) {
		itrOnlineStartTransactionRequest = itrOnlinereqModel;
	}

	public int getItr_online_res_TransactionResId() {
		return itr_online_res_TransactionResId;
	}

	public void setItr_online_res_TransactionResId(int itr_online_res_TransactionResId) {
		this.itr_online_res_TransactionResId = itr_online_res_TransactionResId;
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

	public ItrOnlineStartTransactionRequestModel getItrOnlineStartTransactionRequest() {
		return itrOnlineStartTransactionRequest;
	}

	public void setItrOnlineStartTransactionRequest(
			ItrOnlineStartTransactionRequestModel itrOnlineStartTransactionRequest) {
		this.itrOnlineStartTransactionRequest = itrOnlineStartTransactionRequest;
	}

	

}
