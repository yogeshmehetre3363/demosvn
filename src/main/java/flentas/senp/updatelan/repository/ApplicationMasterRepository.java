package flentas.senp.updatelan.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


import flentas.senp.updatelan.model.TbApplicationMaster;
import flentas.senp.updatelan.model.TbPermissionMaster;

public interface ApplicationMasterRepository extends CrudRepository<TbApplicationMaster, Long>{

	//Query to get the Permission for a particular Role
//	@Query(value = "SELECT tb_pm.nPermissionId, tb_pm.sPermissionName, tb_pm.sPermissionDesc, tb_pm.sPermissionPath, tb_pm.nCreatedBy, tb_pm.nModifiedBy, tb_pm.nCreatedOn, tb_pm.nModifiedOn, tb_pm.nStatus, tb_pm.nPermissionAccess, tb_pm.sPermissionFunctionality\n" +
//	"FROM tb_permission_master tb_pm JOIN tb_role_permission_mapping tb_rpm on tb_pm.nPermissionId = tb_rpm.nPermissionId\n" +
//	"JOIN tb_role_master tb_rm on tb_rm.nRoleId = tb_rpm.nRoleId\n" +
//	"WHERE tb_rm.nRoleId = :nRoleId\n" +
//	"group by tb_pm.sPermissionFunctionality , tb_pm.nPermissionAccess\n" +
//	"order by tb_pm.sPermissionFunctionality, tb_pm.nPermissionAccess DESC", nativeQuery = true)
//	public List<TbPermissionMaster> getPermissionByRoleId(@Param("nRoleId") long nRoleId);

	@Query(value ="SELECT * from tb_updatelan_application_master WHERE tb_updatelan_application_master.nappid = :appid", nativeQuery = true)
	public TbApplicationMaster getApplicationDataByAppId(@Param("appid") String appid);
	//to get Permission Name
	//public TbPermissionMaster findOneBySPermissionPath(String path);

	}