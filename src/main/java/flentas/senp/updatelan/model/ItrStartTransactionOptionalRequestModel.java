package flentas.senp.updatelan.model;

import java.util.List;

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
@Table(name = "log_Itr_Start_Transaction_req_optional",schema="senp_middleware_itr")
@TypeDefs({ @TypeDef(name = "list-array", typeClass = ListArrayType.class) })
public class ItrStartTransactionOptionalRequestModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int itr_startTransaction_optional_id;
	public String acceptancePolicyEnabled;
	@Type(type = "list-array")
	@Column(name = "mandatoryDocumentTypes", columnDefinition = "text[]")
	public List<String> mandatoryDocumentTypes;
	public String latestYearFilesRequired;
	public int minAllowedYearsForItrv;
	public int minAllowedYearsForItr;
	public int minAllowedYearsForForm26as;
	public int minAllowedYearsForForm16;
	@Type(type = "list-array")
	@Column(name = "itrvYearsList", columnDefinition = "text[]")
	public List<String> itrvYearsList;
	@Type(type = "list-array")
	@Column(name = "itrYearsList", columnDefinition = "text[]")
	public List<String> itrYearsList;
	@Type(type = "list-array")
	@Column(name = "form26asYearsList", columnDefinition = "text[]")
	public List<String> form26asYearsList;
	@Type(type = "list-array")
	@Column(name = "form16YearsList", columnDefinition = "text[]")
	public List<String> form16YearsList;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "itr_starttransaction_req")
	ItrStartTransactionRequestModel ItrStartTransactionRequest;
    public String traceId;
    
    
    
	public String getTraceId() {
		return traceId;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

	public ItrStartTransactionRequestModel getItrStartTransactionRequest() {
		return ItrStartTransactionRequest;
	}

	public void setItrStartTransactionRequest(ItrStartTransactionRequestModel itrStartTransactionRequest) {
		ItrStartTransactionRequest = itrStartTransactionRequest;
	}

	public int getItr_startTransaction_optional_id() {
		return itr_startTransaction_optional_id;
	}

	public void setItr_startTransaction_optional_id(int itr_startTransaction_optional_id) {
		this.itr_startTransaction_optional_id = itr_startTransaction_optional_id;
	}

	public String getAcceptancePolicyEnabled() {
		return acceptancePolicyEnabled;
	}

	public void setAcceptancePolicyEnabled(String acceptancePolicyEnabled) {
		this.acceptancePolicyEnabled = acceptancePolicyEnabled;
	}

	public List<String> getMandatoryDocumentTypes() {
		return mandatoryDocumentTypes;
	}

	public void setMandatoryDocumentTypes(List<String> mandatoryDocumentTypes) {
		this.mandatoryDocumentTypes = mandatoryDocumentTypes;
	}

	public String getLatestYearFilesRequired() {
		return latestYearFilesRequired;
	}

	public void setLatestYearFilesRequired(String latestYearFilesRequired) {
		this.latestYearFilesRequired = latestYearFilesRequired;
	}

	public int getMinAllowedYearsForItrv() {
		return minAllowedYearsForItrv;
	}

	public void setMinAllowedYearsForItrv(int minAllowedYearsForItrv) {
		this.minAllowedYearsForItrv = minAllowedYearsForItrv;
	}

	public int getMinAllowedYearsForItr() {
		return minAllowedYearsForItr;
	}

	public void setMinAllowedYearsForItr(int minAllowedYearsForItr) {
		this.minAllowedYearsForItr = minAllowedYearsForItr;
	}

	public int getMinAllowedYearsForForm26as() {
		return minAllowedYearsForForm26as;
	}

	public void setMinAllowedYearsForForm26as(int minAllowedYearsForForm26as) {
		this.minAllowedYearsForForm26as = minAllowedYearsForForm26as;
	}

	public int getMinAllowedYearsForForm16() {
		return minAllowedYearsForForm16;
	}

	public void setMinAllowedYearsForForm16(int minAllowedYearsForForm16) {
		this.minAllowedYearsForForm16 = minAllowedYearsForForm16;
	}

	public List<String> getItrvYearsList() {
		return itrvYearsList;
	}

	public void setItrvYearsList(List<String> itrvYearsList) {
		this.itrvYearsList = itrvYearsList;
	}

	public List<String> getItrYearsList() {
		return itrYearsList;
	}

	public void setItrYearsList(List<String> itrYearsList) {
		this.itrYearsList = itrYearsList;
	}

	public List<String> getForm26asYearsList() {
		return form26asYearsList;
	}

	public void setForm26asYearsList(List<String> form26asYearsList) {
		this.form26asYearsList = form26asYearsList;
	}

	public List<String> getForm16YearsList() {
		return form16YearsList;
	}

	public void setForm16YearsList(List<String> form16YearsList) {
		this.form16YearsList = form16YearsList;
	}

	@Override
	public String toString() {
		return "ItrStartTransactionOptionalrequest [itr_startTransaction_optional_id="
				+ itr_startTransaction_optional_id + ", acceptancePolicyEnabled=" + acceptancePolicyEnabled
				+ ", mandatoryDocumentTypes=" + mandatoryDocumentTypes + ", latestYearFilesRequired="
				+ latestYearFilesRequired + ", minAllowedYearsForItrv=" + minAllowedYearsForItrv
				+ ", minAllowedYearsForItr=" + minAllowedYearsForItr + ", minAllowedYearsForForm26as="
				+ minAllowedYearsForForm26as + ", minAllowedYearsForForm16=" + minAllowedYearsForForm16
				+ ", itrvYearsList=" + itrvYearsList + ", itrYearsList=" + itrYearsList + ", form26asYearsList="
				+ form26asYearsList + ", form16YearsList=" + form16YearsList + ", ItrStartTransactionRequest="
				+ ItrStartTransactionRequest + "]";
	}

}
