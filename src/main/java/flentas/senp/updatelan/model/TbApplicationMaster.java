package flentas.senp.updatelan.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the tb_application_master database table.
 * 
 */
@Entity
@Table(name="tb_application_master")
@NamedQuery(name="TbApplicationMaster.findAll", query="SELECT t FROM TbApplicationMaster t")
public class TbApplicationMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long napplicationid;

	private String napplicationname;

	private String nappid;

	private Integer ncreatedby;

	private Timestamp ncreatedon;

	private Integer nmodifiedby;

	private Timestamp nmodifiedon;

	private Long nstatus;

	private String scallingappid;

	//bi-directional many-to-one association to TbApplicationRoleMapping
	@OneToMany(mappedBy="tbApplicationMaster")
	private List<TbApplicationRoleMapping> tbApplicationRoleMappings;

	public TbApplicationMaster() {
	}

	

	public String getNapplicationname() {
		return this.napplicationname;
	}

	public void setNapplicationname(String napplicationname) {
		this.napplicationname = napplicationname;
	}

	

	public String getNappid() {
		return nappid;
	}



	public void setNappid(String nappid) {
		this.nappid = nappid;
	}



	public Integer getNcreatedby() {
		return this.ncreatedby;
	}

	public void setNcreatedby(Integer ncreatedby) {
		this.ncreatedby = ncreatedby;
	}

	public Timestamp getNcreatedon() {
		return this.ncreatedon;
	}

	public void setNcreatedon(Timestamp ncreatedon) {
		this.ncreatedon = ncreatedon;
	}

	public Integer getNmodifiedby() {
		return this.nmodifiedby;
	}

	public void setNmodifiedby(Integer nmodifiedby) {
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

	public String getScallingappid() {
		return this.scallingappid;
	}

	public void setScallingappid(String scallingappid) {
		this.scallingappid = scallingappid;
	}

	public List<TbApplicationRoleMapping> getTbApplicationRoleMappings() {
		return this.tbApplicationRoleMappings;
	}

	public void setTbApplicationRoleMappings(List<TbApplicationRoleMapping> tbApplicationRoleMappings) {
		this.tbApplicationRoleMappings = tbApplicationRoleMappings;
	}

	public TbApplicationRoleMapping addTbApplicationRoleMapping(TbApplicationRoleMapping tbApplicationRoleMapping) {
		getTbApplicationRoleMappings().add(tbApplicationRoleMapping);
		tbApplicationRoleMapping.setTbApplicationMaster(this);

		return tbApplicationRoleMapping;
	}

	public TbApplicationRoleMapping removeTbApplicationRoleMapping(TbApplicationRoleMapping tbApplicationRoleMapping) {
		getTbApplicationRoleMappings().remove(tbApplicationRoleMapping);
		tbApplicationRoleMapping.setTbApplicationMaster(null);

		return tbApplicationRoleMapping;
	}



	public Long getNapplicationid() {
		return napplicationid;
	}



	public void setNapplicationid(Long napplicationid) {
		this.napplicationid = napplicationid;
	}

}