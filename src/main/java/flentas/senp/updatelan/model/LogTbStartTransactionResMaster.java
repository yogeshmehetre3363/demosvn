package flentas.senp.updatelan.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the log_tb_start_transaction_res_master database table.
 * 
 */
@Entity
@Table(name="log_tb_start_transaction_res_master",schema="senp_middleware_fsa")
@NamedQuery(name="LogTbStartTransactionResMaster.findAll", query="SELECT l FROM LogTbStartTransactionResMaster l")
public class LogTbStartTransactionResMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long nrestransactionid;

	private Long ncreatedby;

	private Timestamp ncreatedon;

	private Long nmodifiedby;

	private Timestamp nmodifiedon;

	private Long nstatus;

	private Long nstatuscode;

	private String scode;

	private String smessage;

	private String sperfiostransactionid;

	private Boolean success;
	
	public String traceId;
	
	private String stxnid;
	
	private String lan_id;
	
	private String triggerBy;
	
	private String cif;

	//bi-directional many-to-one association to LogTbStartTransactionReqMaster
	@ManyToOne
	@JoinColumn(name="nreqtransactionid")
	private LogTbStartTransactionReqMaster logTbStartTransactionReqMaster;

	public LogTbStartTransactionResMaster() {
	}
	
	public String getTraceId() {
		return traceId;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}
	public String getStxnid() {
		return stxnid;
	}

	public void setStxnid(String stxnid) {
		this.stxnid = stxnid;
	}
	public Long getNrestransactionid() {
		return this.nrestransactionid;
	}

	public void setNrestransactionid(Long nrestransactionid) {
		this.nrestransactionid = nrestransactionid;
	}

	public Long getNcreatedby() {
		return this.ncreatedby;
	}

	public void setNcreatedby(Long ncreatedby) {
		this.ncreatedby = ncreatedby;
	}

	public Timestamp getNcreatedon() {
		return this.ncreatedon;
	}

	public void setNcreatedon(Timestamp ncreatedon) {
		this.ncreatedon = ncreatedon;
	}

	public Long getNmodifiedby() {
		return this.nmodifiedby;
	}

	public void setNmodifiedby(Long nmodifiedby) {
		this.nmodifiedby = nmodifiedby;
	}

	public Timestamp getNmodifiedon() {
		return this.nmodifiedon;
	}

	public void setNmodifiedon(Timestamp nmodifiedon) {
		this.nmodifiedon = nmodifiedon;
	}

	public Long getNstatus() {
		return this.nstatus;
	}

	public void setNstatus(Long nstatus) {
		this.nstatus = nstatus;
	}

	public Long getNstatuscode() {
		return this.nstatuscode;
	}

	public void setNstatuscode(Long nstatuscode) {
		this.nstatuscode = nstatuscode;
	}

	public String getScode() {
		return this.scode;
	}

	public void setScode(String scode) {
		this.scode = scode;
	}

	public String getSmessage() {
		return this.smessage;
	}

	public void setSmessage(String smessage) {
		this.smessage = smessage;
	}

	public String getSperfiostransactionid() {
		return this.sperfiostransactionid;
	}

	public void setSperfiostransactionid(String sperfiostransactionid) {
		this.sperfiostransactionid = sperfiostransactionid;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public LogTbStartTransactionReqMaster getLogTbStartTransactionReqMaster() {
		return this.logTbStartTransactionReqMaster;
	}

	public void setLogTbStartTransactionReqMaster(LogTbStartTransactionReqMaster logTbStartTransactionReqMaster) {
		this.logTbStartTransactionReqMaster = logTbStartTransactionReqMaster;
	}

	public String getLan_id() {
		return lan_id;
	}

	public void setLan_id(String lan_id) {
		this.lan_id = lan_id;
	}

	public String getTriggerBy() {
		return triggerBy;
	}

	public void setTriggerBy(String triggerBy) {
		this.triggerBy = triggerBy;
	}

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}