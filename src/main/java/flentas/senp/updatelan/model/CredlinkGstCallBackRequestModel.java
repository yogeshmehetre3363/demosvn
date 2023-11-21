/**
 * 
 */
package flentas.senp.updatelan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;

@Entity
@Table(name = "log_Gst_Credlink_CallBack_req",schema="senp_middleware_gst")
@TypeDefs({ @TypeDef(name = "json", typeClass = JsonBinaryType.class) })
public class CredlinkGstCallBackRequestModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int credlinkCallBackReqId;
	
	@Type(type = "json")
	@Column(name = "callBackData", columnDefinition = "jsonb")
	public String callBackData;
	public String lan;
	@Column(name = "triggerby")
	public String user;	
	public String requestid;
	public String cif;
	public int getCredlinkCallBackReqId() {
		return credlinkCallBackReqId;
	}

	public void setCredlinkCallBackReqId(int credlinkCallBackReqId) {
		this.credlinkCallBackReqId = credlinkCallBackReqId;
	}

	public String getCallBackData() {
		return callBackData;
	}

	public void setCallBackData(String callBackData) {
		this.callBackData = callBackData;
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

	public String getRequestid() {
		return requestid;
	}

	public void setRequestid(String requestid) {
		this.requestid = requestid;
	}
	

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}


	
	
}
