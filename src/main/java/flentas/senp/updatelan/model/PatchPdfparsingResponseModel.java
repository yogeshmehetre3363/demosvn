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

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;

@Entity
@Table(name = "log_gst_patchPdfParsing_response")
@TypeDef(name = "json", typeClass = JsonBinaryType.class)
public class PatchPdfparsingResponseModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int patchPdfResId;
	public String lan;
	@Column(name = "triggerby")
	public String user;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "patchPdfReqId")
	PatchPdfparsingRequestModel patchPdfparsingRequestModel;

	int responseStatusCode;
	String responseStatus;
	public String traceId;
	public String requestId;
	public String result;
	// result_current Object
	@Type(type = "json")
	@Column(name = "result_current_itcCredit", columnDefinition = "jsonb")
	public String result_current_itcCredit;

	// current gstr3b
	@Type(type = "json")
	@Column(name = "result_current_gstr3b_details", columnDefinition = "jsonb")
	public String result_current_gstr3b_details;

	@Type(type = "json")
	@Column(name = "result_current_gstr3b_total_supDetails", columnDefinition = "jsonb")
	public String result_current_gstr3b_total_supDetails;

	@Type(type = "json")
	@Column(name = "result_current_gstr3b_total_itcElg", columnDefinition = "jsonb")
	public String result_current_gstr3b_total_itcElg;

	@Type(type = "json")
	@Column(name = "result_current_gstr3b_total_liabBreakup", columnDefinition = "jsonb")
	public String result_current_gstr3b_total_liabBreakup;

	public int result_current_gstr3b_total_liabBreakupTotal;

	@Type(type = "json")
	@Column(name = "result_current_gstr3b_total_intrLtfee", columnDefinition = "jsonb")
	public String result_current_gstr3b_total_intrLtfee;

	@Type(type = "json")
	@Column(name = "result_current_gstr3b_total_ttVal", columnDefinition = "jsonb")
	public String result_current_gstr3b_total_ttVal;

	public int result_current_gstr3b_total_itcInelgTotal;
	public double result_current_gstr3b_total_itcAvlTotal;
	public int result_current_gstr3b_total_itcRevTotal;
	public double result_current_gstr3b_total_itcNetTotal;
	public double result_current_gstr3b_total_ttlTaxPayable;
	public int result_current_gstr3b_total_itcAvlByGstr2a;

	@Type(type = "json")
	@Column(name = "result_current_gstr3b_total_interSup_uinDetails", columnDefinition = "jsonb")
	public String result_current_gstr3b_total_interSup_uinDetails;

	@Type(type = "json")
	@Column(name = "result_current_gstr3b_total_interSup_uinSummary", columnDefinition = "jsonb")
	public String result_current_gstr3b_total_interSup_uinSummary;

	@Type(type = "json")
	@Column(name = "result_current_gstr3b_total_interSup_compDetails", columnDefinition = "jsonb")
	public String result_current_gstr3b_total_interSup_compDetails;

	@Type(type = "json")
	@Column(name = "result_current_gstr3b_total_interSup_compSummary", columnDefinition = "jsonb")
	public String result_current_gstr3b_total_interSup_compSummary;

	@Type(type = "json")
	@Column(name = "result_current_gstr3b_total_interSup_unregDetails", columnDefinition = "jsonb")
	public String result_current_gstr3b_total_interSup_unregDetails;

	// current gstr1
	@Type(type = "json")
	@Column(name = "result_current_gstr3b_total", columnDefinition = "jsonb")
	public String result_current_gstr3b_total;

	@Type(type = "json")
	@Column(name = "result_current_gstr1_details", columnDefinition = "jsonb")
	public String result_current_gstr1_details;

	@Type(type = "json")
	@Column(name = "result_current_gstr1_total_secSum", columnDefinition = "jsonb")
	public String result_current_gstr1_total_secSum;

	@Type(type = "json")
	@Column(name = "result_current_gstr1_total_cptySum", columnDefinition = "jsonb")
	public String result_current_gstr1_total_cptySum;

	@Type(type = "json")
	@Column(name = "result_current_gstr1_total_stateWise", columnDefinition = "jsonb")
	public String result_current_gst1_total_stateWise;

	@Type(type = "json")
	@Column(name = "result_current_gstr1_total_hsnWise", columnDefinition = "jsonb")
	public String result_current_gstr1_total_hsnWise;

	@Type(type = "json")
	@Column(name = "result_current_averages", columnDefinition = "jsonb")
	public String result_current_averages;

	// avg split
	public String result_current_averages_avgmonthtax;
	public String result_current_averages_avgmonthval;
	public String result_current_averages_avgttltaxinv;
	public String result_current_averages_avgttlvalinv;
	public String result_current_averages_avginvcust;
	public String result_current_averages_avgttltaxcust;
	public String result_current_averages_avgttlvalcust;

	@Type(type = "json")
	@Column(name = "result_current_top10cus", columnDefinition = "jsonb")
	public String result_current_top10cus;

	@Type(type = "json")
	@Column(name = "result_current_monthWiseSummary", columnDefinition = "jsonb")
	public String result_current_monthWiseSummary;

	public String result_current_transactionSummary_periodFrom;
	public String result_current_transactionSummary_periodTo;
	public int result_current_transactionSummary_ttlInv;
	public int result_current_transactionSummary_payable;
	public int result_current_transactionSummary_lateFee;
	public double result_current_transactionSummary_ttlIntr;
	public double result_current_transactionSummary_sysInt;

	@Type(type = "json")
	@Column(name = "result_current_transactionSummary_turnover", columnDefinition = "jsonb")
	public String result_current_transactionSummary_turnover;

	@Type(type = "json")
	@Column(name = "result_current_transactionSummary_payment", columnDefinition = "jsonb")
	public String result_current_transactionSummary_payment;

	@Type(type = "json")
	@Column(name = "result_current_transactionSummary_totalTaxLiability", columnDefinition = "jsonb")
	public String result_current_transactionSummary_totalTaxLiability;

	@Type(type = "json")
	@Column(name = "result_current_filingStatus", columnDefinition = "jsonb")
	public String result_current_filingStatus;

	@Type(type = "json")
	@Column(name = "result_current_filingFrequency", columnDefinition = "jsonb")
	public String result_current_filingFrequency;

	@Type(type = "json")
	@Column(name = "result_current_top10sup", columnDefinition = "jsonb")
	public String result_current_top10sup;

	@Type(type = "json")
	@Column(name = "result_current_salesStateWise", columnDefinition = "jsonb")
	public String result_current_salesStateWise;

	@Type(type = "json")
	@Column(name = "result_current_salesCptySum", columnDefinition = "jsonb")
	public String result_current_salesCptySum;

	@Type(type = "json")
	@Column(name = "result_current_salesHsnWise", columnDefinition = "jsonb")
	public String result_current_salesHsnWise;

	@Type(type = "json")
	@Column(name = "result_current_salesCategoryWise", columnDefinition = "jsonb")
	public String result_current_salesCategoryWise;

	@Type(type = "json")
	@Column(name = "result_current_purchasesStateWise", columnDefinition = "jsonb")
	public String result_current_purchasesStateWise;

	@Type(type = "json")
	@Column(name = "result_current_purchasesCptySum", columnDefinition = "jsonb")
	public String result_current_purchasesCptySum;

	@Type(type = "json")
	@Column(name = "result_current_purchasesHsnWise", columnDefinition = "jsonb")
	public String result_current_purchasesHsnWise;

	@Type(type = "json")
	@Column(name = "result_current_purchasesCategoryWise", columnDefinition = "jsonb")
	public String result_current_purchasesCategoryWise;

	@Type(type = "json")
	@Column(name = "result_current_gstr4_details", columnDefinition = "jsonb")
	public String result_current_gstr4_details;

	@Type(type = "json")
	@Column(name = "result_current_gstr4_total_dbtdtl", columnDefinition = "jsonb")
	public String result_current_gstr4_total_dbtdtl;

	@Type(type = "json")
	@Column(name = "result_current_gstr4_total_totalLiabilityPayable", columnDefinition = "jsonb")
	public String result_current_gstr4_total_totalLiabilityPayable;

	@Type(type = "json")
	@Column(name = "result_current_gstr4_total_stateWise", columnDefinition = "jsonb")
	public String result_current_gstr4_total_stateWise;

	@Type(type = "json")
	@Column(name = "result_current_gstr4_total_liabdtlNonrev", columnDefinition = "jsonb")
	public String result_current_gstr4_total_liabdtlNonrev;

	@Type(type = "json")
	@Column(name = "result_current_gstr4_total_secSum", columnDefinition = "jsonb")
	public String result_current_gstr4_total_secSum;

	@Type(type = "json")
	@Column(name = "result_current_gstr4_total_hsnWise", columnDefinition = "jsonb")
	public String result_current_gstr4_total_hsnWise;

	@Type(type = "json")
	@Column(name = "result_current_gstr4_total_liabdtlRev", columnDefinition = "jsonb")
	public String result_current_gstr4_total_liabdtlRev;

	@Type(type = "json")
	@Column(name = "result_current_gstr4_total_cptySum", columnDefinition = "jsonb")
	public String result_current_gstr4_total_cptySum;

	@Type(type = "json")
	@Column(name = "result_current_gstr2a", columnDefinition = "jsonb")
	public String result_current_gstr2a;

	@Type(type = "json")
	@Column(name = "result_current_gstr4a_details", columnDefinition = "jsonb")
	public String result_current_gstr4a_details;

	@Type(type = "json")
	@Column(name = "result_current_gstr4a_total_secSum", columnDefinition = "jsonb")
	public String result_current_gstr4a_total_secSum;

	@Type(type = "json")
	@Column(name = "result_current_gstr4a_total_hsnWise", columnDefinition = "jsonb")
	public String result_current_gstr4a_total_hsnWise;

	@Type(type = "json")
	@Column(name = "result_current_gstr4a_total_stateWise", columnDefinition = "jsonb")
	public String result_current_gstr4a_total_stateWise;

	@Type(type = "json")
	@Column(name = "result_current_gstr4a_total_cptySum", columnDefinition = "jsonb")
	public String result_current_gstr4a_total_cptyWise;

	public String result_current_financialYear;

	@Type(type = "json")
	@Column(name = "result_current_businessSummary", columnDefinition = "jsonb")
	public String result_current_businessSummary;

	@Type(type = "json")
	@Column(name = "result_current_turnoverAndCustomers", columnDefinition = "jsonb")
	public String result_current_turnoverAndCustomers;

	@Type(type = "json")
	@Column(name = "result_current_quarterlySummary_total", columnDefinition = "jsonb")
	public String result_current_quarterlySummary_total;

	// split quaterlery summary of current total
	@Type(type = "json")
	@Column(name = "result_current_quarterlySummary_total_gstr1", columnDefinition = "jsonb")
	public String result_current_quarterlySummary_total_gstr1;

	@Type(type = "json")
	@Column(name = "result_current_quarterlySummary_total_gstr2a", columnDefinition = "jsonb")
	public String result_current_quarterlySummary_total_gstr2a;

	@Type(type = "json")
	@Column(name = "result_current_quarterlySummary_total_gstr3b", columnDefinition = "jsonb")
	public String result_current_quarterlySummary_total_gstr3b;

	// end of quaterly summary

	@Type(type = "json")
	@Column(name = "result_current_quarterlySummary_quarter1", columnDefinition = "jsonb")
	public String result_current_quarterlySummary_quarter1;

	// split of quarter 1

	public String result_current_quarterlySummary_quarter1_periodFrom;
	public String result_current_quarterlySummary_quarter1_periodTo;

	@Type(type = "json")
	@Column(name = "result_current_quarterlySummary_quarter1_months", columnDefinition = "jsonb")
	public String result_current_quarterlySummary_quarter1_months;

	@Type(type = "json")
	@Column(name = "result_current_quarterlySummary_quarter1_totalGstr1", columnDefinition = "jsonb")
	public String result_current_quarterlySummary_quarter1_totalGstr1;

	@Type(type = "json")
	@Column(name = "result_current_quarterlySummary_quarter1_totalGstr2a", columnDefinition = "jsonb")
	public String result_current_quarterlySummary_quarter1_totalGstr2a;

	@Type(type = "json")
	@Column(name = "result_current_quarterlySummary_quarter1_totalGstr3b", columnDefinition = "jsonb")
	public String result_current_quarterlySummary_quarter1_totalGstr3b;

	// end of quarter 1
	@Type(type = "json")
	@Column(name = "result_current_total_totalSalesCategoryWise", columnDefinition = "jsonb")
	public String result_current_total_totalSalesCategoryWise;

	@Type(type = "json")
	@Column(name = "result_current_total_totalSalesCptySum", columnDefinition = "jsonb")
	public String result_current_total_totalSalesCptySum;

	@Type(type = "json")
	@Column(name = "result_current_total_totalPurchasesCptySum", columnDefinition = "jsonb")
	public String result_current_total_totalPurchasesCptySum;

	@Type(type = "json")
	@Column(name = "result_current_total_totalSalesStateWise", columnDefinition = "jsonb")
	public String result_current_total_totalSalesStateWise;

	@Type(type = "json")
	@Column(name = "result_current_total_totalPurchasesStateWise", columnDefinition = "jsonb")
	public String result_current_total_totalPurchasesStateWise;

	@Type(type = "json")
	@Column(name = "result_current_total_totalSalesHsnWise", columnDefinition = "jsonb")
	public String result_current_total_totalSalesHsnWise;

	@Type(type = "json")
	@Column(name = "result_current_total_totalPurchasesHsnWise", columnDefinition = "jsonb")
	public String result_current_total_totalPurchasesHsnWise;

	@Type(type = "json")
	@Column(name = "result_current_total_totalPurchasesCategoryWise", columnDefinition = "jsonb")
	public String result_current_total_totalPurchasesCategoryWise;

	@Type(type = "json")
	@Column(name = "result_current_complianceCheck", columnDefinition = "jsonb")
	public String result_current_complianceCheck;

	@Type(type = "json")
	@Column(name = "result_current_cagr", columnDefinition = "jsonb")
	public String result_current_cagr;

	@Type(type = "json")
	@Column(name = "result_current_cyclicTransactions", columnDefinition = "jsonb")
	public String result_current_cyclicTransactions;

	// End of result_current Object
	// Normal objects response
	@Column(name = "result_gstIn")
	public String gstIn;
	@Column(name = "result_reportType")
	public String reportType;
	@Column(name = "result_pdfCount")
	public int pdfCount;
	@Column(name = "result_Version")
	public String Version;
	@Column(name = "result_pdfDownloadLink")
	public String pdfDownloadLink;
	@Column(name = "result_excelDownloadLink")
	public String excelDownloadLink;

	@Type(type = "json")
	@Column(name = "result_profile", columnDefinition = "jsonb")
	public String result_profile;

	@Type(type = "json")
	@Column(name = "result_lastSixMnthSmry", columnDefinition = "jsonb")
	public String result_lastSixMnthSmry;

	@Type(type = "json")
	@Column(name = "result_last15MnthSmry", columnDefinition = "jsonb")
	public String result_last15MnthSmry;

	@Type(type = "json")
	@Column(name = "result_lendingAmount", columnDefinition = "jsonb")
	public String result_lendingAmount;

	@Type(type = "json")
	@Column(name = "result_alerts", columnDefinition = "jsonb")
	public String result_alerts;
	// end of normal results objects

	// starting of result_previous object
	@Type(type = "json")
	@Column(name = "result_previous_itcCredit", columnDefinition = "jsonb")
	public String result_previous_itcCredit;

	@Type(type = "json")
	@Column(name = "result_previous_gstr3b_total", columnDefinition = "jsonb")
	public String result_previous_gstr3b_total;

	@Type(type = "json")
	@Column(name = "result_previous_gstr3b_total_supDetails", columnDefinition = "jsonb")
	public String result_previous_gstr3b_total_supDetails;

	@Type(type = "json")
	@Column(name = "result_previous_gstr3b_total_itcElg", columnDefinition = "jsonb")
	public String result_previous_gstr3b_total_itcElg;

	@Type(type = "json")
	@Column(name = "result_previous_gstr3b_total_liabBreakup", columnDefinition = "jsonb")
	public String result_previous_gstr3b_total_liabBreakup;

	public int result_previous_gstr3b_total_liabBreakupTotal;

	@Type(type = "json")
	@Column(name = "result_previous_gstr3b_total_intrLtfee", columnDefinition = "jsonb")
	public String result_previous_gstr3b_total_intrLtfee;

	@Type(type = "json")
	@Column(name = "result_previous_gstr3b_total_ttVal", columnDefinition = "jsonb")
	public String result_previous_gstr3b_total_ttVal;

	public int result_previous_gstr3b_total_itcInelgTotal;
	public double result_previous_gstr3b_total_itcAvlTotal;
	public int result_previous_gstr3b_total_itcRevTotal;
	public double result_previous_gstr3b_total_itcNetTotal;
	public double result_previous_gstr3b_total_ttlTaxPayable;
	public int result_previous_gstr3b_total_itcAvlByGstr2a;

	@Type(type = "json")
	@Column(name = "result_previous_gstr3b_total_interSup_uinDetails", columnDefinition = "jsonb")
	public String result_previous_gstr3b_total_interSup_uinDetails;

	@Type(type = "json")
	@Column(name = "result_previous_gstr3b_total_interSup_uinSummary", columnDefinition = "jsonb")
	public String result_previous_gstr3b_total_interSup_uinSummary;

	@Type(type = "json")
	@Column(name = "result_previous_gstr3b_total_interSup_compDetails", columnDefinition = "jsonb")
	public String result_previous_gstr3b_total_interSup_compDetails;

	@Type(type = "json")
	@Column(name = "result_previous_gstr3b_total_interSup_compSummary", columnDefinition = "jsonb")
	public String result_previous_gstr3b_total_interSup_compSummary;

	@Type(type = "json")
	@Column(name = "result_previous_gstr3b_total_interSup_unregDetails", columnDefinition = "jsonb")
	public String result_previous_gstr3b_total_interSup_unregDetails;

	@Type(type = "json")
	@Column(name = "result_previous_gstr3b_details", columnDefinition = "jsonb")
	public String result_previous_gstr3b_details;

	@Type(type = "json")
	@Column(name = "result_previous_gstr1_details", columnDefinition = "jsonb")
	public String result_previous_gstr1_details;

	@Type(type = "json")
	@Column(name = "result_previous_gstr1_total_secSum", columnDefinition = "jsonb")
	public String result_previous_gstr1_total_secSum;

	@Type(type = "json")
	@Column(name = "result_previous_gstr1_total_cptySum", columnDefinition = "jsonb")
	public String result_previous_gstr1_total_cptySum;

	@Type(type = "json")
	@Column(name = "result_previous_gstr1_total_stateWise", columnDefinition = "jsonb")
	public String result_previous_gstr1_total_stateWise;

	@Type(type = "json")
	@Column(name = "result_previous_gstr1_total_hsnWise", columnDefinition = "jsonb")
	public String result_previous_gstr1_total_hsnWise;

	@Type(type = "json")
	@Column(name = "result_previous_averages", columnDefinition = "jsonb")
	public String result_previous_averages;

	// avg split
	public String result_previous_averages_avgmonthtax;
	public String result_previous_averages_avgmonthval;
	public String result_previous_averages_avgttltaxinv;
	public String result_previous_averages_avgttlvalinv;
	public String result_previous_averages_avginvcust;
	public String result_previous_averages_avgttltaxcust;
	public String result_previous_averages_avgttlvalcust;

	@Type(type = "json")
	@Column(name = "result_previous_top10Cus", columnDefinition = "jsonb")
	public String result_previous_top10Cus;

	@Type(type = "json")
	@Column(name = "result_previous_monthWiseSummary", columnDefinition = "jsonb")
	public String result_previous_monthWiseSummary;

	@Type(type = "json")
	@Column(name = "result_previous_transactionSummary", columnDefinition = "jsonb")
	public String result_previous_transactionSummary;

	@Type(type = "json")
	@Column(name = "result_previous_transactionSummary_payment", columnDefinition = "jsonb")
	public String result_previous_transactionSummary_payment;

	@Type(type = "json")
	@Column(name = "result_previous_transactionSummary_totalTaxLiability", columnDefinition = "jsonb")
	public String result_previous_transactionSummary_totalTaxLiability;

	@Type(type = "json")
	@Column(name = "result_previous_transactionSummary_turnover", columnDefinition = "jsonb")
	public String result_previous_transactionSummary_turnover;

	public String result_previous_transactionSummary_periodFrom;
	public String result_previous_transactionSummary_periodTo;
	public int result_previous_transactionSummary_ttlInv;
	public int result_previous_transactionSummary_payable;
	public int result_previous_transactionSummary_lateFee;
	public double result_previous_transactionSummary_ttlIntr;
	public double result_previous_transactionSummary_sysInt;

	@Type(type = "json")
	@Column(name = "result_previous_filingStatus", columnDefinition = "jsonb")
	public String result_previous_filingStatus;

	@Type(type = "json")
	@Column(name = "result_previous_filingFrequency", columnDefinition = "jsonb")
	public String result_previous_filingFrequency;

	@Type(type = "json")
	@Column(name = "result_previous_top10Sup", columnDefinition = "jsonb")
	public String result_previous_top10Sup;

	@Type(type = "json")
	@Column(name = "result_previous_salesStateWise", columnDefinition = "jsonb")
	public String result_previous_salesStateWise;

	@Type(type = "json")
	@Column(name = "result_previous_salesCptySum", columnDefinition = "jsonb")
	public String result_previous_salesCptySum;

	@Type(type = "json")
	@Column(name = "result_previous_salesHsnWise", columnDefinition = "jsonb")
	public String result_previous_salesHsnWise;

	@Type(type = "json")
	@Column(name = "result_previous_salesCategoryWise", columnDefinition = "jsonb")
	public String result_previous_salesCategoryWise;

	@Type(type = "json")
	@Column(name = "result_previous_purchasesStateWise", columnDefinition = "jsonb")
	public String result_previous_purchasesStateWise;

	@Type(type = "json")
	@Column(name = "result_previous_purchasesCptySum", columnDefinition = "jsonb")
	public String result_previous_purchasesCptySum;

	@Type(type = "json")
	@Column(name = "result_previous_purchasesHsnWise", columnDefinition = "jsonb")
	public String result_previous_purchasesHsnWise;

	@Type(type = "json")
	@Column(name = "result_previous_purchasesCategoryWise", columnDefinition = "jsonb")
	public String result_previous_purchasesCategoryWise;

	@Type(type = "json")
	@Column(name = "result_previous_gstr4_details", columnDefinition = "jsonb")
	public String result_previous_gstr4_details;

	@Type(type = "json")
	@Column(name = "result_previous_gstr4_total_dbtdtl", columnDefinition = "jsonb")
	public String result_previous_gstr4_total_dbtdtl;

	@Type(type = "json")
	@Column(name = "result_previous_gstr4_total_totalLiabilityPayable", columnDefinition = "jsonb")
	public String result_previous_gstr4_total_totalLiabilityPayable;

	@Type(type = "json")
	@Column(name = "result_previous_gstr4_total_stateWise", columnDefinition = "jsonb")
	public String result_previous_gstr4_total_stateWise;

	@Type(type = "json")
	@Column(name = "result_previous_gstr4_total_liabdtlNonrev", columnDefinition = "jsonb")
	public String result_previous_gstr4_total_liabdtlNonrev;

	@Type(type = "json")
	@Column(name = "result_previous_gstr4_total_secSum", columnDefinition = "jsonb")
	public String result_previous_gstr4_total_secSum;

	@Type(type = "json")
	@Column(name = "result_previous_gstr4_total_hsnWise", columnDefinition = "jsonb")
	public String result_previous_gstr4_total_hsnWise;

	@Type(type = "json")
	@Column(name = "result_previous_gstr4_total_liabdtlRev", columnDefinition = "jsonb")
	public String result_previous_gstr4_total_liabdtlRev;

	@Type(type = "json")
	@Column(name = "result_previous_gstr4_total_cptySum", columnDefinition = "jsonb")
	public String result_previous_gstr4_total_cptySum;

	@Type(type = "json")
	@Column(name = "result_previous_gstr2a", columnDefinition = "jsonb")
	public String result_previous_gstr2a;

	@Type(type = "json")
	@Column(name = "result_previous_gstr4a_details", columnDefinition = "jsonb")
	public String result_previous_gstr4a_details;

	@Type(type = "json")
	@Column(name = "result_previous_gstr4a_total_secSum", columnDefinition = "jsonb")
	public String result_previous_gstr4a_total_secSum;

	@Type(type = "json")
	@Column(name = "result_previous_gstr4a_total_hsnWise", columnDefinition = "jsonb")
	public String result_previous_gstr4a_total_hsnWise;

	@Type(type = "json")
	@Column(name = "result_previous_gstr4a_total_stateWise", columnDefinition = "jsonb")
	public String result_previous_gstr4a_total_stateWise;

	@Type(type = "json")
	@Column(name = "result_previous_gstr4a_total_cptySum", columnDefinition = "jsonb")
	public String result_previous_gstr4a_total_cptyWise;

	public String result_previous_financialYear;

	@Type(type = "json")
	@Column(name = "result_previous_businessSummary", columnDefinition = "jsonb")
	public String result_previous_businessSummary;

	@Type(type = "json")
	@Column(name = "result_previous_turnoverAndCustomers", columnDefinition = "jsonb")
	public String result_previous_turnoverAndCustomers;

	@Type(type = "json")
	@Column(name = "result_previous_total_totalSalesCategoryWise", columnDefinition = "jsonb")
	public String result_previous_total_totalSalesCategoryWise;

	@Type(type = "json")
	@Column(name = "result_previous_total_totalSalesCptySum", columnDefinition = "jsonb")
	public String result_previous_total_totalSalesCptySum;

	@Type(type = "json")
	@Column(name = "result_previous_total_totalPurchasesCptySum", columnDefinition = "jsonb")
	public String result_previous_total_totalPurchasesCptySum;

	@Type(type = "json")
	@Column(name = "result_previous_total_totalSalesStateWise", columnDefinition = "jsonb")
	public String result_previous_total_totalSalesStateWise;

	@Type(type = "json")
	@Column(name = "result_previous_total_totalPurchasesStateWise", columnDefinition = "jsonb")
	public String result_previous_total_totalPurchasesStateWise;

	@Type(type = "json")
	@Column(name = "result_previous_total_totalSalesHsnWise", columnDefinition = "jsonb")
	public String result_previous_total_totalSalesHsnWise;

	@Type(type = "json")
	@Column(name = "result_previous_total_totalPurchasesHsnWise", columnDefinition = "jsonb")
	public String result_previous_total_totalPurchasesHsnWise;

	@Type(type = "json")
	@Column(name = "result_previous_total_totalPurchasesCategoryWise", columnDefinition = "jsonb")
	public String result_previous_total_totalPurchasesCategoryWise;

	@Type(type = "json")
	@Column(name = "result_previous_complianceCheck", columnDefinition = "jsonb")
	public String result_previous_complianceCheck;

	@Type(type = "json")
	@Column(name = "result_previous_cagr", columnDefinition = "jsonb")
	public String result_previous_cagr;

	@Type(type = "json")
	@Column(name = "result_previous_cyclicTransactions", columnDefinition = "jsonb")
	public String result_previous_cyclicTransactions;

	@Type(type = "json")
	@Column(name = "result_previous_quarterlySummary_quarter1", columnDefinition = "jsonb")
	public String result_previous_quarterlySummary_quarter1;

	@Type(type = "json")
	@Column(name = "result_previous_quarterlySummary_quarter2", columnDefinition = "jsonb")
	public String result_previous_quarterlySummary_quarter2;

	@Type(type = "json")
	@Column(name = "result_previous_quarterlySummary_quarter3", columnDefinition = "jsonb")
	public String result_previous_quarterlySummary_quarter3;

	@Type(type = "json")
	@Column(name = "result_previous_quarterlySummary_quarter4", columnDefinition = "jsonb")
	public String result_previous_quarterlySummary_quarter4;

	@Type(type = "json")
	@Column(name = "result_previous_quarterlySummary_total_gstr1", columnDefinition = "jsonb")
	public String result_previous_quarterlySummary_total_gstr1;

	@Type(type = "json")
	@Column(name = "result_previous_quarterlySummary_total_gstr2a", columnDefinition = "jsonb")
	public String result_previous_quarterlySummary_total_gstr2a;

	@Type(type = "json")
	@Column(name = "result_previous_quarterlySummary_total_gstr3b", columnDefinition = "jsonb")
	public String result_previous_quarterlySummary_total_gstr3b;

	
	
	
	
	
	
	
	
	
	
	
	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getTraceId() {
		return traceId;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

	public String getResult_previous_averages_avgmonthtax() {
		return result_previous_averages_avgmonthtax;
	}

	public void setResult_previous_averages_avgmonthtax(String result_previous_averages_avgmonthtax) {
		this.result_previous_averages_avgmonthtax = result_previous_averages_avgmonthtax;
	}

	public String getResult_previous_averages_avgmonthval() {
		return result_previous_averages_avgmonthval;
	}

	public void setResult_previous_averages_avgmonthval(String result_previous_averages_avgmonthval) {
		this.result_previous_averages_avgmonthval = result_previous_averages_avgmonthval;
	}

	public String getResult_previous_averages_avgttltaxinv() {
		return result_previous_averages_avgttltaxinv;
	}

	public void setResult_previous_averages_avgttltaxinv(String result_previous_averages_avgttltaxinv) {
		this.result_previous_averages_avgttltaxinv = result_previous_averages_avgttltaxinv;
	}

	public String getResult_previous_averages_avgttlvalinv() {
		return result_previous_averages_avgttlvalinv;
	}

	public void setResult_previous_averages_avgttlvalinv(String result_previous_averages_avgttlvalinv) {
		this.result_previous_averages_avgttlvalinv = result_previous_averages_avgttlvalinv;
	}

	public String getResult_previous_averages_avginvcust() {
		return result_previous_averages_avginvcust;
	}

	public void setResult_previous_averages_avginvcust(String result_previous_averages_avginvcust) {
		this.result_previous_averages_avginvcust = result_previous_averages_avginvcust;
	}

	public String getResult_previous_averages_avgttltaxcust() {
		return result_previous_averages_avgttltaxcust;
	}

	public void setResult_previous_averages_avgttltaxcust(String result_previous_averages_avgttltaxcust) {
		this.result_previous_averages_avgttltaxcust = result_previous_averages_avgttltaxcust;
	}

	public String getResult_previous_averages_avgttlvalcust() {
		return result_previous_averages_avgttlvalcust;
	}

	public void setResult_previous_averages_avgttlvalcust(String result_previous_averages_avgttlvalcust) {
		this.result_previous_averages_avgttlvalcust = result_previous_averages_avgttlvalcust;
	}

	public String getResult_previous_transactionSummary_turnover() {
		return result_previous_transactionSummary_turnover;
	}

	public void setResult_previous_transactionSummary_turnover(String result_previous_transactionSummary_turnover) {
		this.result_previous_transactionSummary_turnover = result_previous_transactionSummary_turnover;
	}

	public String getResult_previous_gstr3b_total_supDetails() {
		return result_previous_gstr3b_total_supDetails;
	}

	public void setResult_previous_gstr3b_total_supDetails(String result_previous_gstr3b_total_supDetails) {
		this.result_previous_gstr3b_total_supDetails = result_previous_gstr3b_total_supDetails;
	}

	public String getResult_previous_gstr3b_total_itcElg() {
		return result_previous_gstr3b_total_itcElg;
	}

	public void setResult_previous_gstr3b_total_itcElg(String result_previous_gstr3b_total_itcElg) {
		this.result_previous_gstr3b_total_itcElg = result_previous_gstr3b_total_itcElg;
	}

	public String getResult_previous_gstr3b_total_liabBreakup() {
		return result_previous_gstr3b_total_liabBreakup;
	}

	public void setResult_previous_gstr3b_total_liabBreakup(String result_previous_gstr3b_total_liabBreakup) {
		this.result_previous_gstr3b_total_liabBreakup = result_previous_gstr3b_total_liabBreakup;
	}

	public int getResult_previous_gstr3b_total_liabBreakupTotal() {
		return result_previous_gstr3b_total_liabBreakupTotal;
	}

	public void setResult_previous_gstr3b_total_liabBreakupTotal(int result_previous_gstr3b_total_liabBreakupTotal) {
		this.result_previous_gstr3b_total_liabBreakupTotal = result_previous_gstr3b_total_liabBreakupTotal;
	}

	public String getResult_previous_gstr3b_total_intrLtfee() {
		return result_previous_gstr3b_total_intrLtfee;
	}

	public void setResult_previous_gstr3b_total_intrLtfee(String result_previous_gstr3b_total_intrLtfee) {
		this.result_previous_gstr3b_total_intrLtfee = result_previous_gstr3b_total_intrLtfee;
	}

	public String getResult_previous_gstr3b_total_ttVal() {
		return result_previous_gstr3b_total_ttVal;
	}

	public void setResult_previous_gstr3b_total_ttVal(String result_previous_gstr3b_total_ttVal) {
		this.result_previous_gstr3b_total_ttVal = result_previous_gstr3b_total_ttVal;
	}

	public int getResult_previous_gstr3b_total_itcInelgTotal() {
		return result_previous_gstr3b_total_itcInelgTotal;
	}

	public void setResult_previous_gstr3b_total_itcInelgTotal(int result_previous_gstr3b_total_itcInelgTotal) {
		this.result_previous_gstr3b_total_itcInelgTotal = result_previous_gstr3b_total_itcInelgTotal;
	}

	public double getResult_previous_gstr3b_total_itcAvlTotal() {
		return result_previous_gstr3b_total_itcAvlTotal;
	}

	public void setResult_previous_gstr3b_total_itcAvlTotal(double result_previous_gstr3b_total_itcAvlTotal) {
		this.result_previous_gstr3b_total_itcAvlTotal = result_previous_gstr3b_total_itcAvlTotal;
	}

	public int getResult_previous_gstr3b_total_itcRevTotal() {
		return result_previous_gstr3b_total_itcRevTotal;
	}

	public void setResult_previous_gstr3b_total_itcRevTotal(int result_previous_gstr3b_total_itcRevTotal) {
		this.result_previous_gstr3b_total_itcRevTotal = result_previous_gstr3b_total_itcRevTotal;
	}

	public double getResult_previous_gstr3b_total_itcNetTotal() {
		return result_previous_gstr3b_total_itcNetTotal;
	}

	public void setResult_previous_gstr3b_total_itcNetTotal(double result_previous_gstr3b_total_itcNetTotal) {
		this.result_previous_gstr3b_total_itcNetTotal = result_previous_gstr3b_total_itcNetTotal;
	}

	public double getResult_previous_gstr3b_total_ttlTaxPayable() {
		return result_previous_gstr3b_total_ttlTaxPayable;
	}

	public void setResult_previous_gstr3b_total_ttlTaxPayable(double result_previous_gstr3b_total_ttlTaxPayable) {
		this.result_previous_gstr3b_total_ttlTaxPayable = result_previous_gstr3b_total_ttlTaxPayable;
	}

	public int getResult_previous_gstr3b_total_itcAvlByGstr2a() {
		return result_previous_gstr3b_total_itcAvlByGstr2a;
	}

	public void setResult_previous_gstr3b_total_itcAvlByGstr2a(int result_previous_gstr3b_total_itcAvlByGstr2a) {
		this.result_previous_gstr3b_total_itcAvlByGstr2a = result_previous_gstr3b_total_itcAvlByGstr2a;
	}

	public String getResult_previous_gstr3b_total_interSup_uinDetails() {
		return result_previous_gstr3b_total_interSup_uinDetails;
	}

	public void setResult_previous_gstr3b_total_interSup_uinDetails(
			String result_previous_gstr3b_total_interSup_uinDetails) {
		this.result_previous_gstr3b_total_interSup_uinDetails = result_previous_gstr3b_total_interSup_uinDetails;
	}

	public String getResult_previous_gstr3b_total_interSup_uinSummary() {
		return result_previous_gstr3b_total_interSup_uinSummary;
	}

	public void setResult_previous_gstr3b_total_interSup_uinSummary(
			String result_previous_gstr3b_total_interSup_uinSummary) {
		this.result_previous_gstr3b_total_interSup_uinSummary = result_previous_gstr3b_total_interSup_uinSummary;
	}

	public String getResult_previous_gstr3b_total_interSup_compDetails() {
		return result_previous_gstr3b_total_interSup_compDetails;
	}

	public void setResult_previous_gstr3b_total_interSup_compDetails(
			String result_previous_gstr3b_total_interSup_compDetails) {
		this.result_previous_gstr3b_total_interSup_compDetails = result_previous_gstr3b_total_interSup_compDetails;
	}

	public String getResult_previous_gstr3b_total_interSup_compSummary() {
		return result_previous_gstr3b_total_interSup_compSummary;
	}

	public void setResult_previous_gstr3b_total_interSup_compSummary(
			String result_previous_gstr3b_total_interSup_compSummary) {
		this.result_previous_gstr3b_total_interSup_compSummary = result_previous_gstr3b_total_interSup_compSummary;
	}

	public String getResult_previous_gstr3b_total_interSup_unregDetails() {
		return result_previous_gstr3b_total_interSup_unregDetails;
	}

	public void setResult_previous_gstr3b_total_interSup_unregDetails(
			String result_previous_gstr3b_total_interSup_unregDetails) {
		this.result_previous_gstr3b_total_interSup_unregDetails = result_previous_gstr3b_total_interSup_unregDetails;
	}

	public String getResult_previous_transactionSummary_payment() {
		return result_previous_transactionSummary_payment;
	}

	public void setResult_previous_transactionSummary_payment(String result_previous_transactionSummary_payment) {
		this.result_previous_transactionSummary_payment = result_previous_transactionSummary_payment;
	}

	public String getResult_previous_transactionSummary_totalTaxLiability() {
		return result_previous_transactionSummary_totalTaxLiability;
	}

	public void setResult_previous_transactionSummary_totalTaxLiability(
			String result_previous_transactionSummary_totalTaxLiability) {
		this.result_previous_transactionSummary_totalTaxLiability = result_previous_transactionSummary_totalTaxLiability;
	}

	public String getResult_previous_transactionSummary_periodFrom() {
		return result_previous_transactionSummary_periodFrom;
	}

	public void setResult_previous_transactionSummary_periodFrom(String result_previous_transactionSummary_periodFrom) {
		this.result_previous_transactionSummary_periodFrom = result_previous_transactionSummary_periodFrom;
	}

	public String getResult_previous_transactionSummary_periodTo() {
		return result_previous_transactionSummary_periodTo;
	}

	public void setResult_previous_transactionSummary_periodTo(String result_previous_transactionSummary_periodTo) {
		this.result_previous_transactionSummary_periodTo = result_previous_transactionSummary_periodTo;
	}

	public int getResult_previous_transactionSummary_ttlInv() {
		return result_previous_transactionSummary_ttlInv;
	}

	public void setResult_previous_transactionSummary_ttlInv(int result_previous_transactionSummary_ttlInv) {
		this.result_previous_transactionSummary_ttlInv = result_previous_transactionSummary_ttlInv;
	}

	public int getResult_previous_transactionSummary_payable() {
		return result_previous_transactionSummary_payable;
	}

	public void setResult_previous_transactionSummary_payable(int result_previous_transactionSummary_payable) {
		this.result_previous_transactionSummary_payable = result_previous_transactionSummary_payable;
	}

	public int getResult_previous_transactionSummary_lateFee() {
		return result_previous_transactionSummary_lateFee;
	}

	public void setResult_previous_transactionSummary_lateFee(int result_previous_transactionSummary_lateFee) {
		this.result_previous_transactionSummary_lateFee = result_previous_transactionSummary_lateFee;
	}

	public double getResult_previous_transactionSummary_ttlIntr() {
		return result_previous_transactionSummary_ttlIntr;
	}

	public void setResult_previous_transactionSummary_ttlIntr(double result_previous_transactionSummary_ttlIntr) {
		this.result_previous_transactionSummary_ttlIntr = result_previous_transactionSummary_ttlIntr;
	}

	public double getResult_previous_transactionSummary_sysInt() {
		return result_previous_transactionSummary_sysInt;
	}

	public void setResult_previous_transactionSummary_sysInt(double result_previous_transactionSummary_sysInt) {
		this.result_previous_transactionSummary_sysInt = result_previous_transactionSummary_sysInt;
	}

	public String getResult_current_averages_avgmonthtax() {
		return result_current_averages_avgmonthtax;
	}

	public void setResult_current_averages_avgmonthtax(String result_current_averages_avgmonthtax) {
		this.result_current_averages_avgmonthtax = result_current_averages_avgmonthtax;
	}

	public String getResult_current_averages_avgmonthval() {
		return result_current_averages_avgmonthval;
	}

	public void setResult_current_averages_avgmonthval(String result_current_averages_avgmonthval) {
		this.result_current_averages_avgmonthval = result_current_averages_avgmonthval;
	}

	public String getResult_current_averages_avgttltaxinv() {
		return result_current_averages_avgttltaxinv;
	}

	public void setResult_current_averages_avgttltaxinv(String result_current_averages_avgttltaxinv) {
		this.result_current_averages_avgttltaxinv = result_current_averages_avgttltaxinv;
	}

	public String getResult_current_averages_avgttlvalinv() {
		return result_current_averages_avgttlvalinv;
	}

	public void setResult_current_averages_avgttlvalinv(String result_current_averages_avgttlvalinv) {
		this.result_current_averages_avgttlvalinv = result_current_averages_avgttlvalinv;
	}

	public double getResult_current_transactionSummary_ttlIntr() {
		return result_current_transactionSummary_ttlIntr;
	}

	public void setResult_current_transactionSummary_ttlIntr(double result_current_transactionSummary_ttlIntr) {
		this.result_current_transactionSummary_ttlIntr = result_current_transactionSummary_ttlIntr;
	}

	public double getResult_current_transactionSummary_sysInt() {
		return result_current_transactionSummary_sysInt;
	}

	public void setResult_current_transactionSummary_sysInt(double result_current_transactionSummary_sysInt) {
		this.result_current_transactionSummary_sysInt = result_current_transactionSummary_sysInt;
	}

	public double getResult_current_gstr3b_total_itcAvlTotal() {
		return result_current_gstr3b_total_itcAvlTotal;
	}

	public void setResult_current_gstr3b_total_itcAvlTotal(double result_current_gstr3b_total_itcAvlTotal) {
		this.result_current_gstr3b_total_itcAvlTotal = result_current_gstr3b_total_itcAvlTotal;
	}

	public double getResult_current_gstr3b_total_itcNetTotal() {
		return result_current_gstr3b_total_itcNetTotal;
	}

	public void setResult_current_gstr3b_total_itcNetTotal(double result_current_gstr3b_total_itcNetTotal) {
		this.result_current_gstr3b_total_itcNetTotal = result_current_gstr3b_total_itcNetTotal;
	}

	public double getResult_current_gstr3b_total_ttlTaxPayable() {
		return result_current_gstr3b_total_ttlTaxPayable;
	}

	public void setResult_current_gstr3b_total_ttlTaxPayable(double result_current_gstr3b_total_ttlTaxPayable) {
		this.result_current_gstr3b_total_ttlTaxPayable = result_current_gstr3b_total_ttlTaxPayable;
	}

	public String getResult_current_gstr3b_total_supDetails() {
		return result_current_gstr3b_total_supDetails;
	}

	public void setResult_current_gstr3b_total_supDetails(String result_current_gstr3b_total_supDetails) {
		this.result_current_gstr3b_total_supDetails = result_current_gstr3b_total_supDetails;
	}

	public String getResult_current_gstr3b_total_itcElg() {
		return result_current_gstr3b_total_itcElg;
	}

	public void setResult_current_gstr3b_total_itcElg(String result_current_gstr3b_total_itcElg) {
		this.result_current_gstr3b_total_itcElg = result_current_gstr3b_total_itcElg;
	}

	public String getResult_current_gstr3b_total_liabBreakup() {
		return result_current_gstr3b_total_liabBreakup;
	}

	public void setResult_current_gstr3b_total_liabBreakup(String result_current_gstr3b_total_liabBreakup) {
		this.result_current_gstr3b_total_liabBreakup = result_current_gstr3b_total_liabBreakup;
	}

	public int getResult_current_gstr3b_total_liabBreakupTotal() {
		return result_current_gstr3b_total_liabBreakupTotal;
	}

	public void setResult_current_gstr3b_total_liabBreakupTotal(int result_current_gstr3b_total_liabBreakupTotal) {
		this.result_current_gstr3b_total_liabBreakupTotal = result_current_gstr3b_total_liabBreakupTotal;
	}

	public String getResult_current_gstr3b_total_intrLtfee() {
		return result_current_gstr3b_total_intrLtfee;
	}

	public void setResult_current_gstr3b_total_intrLtfee(String result_current_gstr3b_total_intrLtfee) {
		this.result_current_gstr3b_total_intrLtfee = result_current_gstr3b_total_intrLtfee;
	}

	public String getResult_current_gstr3b_total_ttVal() {
		return result_current_gstr3b_total_ttVal;
	}

	public void setResult_current_gstr3b_total_ttVal(String result_current_gstr3b_total_ttVal) {
		this.result_current_gstr3b_total_ttVal = result_current_gstr3b_total_ttVal;
	}

	public int getResult_current_gstr3b_total_itcInelgTotal() {
		return result_current_gstr3b_total_itcInelgTotal;
	}

	public void setResult_current_gstr3b_total_itcInelgTotal(int result_current_gstr3b_total_itcInelgTotal) {
		this.result_current_gstr3b_total_itcInelgTotal = result_current_gstr3b_total_itcInelgTotal;
	}

	public int getResult_current_gstr3b_total_itcRevTotal() {
		return result_current_gstr3b_total_itcRevTotal;
	}

	public void setResult_current_gstr3b_total_itcRevTotal(int result_current_gstr3b_total_itcRevTotal) {
		this.result_current_gstr3b_total_itcRevTotal = result_current_gstr3b_total_itcRevTotal;
	}

	public int getResult_current_gstr3b_total_itcAvlByGstr2a() {
		return result_current_gstr3b_total_itcAvlByGstr2a;
	}

	public void setResult_current_gstr3b_total_itcAvlByGstr2a(int result_current_gstr3b_total_itcAvlByGstr2a) {
		this.result_current_gstr3b_total_itcAvlByGstr2a = result_current_gstr3b_total_itcAvlByGstr2a;
	}

	public String getResult_current_gstr3b_total_interSup_uinDetails() {
		return result_current_gstr3b_total_interSup_uinDetails;
	}

	public void setResult_current_gstr3b_total_interSup_uinDetails(
			String result_current_gstr3b_total_interSup_uinDetails) {
		this.result_current_gstr3b_total_interSup_uinDetails = result_current_gstr3b_total_interSup_uinDetails;
	}

	public String getResult_current_gstr3b_total_interSup_uinSummary() {
		return result_current_gstr3b_total_interSup_uinSummary;
	}

	public void setResult_current_gstr3b_total_interSup_uinSummary(
			String result_current_gstr3b_total_interSup_uinSummary) {
		this.result_current_gstr3b_total_interSup_uinSummary = result_current_gstr3b_total_interSup_uinSummary;
	}

	public String getResult_current_gstr3b_total_interSup_compDetails() {
		return result_current_gstr3b_total_interSup_compDetails;
	}

	public void setResult_current_gstr3b_total_interSup_compDetails(
			String result_current_gstr3b_total_interSup_compDetails) {
		this.result_current_gstr3b_total_interSup_compDetails = result_current_gstr3b_total_interSup_compDetails;
	}

	public String getResult_current_gstr3b_total_interSup_compSummary() {
		return result_current_gstr3b_total_interSup_compSummary;
	}

	public void setResult_current_gstr3b_total_interSup_compSummary(
			String result_current_gstr3b_total_interSup_compSummary) {
		this.result_current_gstr3b_total_interSup_compSummary = result_current_gstr3b_total_interSup_compSummary;
	}

	public String getResult_current_gstr3b_total_interSup_unregDetails() {
		return result_current_gstr3b_total_interSup_unregDetails;
	}

	public void setResult_current_gstr3b_total_interSup_unregDetails(
			String result_current_gstr3b_total_interSup_unregDetails) {
		this.result_current_gstr3b_total_interSup_unregDetails = result_current_gstr3b_total_interSup_unregDetails;
	}

	public String getResult_current_averages_avginvcust() {
		return result_current_averages_avginvcust;
	}

	public void setResult_current_averages_avginvcust(String result_current_averages_avginvcust) {
		this.result_current_averages_avginvcust = result_current_averages_avginvcust;
	}

	public String getResult_current_averages_avgttltaxcust() {
		return result_current_averages_avgttltaxcust;
	}

	public void setResult_current_averages_avgttltaxcust(String result_current_averages_avgttltaxcust) {
		this.result_current_averages_avgttltaxcust = result_current_averages_avgttltaxcust;
	}

	public String getResult_current_averages_avgttlvalcust() {
		return result_current_averages_avgttlvalcust;
	}

	public void setResult_current_averages_avgttlvalcust(String result_current_averages_avgttlvalcust) {
		this.result_current_averages_avgttlvalcust = result_current_averages_avgttlvalcust;
	}

	public String getResult_current_quarterlySummary_total_gstr1() {
		return result_current_quarterlySummary_total_gstr1;
	}

	public void setResult_current_quarterlySummary_total_gstr1(String result_current_quarterlySummary_total_gstr1) {
		this.result_current_quarterlySummary_total_gstr1 = result_current_quarterlySummary_total_gstr1;
	}

	public String getResult_current_quarterlySummary_total_gstr2a() {
		return result_current_quarterlySummary_total_gstr2a;
	}

	public void setResult_current_quarterlySummary_total_gstr2a(String result_current_quarterlySummary_total_gstr2a) {
		this.result_current_quarterlySummary_total_gstr2a = result_current_quarterlySummary_total_gstr2a;
	}

	public String getResult_current_quarterlySummary_total_gstr3b() {
		return result_current_quarterlySummary_total_gstr3b;
	}

	public void setResult_current_quarterlySummary_total_gstr3b(String result_current_quarterlySummary_total_gstr3b) {
		this.result_current_quarterlySummary_total_gstr3b = result_current_quarterlySummary_total_gstr3b;
	}

	public String getResult_current_quarterlySummary_quarter1_periodFrom() {
		return result_current_quarterlySummary_quarter1_periodFrom;
	}

	public void setResult_current_quarterlySummary_quarter1_periodFrom(
			String result_current_quarterlySummary_quarter1_periodFrom) {
		this.result_current_quarterlySummary_quarter1_periodFrom = result_current_quarterlySummary_quarter1_periodFrom;
	}

	public String getResult_current_quarterlySummary_quarter1_periodTo() {
		return result_current_quarterlySummary_quarter1_periodTo;
	}

	public void setResult_current_quarterlySummary_quarter1_periodTo(
			String result_current_quarterlySummary_quarter1_periodTo) {
		this.result_current_quarterlySummary_quarter1_periodTo = result_current_quarterlySummary_quarter1_periodTo;
	}

	public String getResult_current_quarterlySummary_quarter1_months() {
		return result_current_quarterlySummary_quarter1_months;
	}

	public void setResult_current_quarterlySummary_quarter1_months(
			String result_current_quarterlySummary_quarter1_months) {
		this.result_current_quarterlySummary_quarter1_months = result_current_quarterlySummary_quarter1_months;
	}

	public String getResult_current_quarterlySummary_quarter1_totalGstr1() {
		return result_current_quarterlySummary_quarter1_totalGstr1;
	}

	public void setResult_current_quarterlySummary_quarter1_totalGstr1(
			String result_current_quarterlySummary_quarter1_totalGstr1) {
		this.result_current_quarterlySummary_quarter1_totalGstr1 = result_current_quarterlySummary_quarter1_totalGstr1;
	}

	public String getResult_current_quarterlySummary_quarter1_totalGstr2a() {
		return result_current_quarterlySummary_quarter1_totalGstr2a;
	}

	public void setResult_current_quarterlySummary_quarter1_totalGstr2a(
			String result_current_quarterlySummary_quarter1_totalGstr2a) {
		this.result_current_quarterlySummary_quarter1_totalGstr2a = result_current_quarterlySummary_quarter1_totalGstr2a;
	}

	public String getResult_current_quarterlySummary_quarter1_totalGstr3b() {
		return result_current_quarterlySummary_quarter1_totalGstr3b;
	}

	public void setResult_current_quarterlySummary_quarter1_totalGstr3b(
			String result_current_quarterlySummary_quarter1_totalGstr3b) {
		this.result_current_quarterlySummary_quarter1_totalGstr3b = result_current_quarterlySummary_quarter1_totalGstr3b;
	}

	public int getResponseStatusCode() {
		return responseStatusCode;
	}

	public void setResponseStatusCode(int responseStatusCode) {
		this.responseStatusCode = responseStatusCode;
	}

	public String getResponseStatus() {
		return responseStatus;
	}

	public void setResponseStatus(String responseStatus) {
		this.responseStatus = responseStatus;
	}

	public int getPatchPdfResId() {
		return patchPdfResId;
	}

	public void setPatchPdfResId(int patchPdfResId) {
		this.patchPdfResId = patchPdfResId;
	}

	public PatchPdfparsingRequestModel getPatchPdfparsingRequestModel() {
		return patchPdfparsingRequestModel;
	}

	public void setPatchPdfparsingRequestModel(PatchPdfparsingRequestModel patchPdfparsingRequestModel) {
		this.patchPdfparsingRequestModel = patchPdfparsingRequestModel;
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResult_current_itcCredit() {
		return result_current_itcCredit;
	}

	public void setResult_current_itcCredit(String result_current_itcCredit) {
		this.result_current_itcCredit = result_current_itcCredit;
	}

	public String getResult_current_gstr3b_details() {
		return result_current_gstr3b_details;
	}

	public void setResult_current_gstr3b_details(String result_current_gstr3b_details) {
		this.result_current_gstr3b_details = result_current_gstr3b_details;
	}

	public String getResult_current_gstr3b_total() {
		return result_current_gstr3b_total;
	}

	public void setResult_current_gstr3b_total(String result_current_gstr3b_total) {
		this.result_current_gstr3b_total = result_current_gstr3b_total;
	}

	public String getResult_current_gstr1_details() {
		return result_current_gstr1_details;
	}

	public void setResult_current_gstr1_details(String result_current_gstr1_details) {
		this.result_current_gstr1_details = result_current_gstr1_details;
	}

	public String getResult_current_gstr1_total_secSum() {
		return result_current_gstr1_total_secSum;
	}

	public void setResult_current_gstr1_total_secSum(String result_current_gstr1_total_secSum) {
		this.result_current_gstr1_total_secSum = result_current_gstr1_total_secSum;
	}

	public String getResult_current_gstr1_total_cptySum() {
		return result_current_gstr1_total_cptySum;
	}

	public void setResult_current_gstr1_total_cptySum(String result_current_gstr1_total_cptySum) {
		this.result_current_gstr1_total_cptySum = result_current_gstr1_total_cptySum;
	}

	public String getResult_current_gst1_total_stateWise() {
		return result_current_gst1_total_stateWise;
	}

	public void setResult_current_gst1_total_stateWise(String result_current_gst1_total_stateWise) {
		this.result_current_gst1_total_stateWise = result_current_gst1_total_stateWise;
	}

	public String getResult_current_gstr1_total_hsnWise() {
		return result_current_gstr1_total_hsnWise;
	}

	public void setResult_current_gstr1_total_hsnWise(String result_current_gstr1_total_hsnWise) {
		this.result_current_gstr1_total_hsnWise = result_current_gstr1_total_hsnWise;
	}

	public String getResult_current_averages() {
		return result_current_averages;
	}

	public void setResult_current_averages(String result_current_averages) {
		this.result_current_averages = result_current_averages;
	}

	public String getResult_current_top10cus() {
		return result_current_top10cus;
	}

	public void setResult_current_top10cus(String result_current_top10cus) {
		this.result_current_top10cus = result_current_top10cus;
	}

	public String getResult_current_monthWiseSummary() {
		return result_current_monthWiseSummary;
	}

	public void setResult_current_monthWiseSummary(String result_current_monthWiseSummary) {
		this.result_current_monthWiseSummary = result_current_monthWiseSummary;
	}

	public String getResult_current_transactionSummary_periodFrom() {
		return result_current_transactionSummary_periodFrom;
	}

	public void setResult_current_transactionSummary_periodFrom(String result_current_transactionSummary_periodFrom) {
		this.result_current_transactionSummary_periodFrom = result_current_transactionSummary_periodFrom;
	}

	public String getResult_current_transactionSummary_periodTo() {
		return result_current_transactionSummary_periodTo;
	}

	public void setResult_current_transactionSummary_periodTo(String result_current_transactionSummary_periodTo) {
		this.result_current_transactionSummary_periodTo = result_current_transactionSummary_periodTo;
	}

	public int getResult_current_transactionSummary_ttlInv() {
		return result_current_transactionSummary_ttlInv;
	}

	public void setResult_current_transactionSummary_ttlInv(int result_current_transactionSummary_ttlInv) {
		this.result_current_transactionSummary_ttlInv = result_current_transactionSummary_ttlInv;
	}

	public int getResult_current_transactionSummary_payable() {
		return result_current_transactionSummary_payable;
	}

	public void setResult_current_transactionSummary_payable(int result_current_transactionSummary_payable) {
		this.result_current_transactionSummary_payable = result_current_transactionSummary_payable;
	}

	public int getResult_current_transactionSummary_lateFee() {
		return result_current_transactionSummary_lateFee;
	}

	public void setResult_current_transactionSummary_lateFee(int result_current_transactionSummary_lateFee) {
		this.result_current_transactionSummary_lateFee = result_current_transactionSummary_lateFee;
	}

	public String getResult_current_transactionSummary_turnover() {
		return result_current_transactionSummary_turnover;
	}

	public void setResult_current_transactionSummary_turnover(String result_current_transactionSummary_turnover) {
		this.result_current_transactionSummary_turnover = result_current_transactionSummary_turnover;
	}

	public String getResult_current_transactionSummary_payment() {
		return result_current_transactionSummary_payment;
	}

	public void setResult_current_transactionSummary_payment(String result_current_transactionSummary_payment) {
		this.result_current_transactionSummary_payment = result_current_transactionSummary_payment;
	}

	public String getResult_current_transactionSummary_totalTaxLiability() {
		return result_current_transactionSummary_totalTaxLiability;
	}

	public void setResult_current_transactionSummary_totalTaxLiability(
			String result_current_transactionSummary_totalTaxLiability) {
		this.result_current_transactionSummary_totalTaxLiability = result_current_transactionSummary_totalTaxLiability;
	}

	public String getResult_current_filingStatus() {
		return result_current_filingStatus;
	}

	public void setResult_current_filingStatus(String result_current_filingStatus) {
		this.result_current_filingStatus = result_current_filingStatus;
	}

	public String getResult_current_filingFrequency() {
		return result_current_filingFrequency;
	}

	public void setResult_current_filingFrequency(String result_current_filingFrequency) {
		this.result_current_filingFrequency = result_current_filingFrequency;
	}

	public String getResult_current_top10sup() {
		return result_current_top10sup;
	}

	public void setResult_current_top10sup(String result_current_top10sup) {
		this.result_current_top10sup = result_current_top10sup;
	}

	public String getResult_current_salesStateWise() {
		return result_current_salesStateWise;
	}

	public void setResult_current_salesStateWise(String result_current_salesStateWise) {
		this.result_current_salesStateWise = result_current_salesStateWise;
	}

	public String getResult_current_salesCptySum() {
		return result_current_salesCptySum;
	}

	public void setResult_current_salesCptySum(String result_current_salesCptySum) {
		this.result_current_salesCptySum = result_current_salesCptySum;
	}

	public String getResult_current_salesHsnWise() {
		return result_current_salesHsnWise;
	}

	public void setResult_current_salesHsnWise(String result_current_salesHsnWise) {
		this.result_current_salesHsnWise = result_current_salesHsnWise;
	}

	public String getResult_current_salesCategoryWise() {
		return result_current_salesCategoryWise;
	}

	public void setResult_current_salesCategoryWise(String result_current_salesCategoryWise) {
		this.result_current_salesCategoryWise = result_current_salesCategoryWise;
	}

	public String getResult_current_purchasesStateWise() {
		return result_current_purchasesStateWise;
	}

	public void setResult_current_purchasesStateWise(String result_current_purchasesStateWise) {
		this.result_current_purchasesStateWise = result_current_purchasesStateWise;
	}

	public String getResult_current_purchasesCptySum() {
		return result_current_purchasesCptySum;
	}

	public void setResult_current_purchasesCptySum(String result_current_purchasesCptySum) {
		this.result_current_purchasesCptySum = result_current_purchasesCptySum;
	}

	public String getResult_current_purchasesHsnWise() {
		return result_current_purchasesHsnWise;
	}

	public void setResult_current_purchasesHsnWise(String result_current_purchasesHsnWise) {
		this.result_current_purchasesHsnWise = result_current_purchasesHsnWise;
	}

	public String getResult_current_purchasesCategoryWise() {
		return result_current_purchasesCategoryWise;
	}

	public void setResult_current_purchasesCategoryWise(String result_current_purchasesCategoryWise) {
		this.result_current_purchasesCategoryWise = result_current_purchasesCategoryWise;
	}

	public String getResult_current_gstr4_details() {
		return result_current_gstr4_details;
	}

	public void setResult_current_gstr4_details(String result_current_gstr4_details) {
		this.result_current_gstr4_details = result_current_gstr4_details;
	}

	public String getResult_current_gstr4_total_dbtdtl() {
		return result_current_gstr4_total_dbtdtl;
	}

	public void setResult_current_gstr4_total_dbtdtl(String result_current_gstr4_total_dbtdtl) {
		this.result_current_gstr4_total_dbtdtl = result_current_gstr4_total_dbtdtl;
	}

	public String getResult_current_gstr4_total_totalLiabilityPayable() {
		return result_current_gstr4_total_totalLiabilityPayable;
	}

	public void setResult_current_gstr4_total_totalLiabilityPayable(
			String result_current_gstr4_total_totalLiabilityPayable) {
		this.result_current_gstr4_total_totalLiabilityPayable = result_current_gstr4_total_totalLiabilityPayable;
	}

	public String getResult_current_gstr4_total_stateWise() {
		return result_current_gstr4_total_stateWise;
	}

	public void setResult_current_gstr4_total_stateWise(String result_current_gstr4_total_stateWise) {
		this.result_current_gstr4_total_stateWise = result_current_gstr4_total_stateWise;
	}

	public String getResult_current_gstr4_total_liabdtlNonrev() {
		return result_current_gstr4_total_liabdtlNonrev;
	}

	public void setResult_current_gstr4_total_liabdtlNonrev(String result_current_gstr4_total_liabdtlNonrev) {
		this.result_current_gstr4_total_liabdtlNonrev = result_current_gstr4_total_liabdtlNonrev;
	}

	public String getResult_current_gstr4_total_secSum() {
		return result_current_gstr4_total_secSum;
	}

	public void setResult_current_gstr4_total_secSum(String result_current_gstr4_total_secSum) {
		this.result_current_gstr4_total_secSum = result_current_gstr4_total_secSum;
	}

	public String getResult_current_gstr4_total_hsnWise() {
		return result_current_gstr4_total_hsnWise;
	}

	public void setResult_current_gstr4_total_hsnWise(String result_current_gstr4_total_hsnWise) {
		this.result_current_gstr4_total_hsnWise = result_current_gstr4_total_hsnWise;
	}

	public String getResult_current_gstr4_total_liabdtlRev() {
		return result_current_gstr4_total_liabdtlRev;
	}

	public void setResult_current_gstr4_total_liabdtlRev(String result_current_gstr4_total_liabdtlRev) {
		this.result_current_gstr4_total_liabdtlRev = result_current_gstr4_total_liabdtlRev;
	}

	public String getResult_current_gstr4_total_cptySum() {
		return result_current_gstr4_total_cptySum;
	}

	public void setResult_current_gstr4_total_cptySum(String result_current_gstr4_total_cptySum) {
		this.result_current_gstr4_total_cptySum = result_current_gstr4_total_cptySum;
	}

	public String getResult_current_gstr2a() {
		return result_current_gstr2a;
	}

	public void setResult_current_gstr2a(String result_current_gstr2a) {
		this.result_current_gstr2a = result_current_gstr2a;
	}

	public String getResult_current_gstr4a_details() {
		return result_current_gstr4a_details;
	}

	public void setResult_current_gstr4a_details(String result_current_gstr4a_details) {
		this.result_current_gstr4a_details = result_current_gstr4a_details;
	}

	public String getResult_current_gstr4a_total_secSum() {
		return result_current_gstr4a_total_secSum;
	}

	public void setResult_current_gstr4a_total_secSum(String result_current_gstr4a_total_secSum) {
		this.result_current_gstr4a_total_secSum = result_current_gstr4a_total_secSum;
	}

	public String getResult_current_gstr4a_total_hsnWise() {
		return result_current_gstr4a_total_hsnWise;
	}

	public void setResult_current_gstr4a_total_hsnWise(String result_current_gstr4a_total_hsnWise) {
		this.result_current_gstr4a_total_hsnWise = result_current_gstr4a_total_hsnWise;
	}

	public String getResult_current_gstr4a_total_stateWise() {
		return result_current_gstr4a_total_stateWise;
	}

	public void setResult_current_gstr4a_total_stateWise(String result_current_gstr4a_total_stateWise) {
		this.result_current_gstr4a_total_stateWise = result_current_gstr4a_total_stateWise;
	}

	public String getResult_current_gstr4a_total_cptyWise() {
		return result_current_gstr4a_total_cptyWise;
	}

	public void setResult_current_gstr4a_total_cptyWise(String result_current_gstr4a_total_cptyWise) {
		this.result_current_gstr4a_total_cptyWise = result_current_gstr4a_total_cptyWise;
	}

	public String getResult_current_financialYear() {
		return result_current_financialYear;
	}

	public void setResult_current_financialYear(String result_current_financialYear) {
		this.result_current_financialYear = result_current_financialYear;
	}

	public String getResult_current_businessSummary() {
		return result_current_businessSummary;
	}

	public void setResult_current_businessSummary(String result_current_businessSummary) {
		this.result_current_businessSummary = result_current_businessSummary;
	}

	public String getResult_current_turnoverAndCustomers() {
		return result_current_turnoverAndCustomers;
	}

	public void setResult_current_turnoverAndCustomers(String result_current_turnoverAndCustomers) {
		this.result_current_turnoverAndCustomers = result_current_turnoverAndCustomers;
	}

	public String getResult_current_quarterlySummary_total() {
		return result_current_quarterlySummary_total;
	}

	public void setResult_current_quarterlySummary_total(String result_current_quarterlySummary_total) {
		this.result_current_quarterlySummary_total = result_current_quarterlySummary_total;
	}

	public String getResult_current_quarterlySummary_quarter1() {
		return result_current_quarterlySummary_quarter1;
	}

	public void setResult_current_quarterlySummary_quarter1(String result_current_quarterlySummary_quarter1) {
		this.result_current_quarterlySummary_quarter1 = result_current_quarterlySummary_quarter1;
	}

	public String getResult_current_total_totalSalesCategoryWise() {
		return result_current_total_totalSalesCategoryWise;
	}

	public void setResult_current_total_totalSalesCategoryWise(String result_current_total_totalSalesCategoryWise) {
		this.result_current_total_totalSalesCategoryWise = result_current_total_totalSalesCategoryWise;
	}

	public String getResult_current_total_totalSalesCptySum() {
		return result_current_total_totalSalesCptySum;
	}

	public void setResult_current_total_totalSalesCptySum(String result_current_total_totalSalesCptySum) {
		this.result_current_total_totalSalesCptySum = result_current_total_totalSalesCptySum;
	}

	public String getResult_current_total_totalPurchasesCptySum() {
		return result_current_total_totalPurchasesCptySum;
	}

	public void setResult_current_total_totalPurchasesCptySum(String result_current_total_totalPurchasesCptySum) {
		this.result_current_total_totalPurchasesCptySum = result_current_total_totalPurchasesCptySum;
	}

	public String getResult_current_total_totalSalesStateWise() {
		return result_current_total_totalSalesStateWise;
	}

	public void setResult_current_total_totalSalesStateWise(String result_current_total_totalSalesStateWise) {
		this.result_current_total_totalSalesStateWise = result_current_total_totalSalesStateWise;
	}

	public String getResult_current_total_totalPurchasesStateWise() {
		return result_current_total_totalPurchasesStateWise;
	}

	public void setResult_current_total_totalPurchasesStateWise(String result_current_total_totalPurchasesStateWise) {
		this.result_current_total_totalPurchasesStateWise = result_current_total_totalPurchasesStateWise;
	}

	public String getResult_current_total_totalSalesHsnWise() {
		return result_current_total_totalSalesHsnWise;
	}

	public void setResult_current_total_totalSalesHsnWise(String result_current_total_totalSalesHsnWise) {
		this.result_current_total_totalSalesHsnWise = result_current_total_totalSalesHsnWise;
	}

	public String getResult_current_total_totalPurchasesHsnWise() {
		return result_current_total_totalPurchasesHsnWise;
	}

	public void setResult_current_total_totalPurchasesHsnWise(String result_current_total_totalPurchasesHsnWise) {
		this.result_current_total_totalPurchasesHsnWise = result_current_total_totalPurchasesHsnWise;
	}

	public String getResult_current_total_totalPurchasesCategoryWise() {
		return result_current_total_totalPurchasesCategoryWise;
	}

	public void setResult_current_total_totalPurchasesCategoryWise(
			String result_current_total_totalPurchasesCategoryWise) {
		this.result_current_total_totalPurchasesCategoryWise = result_current_total_totalPurchasesCategoryWise;
	}

	public String getResult_current_complianceCheck() {
		return result_current_complianceCheck;
	}

	public void setResult_current_complianceCheck(String result_current_complianceCheck) {
		this.result_current_complianceCheck = result_current_complianceCheck;
	}

	public String getResult_current_cagr() {
		return result_current_cagr;
	}

	public void setResult_current_cagr(String result_current_cagr) {
		this.result_current_cagr = result_current_cagr;
	}

	public String getResult_current_cyclicTransactions() {
		return result_current_cyclicTransactions;
	}

	public void setResult_current_cyclicTransactions(String result_current_cyclicTransactions) {
		this.result_current_cyclicTransactions = result_current_cyclicTransactions;
	}

	public String getGstIn() {
		return gstIn;
	}

	public void setGstIn(String gstIn) {
		this.gstIn = gstIn;
	}

	public String getReportType() {
		return reportType;
	}

	public void setReportType(String reportType) {
		this.reportType = reportType;
	}

	public int getPdfCount() {
		return pdfCount;
	}

	public void setPdfCount(int pdfCount) {
		this.pdfCount = pdfCount;
	}

	public String getVersion() {
		return Version;
	}

	public void setVersion(String version) {
		Version = version;
	}

	public String getPdfDownloadLink() {
		return pdfDownloadLink;
	}

	public void setPdfDownloadLink(String pdfDownloadLink) {
		this.pdfDownloadLink = pdfDownloadLink;
	}

	public String getExcelDownloadLink() {
		return excelDownloadLink;
	}

	public void setExcelDownloadLink(String excelDownloadLink) {
		this.excelDownloadLink = excelDownloadLink;
	}

	public String getResult_profile() {
		return result_profile;
	}

	public void setResult_profile(String result_profile) {
		this.result_profile = result_profile;
	}

	public String getResult_lastSixMnthSmry() {
		return result_lastSixMnthSmry;
	}

	public void setResult_lastSixMnthSmry(String result_lastSixMnthSmry) {
		this.result_lastSixMnthSmry = result_lastSixMnthSmry;
	}

	public String getResult_last15MnthSmry() {
		return result_last15MnthSmry;
	}

	public void setResult_last15MnthSmry(String result_last15MnthSmry) {
		this.result_last15MnthSmry = result_last15MnthSmry;
	}

	public String getResult_lendingAmount() {
		return result_lendingAmount;
	}

	public void setResult_lendingAmount(String result_lendingAmount) {
		this.result_lendingAmount = result_lendingAmount;
	}

	public String getResult_alerts() {
		return result_alerts;
	}

	public void setResult_alerts(String result_alerts) {
		this.result_alerts = result_alerts;
	}

	public String getResult_previous_itcCredit() {
		return result_previous_itcCredit;
	}

	public void setResult_previous_itcCredit(String result_previous_itcCredit) {
		this.result_previous_itcCredit = result_previous_itcCredit;
	}

	public String getResult_previous_gstr3b_total() {
		return result_previous_gstr3b_total;
	}

	public void setResult_previous_gstr3b_total(String result_previous_gstr3b_total) {
		this.result_previous_gstr3b_total = result_previous_gstr3b_total;
	}

	public String getResult_previous_gstr3b_details() {
		return result_previous_gstr3b_details;
	}

	public void setResult_previous_gstr3b_details(String result_previous_gstr3b_details) {
		this.result_previous_gstr3b_details = result_previous_gstr3b_details;
	}

	public String getResult_previous_gstr1_details() {
		return result_previous_gstr1_details;
	}

	public void setResult_previous_gstr1_details(String result_previous_gstr1_details) {
		this.result_previous_gstr1_details = result_previous_gstr1_details;
	}

	public String getResult_previous_gstr1_total_secSum() {
		return result_previous_gstr1_total_secSum;
	}

	public void setResult_previous_gstr1_total_secSum(String result_previous_gstr1_total_secSum) {
		this.result_previous_gstr1_total_secSum = result_previous_gstr1_total_secSum;
	}

	public String getResult_previous_gstr1_total_cptySum() {
		return result_previous_gstr1_total_cptySum;
	}

	public void setResult_previous_gstr1_total_cptySum(String result_previous_gstr1_total_cptySum) {
		this.result_previous_gstr1_total_cptySum = result_previous_gstr1_total_cptySum;
	}

	public String getResult_previous_gstr1_total_stateWise() {
		return result_previous_gstr1_total_stateWise;
	}

	public void setResult_previous_gstr1_total_stateWise(String result_previous_gstr1_total_stateWise) {
		this.result_previous_gstr1_total_stateWise = result_previous_gstr1_total_stateWise;
	}

	public String getResult_previous_gstr1_total_hsnWise() {
		return result_previous_gstr1_total_hsnWise;
	}

	public void setResult_previous_gstr1_total_hsnWise(String result_previous_gstr1_total_hsnWise) {
		this.result_previous_gstr1_total_hsnWise = result_previous_gstr1_total_hsnWise;
	}

	public String getResult_previous_averages() {
		return result_previous_averages;
	}

	public void setResult_previous_averages(String result_previous_averages) {
		this.result_previous_averages = result_previous_averages;
	}

	public String getResult_previous_top10Cus() {
		return result_previous_top10Cus;
	}

	public void setResult_previous_top10Cus(String result_previous_top10Cus) {
		this.result_previous_top10Cus = result_previous_top10Cus;
	}

	public String getResult_previous_monthWiseSummary() {
		return result_previous_monthWiseSummary;
	}

	public void setResult_previous_monthWiseSummary(String result_previous_monthWiseSummary) {
		this.result_previous_monthWiseSummary = result_previous_monthWiseSummary;
	}

	public String getResult_previous_transactionSummary() {
		return result_previous_transactionSummary;
	}

	public void setResult_previous_transactionSummary(String result_previous_transactionSummary) {
		this.result_previous_transactionSummary = result_previous_transactionSummary;
	}

	public String getResult_previous_filingStatus() {
		return result_previous_filingStatus;
	}

	public void setResult_previous_filingStatus(String result_previous_filingStatus) {
		this.result_previous_filingStatus = result_previous_filingStatus;
	}

	public String getResult_previous_filingFrequency() {
		return result_previous_filingFrequency;
	}

	public void setResult_previous_filingFrequency(String result_previous_filingFrequency) {
		this.result_previous_filingFrequency = result_previous_filingFrequency;
	}

	public String getResult_previous_top10Sup() {
		return result_previous_top10Sup;
	}

	public void setResult_previous_top10Sup(String result_previous_top10Sup) {
		this.result_previous_top10Sup = result_previous_top10Sup;
	}

	public String getResult_previous_salesStateWise() {
		return result_previous_salesStateWise;
	}

	public void setResult_previous_salesStateWise(String result_previous_salesStateWise) {
		this.result_previous_salesStateWise = result_previous_salesStateWise;
	}

	public String getResult_previous_salesCptySum() {
		return result_previous_salesCptySum;
	}

	public void setResult_previous_salesCptySum(String result_previous_salesCptySum) {
		this.result_previous_salesCptySum = result_previous_salesCptySum;
	}

	public String getResult_previous_salesHsnWise() {
		return result_previous_salesHsnWise;
	}

	public void setResult_previous_salesHsnWise(String result_previous_salesHsnWise) {
		this.result_previous_salesHsnWise = result_previous_salesHsnWise;
	}

	public String getResult_previous_salesCategoryWise() {
		return result_previous_salesCategoryWise;
	}

	public void setResult_previous_salesCategoryWise(String result_previous_salesCategoryWise) {
		this.result_previous_salesCategoryWise = result_previous_salesCategoryWise;
	}

	public String getResult_previous_purchasesStateWise() {
		return result_previous_purchasesStateWise;
	}

	public void setResult_previous_purchasesStateWise(String result_previous_purchasesStateWise) {
		this.result_previous_purchasesStateWise = result_previous_purchasesStateWise;
	}

	public String getResult_previous_purchasesCptySum() {
		return result_previous_purchasesCptySum;
	}

	public void setResult_previous_purchasesCptySum(String result_previous_purchasesCptySum) {
		this.result_previous_purchasesCptySum = result_previous_purchasesCptySum;
	}

	public String getResult_previous_purchasesHsnWise() {
		return result_previous_purchasesHsnWise;
	}

	public void setResult_previous_purchasesHsnWise(String result_previous_purchasesHsnWise) {
		this.result_previous_purchasesHsnWise = result_previous_purchasesHsnWise;
	}

	public String getResult_previous_purchasesCategoryWise() {
		return result_previous_purchasesCategoryWise;
	}

	public void setResult_previous_purchasesCategoryWise(String result_previous_purchasesCategoryWise) {
		this.result_previous_purchasesCategoryWise = result_previous_purchasesCategoryWise;
	}

	public String getResult_previous_gstr4_details() {
		return result_previous_gstr4_details;
	}

	public void setResult_previous_gstr4_details(String result_previous_gstr4_details) {
		this.result_previous_gstr4_details = result_previous_gstr4_details;
	}

	public String getResult_previous_gstr4_total_dbtdtl() {
		return result_previous_gstr4_total_dbtdtl;
	}

	public void setResult_previous_gstr4_total_dbtdtl(String result_previous_gstr4_total_dbtdtl) {
		this.result_previous_gstr4_total_dbtdtl = result_previous_gstr4_total_dbtdtl;
	}

	public String getResult_previous_gstr4_total_totalLiabilityPayable() {
		return result_previous_gstr4_total_totalLiabilityPayable;
	}

	public void setResult_previous_gstr4_total_totalLiabilityPayable(
			String result_previous_gstr4_total_totalLiabilityPayable) {
		this.result_previous_gstr4_total_totalLiabilityPayable = result_previous_gstr4_total_totalLiabilityPayable;
	}

	public String getResult_previous_gstr4_total_stateWise() {
		return result_previous_gstr4_total_stateWise;
	}

	public void setResult_previous_gstr4_total_stateWise(String result_previous_gstr4_total_stateWise) {
		this.result_previous_gstr4_total_stateWise = result_previous_gstr4_total_stateWise;
	}

	public String getResult_previous_gstr4_total_liabdtlNonrev() {
		return result_previous_gstr4_total_liabdtlNonrev;
	}

	public void setResult_previous_gstr4_total_liabdtlNonrev(String result_previous_gstr4_total_liabdtlNonrev) {
		this.result_previous_gstr4_total_liabdtlNonrev = result_previous_gstr4_total_liabdtlNonrev;
	}

	public String getResult_previous_gstr4_total_secSum() {
		return result_previous_gstr4_total_secSum;
	}

	public void setResult_previous_gstr4_total_secSum(String result_previous_gstr4_total_secSum) {
		this.result_previous_gstr4_total_secSum = result_previous_gstr4_total_secSum;
	}

	public String getResult_previous_gstr4_total_hsnWise() {
		return result_previous_gstr4_total_hsnWise;
	}

	public void setResult_previous_gstr4_total_hsnWise(String result_previous_gstr4_total_hsnWise) {
		this.result_previous_gstr4_total_hsnWise = result_previous_gstr4_total_hsnWise;
	}

	public String getResult_previous_gstr4_total_liabdtlRev() {
		return result_previous_gstr4_total_liabdtlRev;
	}

	public void setResult_previous_gstr4_total_liabdtlRev(String result_previous_gstr4_total_liabdtlRev) {
		this.result_previous_gstr4_total_liabdtlRev = result_previous_gstr4_total_liabdtlRev;
	}

	public String getResult_previous_gstr4_total_cptySum() {
		return result_previous_gstr4_total_cptySum;
	}

	public void setResult_previous_gstr4_total_cptySum(String result_previous_gstr4_total_cptySum) {
		this.result_previous_gstr4_total_cptySum = result_previous_gstr4_total_cptySum;
	}

	public String getResult_previous_gstr2a() {
		return result_previous_gstr2a;
	}

	public void setResult_previous_gstr2a(String result_previous_gstr2a) {
		this.result_previous_gstr2a = result_previous_gstr2a;
	}

	public String getResult_previous_gstr4a_details() {
		return result_previous_gstr4a_details;
	}

	public void setResult_previous_gstr4a_details(String result_previous_gstr4a_details) {
		this.result_previous_gstr4a_details = result_previous_gstr4a_details;
	}

	public String getResult_previous_gstr4a_total_secSum() {
		return result_previous_gstr4a_total_secSum;
	}

	public void setResult_previous_gstr4a_total_secSum(String result_previous_gstr4a_total_secSum) {
		this.result_previous_gstr4a_total_secSum = result_previous_gstr4a_total_secSum;
	}

	public String getResult_previous_gstr4a_total_hsnWise() {
		return result_previous_gstr4a_total_hsnWise;
	}

	public void setResult_previous_gstr4a_total_hsnWise(String result_previous_gstr4a_total_hsnWise) {
		this.result_previous_gstr4a_total_hsnWise = result_previous_gstr4a_total_hsnWise;
	}

	public String getResult_previous_gstr4a_total_stateWise() {
		return result_previous_gstr4a_total_stateWise;
	}

	public void setResult_previous_gstr4a_total_stateWise(String result_previous_gstr4a_total_stateWise) {
		this.result_previous_gstr4a_total_stateWise = result_previous_gstr4a_total_stateWise;
	}

	public String getResult_previous_gstr4a_total_cptyWise() {
		return result_previous_gstr4a_total_cptyWise;
	}

	public void setResult_previous_gstr4a_total_cptyWise(String result_previous_gstr4a_total_cptyWise) {
		this.result_previous_gstr4a_total_cptyWise = result_previous_gstr4a_total_cptyWise;
	}

	public String getResult_previous_financialYear() {
		return result_previous_financialYear;
	}

	public void setResult_previous_financialYear(String result_previous_financialYear) {
		this.result_previous_financialYear = result_previous_financialYear;
	}

	public String getResult_previous_businessSummary() {
		return result_previous_businessSummary;
	}

	public void setResult_previous_businessSummary(String result_previous_businessSummary) {
		this.result_previous_businessSummary = result_previous_businessSummary;
	}

	public String getResult_previous_turnoverAndCustomers() {
		return result_previous_turnoverAndCustomers;
	}

	public void setResult_previous_turnoverAndCustomers(String result_previous_turnoverAndCustomers) {
		this.result_previous_turnoverAndCustomers = result_previous_turnoverAndCustomers;
	}

	public String getResult_previous_total_totalSalesCategoryWise() {
		return result_previous_total_totalSalesCategoryWise;
	}

	public void setResult_previous_total_totalSalesCategoryWise(String result_previous_total_totalSalesCategoryWise) {
		this.result_previous_total_totalSalesCategoryWise = result_previous_total_totalSalesCategoryWise;
	}

	public String getResult_previous_total_totalSalesCptySum() {
		return result_previous_total_totalSalesCptySum;
	}

	public void setResult_previous_total_totalSalesCptySum(String result_previous_total_totalSalesCptySum) {
		this.result_previous_total_totalSalesCptySum = result_previous_total_totalSalesCptySum;
	}

	public String getResult_previous_total_totalPurchasesCptySum() {
		return result_previous_total_totalPurchasesCptySum;
	}

	public void setResult_previous_total_totalPurchasesCptySum(String result_previous_total_totalPurchasesCptySum) {
		this.result_previous_total_totalPurchasesCptySum = result_previous_total_totalPurchasesCptySum;
	}

	public String getResult_previous_total_totalSalesStateWise() {
		return result_previous_total_totalSalesStateWise;
	}

	public void setResult_previous_total_totalSalesStateWise(String result_previous_total_totalSalesStateWise) {
		this.result_previous_total_totalSalesStateWise = result_previous_total_totalSalesStateWise;
	}

	public String getResult_previous_total_totalPurchasesStateWise() {
		return result_previous_total_totalPurchasesStateWise;
	}

	public void setResult_previous_total_totalPurchasesStateWise(String result_previous_total_totalPurchasesStateWise) {
		this.result_previous_total_totalPurchasesStateWise = result_previous_total_totalPurchasesStateWise;
	}

	public String getResult_previous_total_totalSalesHsnWise() {
		return result_previous_total_totalSalesHsnWise;
	}

	public void setResult_previous_total_totalSalesHsnWise(String result_previous_total_totalSalesHsnWise) {
		this.result_previous_total_totalSalesHsnWise = result_previous_total_totalSalesHsnWise;
	}

	public String getResult_previous_total_totalPurchasesHsnWise() {
		return result_previous_total_totalPurchasesHsnWise;
	}

	public void setResult_previous_total_totalPurchasesHsnWise(String result_previous_total_totalPurchasesHsnWise) {
		this.result_previous_total_totalPurchasesHsnWise = result_previous_total_totalPurchasesHsnWise;
	}

	public String getResult_previous_total_totalPurchasesCategoryWise() {
		return result_previous_total_totalPurchasesCategoryWise;
	}

	public void setResult_previous_total_totalPurchasesCategoryWise(
			String result_previous_total_totalPurchasesCategoryWise) {
		this.result_previous_total_totalPurchasesCategoryWise = result_previous_total_totalPurchasesCategoryWise;
	}

	public String getResult_previous_complianceCheck() {
		return result_previous_complianceCheck;
	}

	public void setResult_previous_complianceCheck(String result_previous_complianceCheck) {
		this.result_previous_complianceCheck = result_previous_complianceCheck;
	}

	public String getResult_previous_cagr() {
		return result_previous_cagr;
	}

	public void setResult_previous_cagr(String result_previous_cagr) {
		this.result_previous_cagr = result_previous_cagr;
	}

	public String getResult_previous_cyclicTransactions() {
		return result_previous_cyclicTransactions;
	}

	public void setResult_previous_cyclicTransactions(String result_previous_cyclicTransactions) {
		this.result_previous_cyclicTransactions = result_previous_cyclicTransactions;
	}

	public String getResult_previous_quarterlySummary_quarter1() {
		return result_previous_quarterlySummary_quarter1;
	}

	public void setResult_previous_quarterlySummary_quarter1(String result_previous_quarterlySummary_quarter1) {
		this.result_previous_quarterlySummary_quarter1 = result_previous_quarterlySummary_quarter1;
	}

	public String getResult_previous_quarterlySummary_quarter2() {
		return result_previous_quarterlySummary_quarter2;
	}

	public void setResult_previous_quarterlySummary_quarter2(String result_previous_quarterlySummary_quarter2) {
		this.result_previous_quarterlySummary_quarter2 = result_previous_quarterlySummary_quarter2;
	}

	public String getResult_previous_quarterlySummary_quarter3() {
		return result_previous_quarterlySummary_quarter3;
	}

	public void setResult_previous_quarterlySummary_quarter3(String result_previous_quarterlySummary_quarter3) {
		this.result_previous_quarterlySummary_quarter3 = result_previous_quarterlySummary_quarter3;
	}

	public String getResult_previous_quarterlySummary_quarter4() {
		return result_previous_quarterlySummary_quarter4;
	}

	public void setResult_previous_quarterlySummary_quarter4(String result_previous_quarterlySummary_quarter4) {
		this.result_previous_quarterlySummary_quarter4 = result_previous_quarterlySummary_quarter4;
	}

	public String getResult_previous_quarterlySummary_total_gstr1() {
		return result_previous_quarterlySummary_total_gstr1;
	}

	public void setResult_previous_quarterlySummary_total_gstr1(String result_previous_quarterlySummary_total_gstr1) {
		this.result_previous_quarterlySummary_total_gstr1 = result_previous_quarterlySummary_total_gstr1;
	}

	public String getResult_previous_quarterlySummary_total_gstr2a() {
		return result_previous_quarterlySummary_total_gstr2a;
	}

	public void setResult_previous_quarterlySummary_total_gstr2a(String result_previous_quarterlySummary_total_gstr2a) {
		this.result_previous_quarterlySummary_total_gstr2a = result_previous_quarterlySummary_total_gstr2a;
	}

	public String getResult_previous_quarterlySummary_total_gstr3b() {
		return result_previous_quarterlySummary_total_gstr3b;
	}

	public void setResult_previous_quarterlySummary_total_gstr3b(String result_previous_quarterlySummary_total_gstr3b) {
		this.result_previous_quarterlySummary_total_gstr3b = result_previous_quarterlySummary_total_gstr3b;
	}

	public String getLan() {
		return lan;
	}

	public void setLan(String lan) {
		this.lan = lan;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

}
