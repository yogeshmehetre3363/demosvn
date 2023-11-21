package flentas.senp.updatelan.model;

import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;
import org.hibernate.type.ListType;

import com.vladmihalcea.hibernate.type.array.ListArrayType;

@Entity
@Table(name = "log_tb_itr_online_start_transaction_req_optional",schema="senp_middleware_itr")
@TypeDefs({ @TypeDef(name = "list-array", typeClass = ListArrayType.class) })
public class ItrOnlineStartTransactionOptionalRequestModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int itr_startTransaction_optional_id;
	public boolean fetchITR;
	public boolean fetchITRV;
	public boolean fetchForm26AS;
	public int noOfYearsForITR;
	public int noOfYearsForForm26AS;
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

	public ItrOnlineStartTransactionRequestModel getItrStartTransactionRequest() {
		return itrOnlineStartTransactionRequest;
	}

	public void setItrStartTransactionRequest(ItrOnlineStartTransactionRequestModel itrOnlinereqModel) {
		itrOnlineStartTransactionRequest = itrOnlinereqModel;
	}

	public int getItr_startTransaction_optional_id() {
		return itr_startTransaction_optional_id;
	}

	public void setItr_startTransaction_optional_id(int itr_startTransaction_optional_id) {
		this.itr_startTransaction_optional_id = itr_startTransaction_optional_id;
	}

	public boolean isFetchITR() {
		return fetchITR;
	}

	public void setFetchITR(boolean fetchITR) {
		this.fetchITR = fetchITR;
	}

	public boolean isFetchITRV() {
		return fetchITRV;
	}

	public void setFetchITRV(boolean fetchITRV) {
		this.fetchITRV = fetchITRV;
	}

	public boolean isFetchForm26AS() {
		return fetchForm26AS;
	}

	public void setFetchForm26AS(boolean fetchForm26AS) {
		this.fetchForm26AS = fetchForm26AS;
	}

	public int getNoOfYearsForITR() {
		return noOfYearsForITR;
	}

	public void setNoOfYearsForITR(int noOfYearsForITR) {
		this.noOfYearsForITR = noOfYearsForITR;
	}

	public int getNoOfYearsForForm26AS() {
		return noOfYearsForForm26AS;
	}

	public void setNoOfYearsForForm26AS(int noOfYearsForForm26AS) {
		this.noOfYearsForForm26AS = noOfYearsForForm26AS;
	}

	@Override
	public String toString() {
		return "ItrOnlineStartTransactionOptionalRequestModel [itr_startTransaction_optional_id="
				+ itr_startTransaction_optional_id + ", fetchITR=" + fetchITR + ", fetchITRV=" + fetchITRV
				+ ", fetchForm26AS=" + fetchForm26AS + ", noOfYearsForITR=" + noOfYearsForITR
				+ ", noOfYearsForForm26AS=" + noOfYearsForForm26AS + ", ItrStartTransactionRequest="
				+ itrOnlineStartTransactionRequest + "]";
	}

}
