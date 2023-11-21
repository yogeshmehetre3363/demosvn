package flentas.senp.updatelan.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the tb_role_master database table.
 * 
 */
@Entity
@Table(name="tb_role_master")
@NamedQuery(name="TbRoleMaster.findAll", query="SELECT t FROM TbRoleMaster t")
public class TbRoleMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long nroleid;

	private Long ncreatedby;

	private Timestamp ncreatedon;

	private Long nmodifiedby;

	private Timestamp nmodifiedon;

	private Integer nroletype;

	private Integer nstatus;

	private String sfunctiontype;

	private String sroledesc;

	private String srolename;

	//bi-directional many-to-one association to TbApplicationRoleMapping
	@OneToMany(mappedBy="tbRoleMaster")
	private List<TbApplicationRoleMapping> tbApplicationRoleMappings;

	//bi-directional many-to-one association to TbRolePermissionMapping
	@OneToMany(mappedBy="tbRoleMaster")
	private List<TbRolePermissionMapping> tbRolePermissionMappings;

	public TbRoleMaster() {
	}

	public Long getNroleid() {
		return this.nroleid;
	}

	public void setNroleid(Long nroleid) {
		this.nroleid = nroleid;
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

	public Integer getNroletype() {
		return this.nroletype;
	}

	public void setNroletype(Integer nroletype) {
		this.nroletype = nroletype;
	}

	public Integer getNstatus() {
		return this.nstatus;
	}

	public void setNstatus(Integer nstatus) {
		this.nstatus = nstatus;
	}

	public String getSfunctiontype() {
		return this.sfunctiontype;
	}

	public void setSfunctiontype(String sfunctiontype) {
		this.sfunctiontype = sfunctiontype;
	}

	public String getSroledesc() {
		return this.sroledesc;
	}

	public void setSroledesc(String sroledesc) {
		this.sroledesc = sroledesc;
	}

	public String getSrolename() {
		return this.srolename;
	}

	public void setSrolename(String srolename) {
		this.srolename = srolename;
	}

	public List<TbApplicationRoleMapping> getTbApplicationRoleMappings() {
		return this.tbApplicationRoleMappings;
	}

	public void setTbApplicationRoleMappings(List<TbApplicationRoleMapping> tbApplicationRoleMappings) {
		this.tbApplicationRoleMappings = tbApplicationRoleMappings;
	}

	public TbApplicationRoleMapping addTbApplicationRoleMapping(TbApplicationRoleMapping tbApplicationRoleMapping) {
		getTbApplicationRoleMappings().add(tbApplicationRoleMapping);
		tbApplicationRoleMapping.setTbRoleMaster(this);

		return tbApplicationRoleMapping;
	}

	public TbApplicationRoleMapping removeTbApplicationRoleMapping(TbApplicationRoleMapping tbApplicationRoleMapping) {
		getTbApplicationRoleMappings().remove(tbApplicationRoleMapping);
		tbApplicationRoleMapping.setTbRoleMaster(null);

		return tbApplicationRoleMapping;
	}

	public List<TbRolePermissionMapping> getTbRolePermissionMappings() {
		return this.tbRolePermissionMappings;
	}

	public void setTbRolePermissionMappings(List<TbRolePermissionMapping> tbRolePermissionMappings) {
		this.tbRolePermissionMappings = tbRolePermissionMappings;
	}

	public TbRolePermissionMapping addTbRolePermissionMapping(TbRolePermissionMapping tbRolePermissionMapping) {
		getTbRolePermissionMappings().add(tbRolePermissionMapping);
		tbRolePermissionMapping.setTbRoleMaster(this);

		return tbRolePermissionMapping;
	}

	public TbRolePermissionMapping removeTbRolePermissionMapping(TbRolePermissionMapping tbRolePermissionMapping) {
		getTbRolePermissionMappings().remove(tbRolePermissionMapping);
		tbRolePermissionMapping.setTbRoleMaster(null);

		return tbRolePermissionMapping;
	}

}