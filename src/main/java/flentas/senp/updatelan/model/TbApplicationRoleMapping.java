package flentas.senp.updatelan.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the tb_application_role_mapping database table.
 * 
 */
@Entity
@Table(name="tb_application_role_mapping")
@NamedQuery(name="TbApplicationRoleMapping.findAll", query="SELECT t FROM TbApplicationRoleMapping t")
public class TbApplicationRoleMapping implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer napplicationroleid;

	private Long ncreatedby;

	private Timestamp ncreatedon;

	private Long nmodifiedby;

	private Timestamp nmodifiedon;

	private Integer nstatus;

	//bi-directional many-to-one association to TbApplicationMaster
	@ManyToOne
	@JoinColumn(name="napplicationid")
	private TbApplicationMaster tbApplicationMaster;

	//bi-directional many-to-one association to TbRoleMaster
	@ManyToOne
	@JoinColumn(name="nroleid")
	private TbRoleMaster tbRoleMaster;

	public TbApplicationRoleMapping() {
	}

	public Integer getNapplicationroleid() {
		return this.napplicationroleid;
	}

	public void setNapplicationroleid(Integer napplicationroleid) {
		this.napplicationroleid = napplicationroleid;
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

	public Integer getNstatus() {
		return this.nstatus;
	}

	public void setNstatus(Integer nstatus) {
		this.nstatus = nstatus;
	}

	public TbApplicationMaster getTbApplicationMaster() {
		return this.tbApplicationMaster;
	}

	public void setTbApplicationMaster(TbApplicationMaster tbApplicationMaster) {
		this.tbApplicationMaster = tbApplicationMaster;
	}

	public TbRoleMaster getTbRoleMaster() {
		return this.tbRoleMaster;
	}

	public void setTbRoleMaster(TbRoleMaster tbRoleMaster) {
		this.tbRoleMaster = tbRoleMaster;
	}

}