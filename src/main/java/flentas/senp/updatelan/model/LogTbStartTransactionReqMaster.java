package flentas.senp.updatelan.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

/**
 * The persistent class for the log_tb_start_transaction_req_master database
 * table.
 * 
 */
@Entity
@Table(name = "log_tb_start_transaction_req_master",schema="senp_middleware_fsa")
@NamedQuery(name = "LogTbStartTransactionReqMaster.findAll", query = "SELECT l FROM LogTbStartTransactionReqMaster l")
public class LogTbStartTransactionReqMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long nreqtransactionid;

	private long ncreatedby;

	private Timestamp ncreatedon;

	private long nloanduration;

	private long nmodifiedby;

	private Timestamp nmodifiedon;

	private long nstatus;

	private String sapiversion;

	private String sinstitutionid;

	private String sloanamount;

	private String sloantype;

	private String stransactioncompletecallbackurlperfios;

	private String stxnid;

	private String svendorid;

	public String traceId;
	
	private String lan_id;
	
	private String triggerBy;
	private String cif;
	
	

	// bi-directional many-to-one association to LogTbStartTransactionResMaster
	@OneToMany(mappedBy = "logTbStartTransactionReqMaster")
	private List<LogTbStartTransactionResMaster> logTbStartTransactionResMasters;

	// bi-directional many-to-one association to TbApplicationMaster
	@ManyToOne
	@JoinColumn(name = "napplicationid")
	private TbApplicationMaster tbUpdateApplicationMaster;

	public LogTbStartTransactionReqMaster() {
	}

	public String getTraceId() {
		return traceId;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

	public long getNreqtransactionid() {
		return nreqtransactionid;
	}

	public void setNreqtransactionid(long nreqtransactionid) {
		this.nreqtransactionid = nreqtransactionid;
	}

	public long getNcreatedby() {
		return ncreatedby;
	}

	public void setNcreatedby(long ncreatedby) {
		this.ncreatedby = ncreatedby;
	}

	public Timestamp getNcreatedon() {
		return ncreatedon;
	}

	public void setNcreatedon(Timestamp ncreatedon) {
		this.ncreatedon = ncreatedon;
	}

	public long getNloanduration() {
		return nloanduration;
	}

	public void setNloanduration(long nloanduration) {
		this.nloanduration = nloanduration;
	}

	public long getNmodifiedby() {
		return nmodifiedby;
	}

	public void setNmodifiedby(long nmodifiedby) {
		this.nmodifiedby = nmodifiedby;
	}

	public Timestamp getNmodifiedon() {
		return nmodifiedon;
	}

	public void setNmodifiedon(Timestamp nmodifiedon) {
		this.nmodifiedon = nmodifiedon;
	}

	public long getNstatus() {
		return nstatus;
	}

	public void setNstatus(long nstatus) {
		this.nstatus = nstatus;
	}

	public String getSapiversion() {
		return sapiversion;
	}

	public void setSapiversion(String sapiversion) {
		this.sapiversion = sapiversion;
	}

	public String getSinstitutionid() {
		return sinstitutionid;
	}

	public void setSinstitutionid(String sinstitutionid) {
		this.sinstitutionid = sinstitutionid;
	}

	public String getSloanamount() {
		return sloanamount;
	}

	public void setSloanamount(String sloanamount) {
		this.sloanamount = sloanamount;
	}

	public String getSloantype() {
		return sloantype;
	}

	public void setSloantype(String sloantype) {
		this.sloantype = sloantype;
	}

	public String getStransactioncompletecallbackurlperfios() {
		return stransactioncompletecallbackurlperfios;
	}

	public void setStransactioncompletecallbackurlperfios(String stransactioncompletecallbackurlperfios) {
		this.stransactioncompletecallbackurlperfios = stransactioncompletecallbackurlperfios;
	}

	public String getStxnid() {
		return stxnid;
	}

	public void setStxnid(String stxnid) {
		this.stxnid = stxnid;
	}

	public String getSvendorid() {
		return svendorid;
	}

	public void setSvendorid(String svendorid) {
		this.svendorid = svendorid;
	}

	public List<LogTbStartTransactionResMaster> getLogTbStartTransactionResMasters() {
		return this.logTbStartTransactionResMasters;
	}

	public void setLogTbStartTransactionResMasters(
			List<LogTbStartTransactionResMaster> logTbStartTransactionResMasters) {
		this.logTbStartTransactionResMasters = logTbStartTransactionResMasters;
	}

	public LogTbStartTransactionResMaster addLogTbStartTransactionResMaster(
			LogTbStartTransactionResMaster logTbStartTransactionResMaster) {
		getLogTbStartTransactionResMasters().add(logTbStartTransactionResMaster);
		logTbStartTransactionResMaster.setLogTbStartTransactionReqMaster(this);

		return logTbStartTransactionResMaster;
	}

	public LogTbStartTransactionResMaster removeLogTbStartTransactionResMaster(
			LogTbStartTransactionResMaster logTbStartTransactionResMaster) {
		getLogTbStartTransactionResMasters().remove(logTbStartTransactionResMaster);
		logTbStartTransactionResMaster.setLogTbStartTransactionReqMaster(null);

		return logTbStartTransactionResMaster;
	}

	public TbApplicationMaster getTbApplicationMaster() {
		return this.tbUpdateApplicationMaster;
	}

	public void setTbApplicationMaster(TbApplicationMaster tbUpdateApplicationMaster) {
		this.tbUpdateApplicationMaster = tbUpdateApplicationMaster;
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

	public TbApplicationMaster getTbUpdateApplicationMaster() {
		return tbUpdateApplicationMaster;
	}

	public void setTbUpdateApplicationMaster(TbApplicationMaster tbUpdateApplicationMaster) {
		this.tbUpdateApplicationMaster = tbUpdateApplicationMaster;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

	
}