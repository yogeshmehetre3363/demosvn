package flentas.senp.updatelan.dto;

import java.util.List;

import javax.persistence.Column;

import org.springframework.stereotype.Component;

@Component
public class ItrStartTransactionOptionalParamDto {
	public String acceptancePolicyEnabled;
	public List<String> mandatoryDocumentTypes;
	public String latestYearFilesRequired;
	public int minAllowedYearsForItrv;
	public int minAllowedYearsForItr;
	public int minAllowedYearsForForm26as;
	public int minAllowedYearsForForm16;
	// This Years are in Assessment Year format.
	public List<String> itrvYearsList;
	public List<String> itrYearsList;
	public List<String> form26asYearsList;
	public List<String> form16YearsList;

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
		return "ItrStartTransactionOptionalParam [acceptancePolicyEnabled=" + acceptancePolicyEnabled
				+ ", mandatoryDocumentTypes=" + mandatoryDocumentTypes + ", latestYearFilesRequired="
				+ latestYearFilesRequired + ", minAllowedYearsForItrv=" + minAllowedYearsForItrv
				+ ", minAllowedYearsForItr=" + minAllowedYearsForItr + ", minAllowedYearsForForm26as="
				+ minAllowedYearsForForm26as + ", minAllowedYearsForForm16=" + minAllowedYearsForForm16
				+ ", itrvYearsList=" + itrvYearsList + ", itrYearsList=" + itrYearsList + ", form26asYearsList="
				+ form26asYearsList + ", form16YearsList=" + form16YearsList + "]";
	}
}
