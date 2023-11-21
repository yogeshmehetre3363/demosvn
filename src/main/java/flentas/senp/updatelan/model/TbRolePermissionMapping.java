package flentas.senp.updatelan.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the tb_role_permission_mapping database table.
 * 
 */
@Entity
@Table(name="tb_role_permission_mapping")
@NamedQuery(name="TbRolePermissionMapping.findAll", query="SELECT t FROM TbRolePermissionMapping t")
public class TbRolePermissionMapping implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer nrolepermissionid;

	private Long ncreatedby;

	private Timestamp ncreatedon;

	private Long nmodifiedby;

	private Timestamp nmodifiedon;

	private Integer nstatus;

	//bi-directional many-to-one association to TbPermissionMaster
	@ManyToOne
	@JoinColumn(name="npermissionid")
	private TbPermissionMaster tbPermissionMaster;

	//bi-directional many-to-one association to TbRoleMaster
	@ManyToOne
	@JoinColumn(name="nroleid")
	private TbRoleMaster tbRoleMaster;

	public TbRolePermissionMapping() {
	}

	public Integer getNrolepermissionid() {
		return this.nrolepermissionid;
	}

	public void setNrolepermissionid(Integer nrolepermissionid) {
		this.nrolepermissionid = nrolepermissionid;
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

	public TbPermissionMaster getTbPermissionMaster() {
		return this.tbPermissionMaster;
	}

	public void setTbPermissionMaster(TbPermissionMaster tbPermissionMaster) {
		this.tbPermissionMaster = tbPermissionMaster;
	}

	public TbRoleMaster getTbRoleMaster() {
		return this.tbRoleMaster;
	}

	public void setTbRoleMaster(TbRoleMaster tbRoleMaster) {
		this.tbRoleMaster = tbRoleMaster;
	}

}