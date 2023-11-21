package flentas.senp.updatelan.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the tb_permission_master database table.
 * 
 */
@Entity
@Table(name="tb_permission_master")
@NamedQuery(name="TbPermissionMaster.findAll", query="SELECT t FROM TbPermissionMaster t")
public class TbPermissionMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long npermissionid;

	private Long ncreatedby;

	private Timestamp ncreatedon;

	private Integer nisfilter;

	private Long nmodifiedby;

	private Timestamp nmodifiedon;

	private Integer npermissionaccess;

	private Integer nstatus;

	private String spermissiondesc;

	private String spermissionfunctionality;

	private String spermissionname;

	private String spermissionpath;

	//bi-directional many-to-one association to TbRolePermissionMapping
	@OneToMany(mappedBy="tbPermissionMaster")
	private List<TbRolePermissionMapping> tbRolePermissionMappings;

	public TbPermissionMaster() {
	}

	public Long getNpermissionid() {
		return this.npermissionid;
	}

	public void setNpermissionid(Long npermissionid) {
		this.npermissionid = npermissionid;
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

	public Integer getNisfilter() {
		return this.nisfilter;
	}

	public void setNisfilter(Integer nisfilter) {
		this.nisfilter = nisfilter;
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

	public Integer getNpermissionaccess() {
		return this.npermissionaccess;
	}

	public void setNpermissionaccess(Integer npermissionaccess) {
		this.npermissionaccess = npermissionaccess;
	}

	public Integer getNstatus() {
		return this.nstatus;
	}

	public void setNstatus(Integer nstatus) {
		this.nstatus = nstatus;
	}

	public String getSpermissiondesc() {
		return this.spermissiondesc;
	}

	public void setSpermissiondesc(String spermissiondesc) {
		this.spermissiondesc = spermissiondesc;
	}

	public String getSpermissionfunctionality() {
		return this.spermissionfunctionality;
	}

	public void setSpermissionfunctionality(String spermissionfunctionality) {
		this.spermissionfunctionality = spermissionfunctionality;
	}

	public String getSpermissionname() {
		return this.spermissionname;
	}

	public void setSpermissionname(String spermissionname) {
		this.spermissionname = spermissionname;
	}

	public String getSpermissionpath() {
		return this.spermissionpath;
	}

	public void setSpermissionpath(String spermissionpath) {
		this.spermissionpath = spermissionpath;
	}

	public List<TbRolePermissionMapping> getTbRolePermissionMappings() {
		return this.tbRolePermissionMappings;
	}

	public void setTbRolePermissionMappings(List<TbRolePermissionMapping> tbRolePermissionMappings) {
		this.tbRolePermissionMappings = tbRolePermissionMappings;
	}

	public TbRolePermissionMapping addTbRolePermissionMapping(TbRolePermissionMapping tbRolePermissionMapping) {
		getTbRolePermissionMappings().add(tbRolePermissionMapping);
		tbRolePermissionMapping.setTbPermissionMaster(this);

		return tbRolePermissionMapping;
	}

	public TbRolePermissionMapping removeTbRolePermissionMapping(TbRolePermissionMapping tbRolePermissionMapping) {
		getTbRolePermissionMappings().remove(tbRolePermissionMapping);
		tbRolePermissionMapping.setTbPermissionMaster(null);

		return tbRolePermissionMapping;
	}

}