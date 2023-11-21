package flentas.senp.updatelan.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;




@Entity
@Table(name = "log_Bsa_initiateTransaction_res",schema="senp_middleware_bsa")
public class BsaInitiateTransactionResponseModel {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		int initiateTransactionResId;
		
		public String perfiosTransactionId;
		
		public int statuscode;
		public String traceId;
		public String message;
		public String lan;
		public String cif;
		@OneToOne(cascade = CascadeType.ALL)
		@JoinColumn(name = "bsa_InitiateTransaction_report_req")
		BsaInitiateTransactionRequestModel bsaInitiateTransactionRequestModel;

		public int getInitiateTransactionResId() {
			return initiateTransactionResId;
		}

		public void setInitiateTransactionResId(int initiateTransactionResId) {
			this.initiateTransactionResId = initiateTransactionResId;
		}

		public String getPerfiosTransactionId() {
			return perfiosTransactionId;
		}

		public void setPerfiosTransactionId(String perfiosTransactionId) {
			this.perfiosTransactionId = perfiosTransactionId;
		}

		public int getStatuscode() {
			return statuscode;
		}

		public void setStatuscode(int statuscode) {
			this.statuscode = statuscode;
		}

		

		public String getTraceId() {
			return traceId;
		}

		public void setTraceId(String traceId) {
			this.traceId = traceId;
		}

		public BsaInitiateTransactionRequestModel getBsaInitiateTransactionRequestModel() {
			return bsaInitiateTransactionRequestModel;
		}

		public void setBsaInitiateTransactionRequestModel(
				BsaInitiateTransactionRequestModel bsaInitiateTransactionRequestModel) {
			this.bsaInitiateTransactionRequestModel = bsaInitiateTransactionRequestModel;
		}
		

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
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
