package flentas.senp.updatelan.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


import flentas.senp.updatelan.model.TbApplicationMaster;
import flentas.senp.updatelan.model.TbApplicationRoleMapping;

public interface ApplicationRoleMasterRepository extends CrudRepository<TbApplicationRoleMapping, Long>{

	//Query to get the Permission for a particular Role
//	@Query(value = "SELECT tb_pm.nPermissionId, tb_pm.sPermissionName, tb_pm.sPermissionDesc, tb_pm.sPermissionPath, tb_pm.nCreatedBy, tb_pm.nModifiedBy, tb_pm.nCreatedOn, tb_pm.nModifiedOn, tb_pm.nStatus, tb_pm.nPermissionAccess, tb_pm.sPermissionFunctionality\n" +
//	"FROM tb_permission_master tb_pm JOIN tb_role_permission_mapping tb_rpm on tb_pm.nPermissionId = tb_rpm.nPermissionId\n" +
//	"JOIN tb_role_master tb_rm on tb_rm.nRoleId = tb_rpm.nRoleId\n" +
//	"WHERE tb_rm.nRoleId = :nRoleId\n" +
//	"group by tb_pm.sPermissionFunctionality , tb_pm.nPermissionAccess\n" +
//	"order by tb_pm.sPermissionFunctionality, tb_pm.nPermissionAccess DESC", nativeQuery = true)
//	public List<TbPermissionMaster> getPermissionByRoleId(@Param("nRoleId") long nRoleId);
	@Query(value = "select count(tb_updatelan_application_role_mapping.nroleid) from tb_updatelan_application_role_mapping where tb_updatelan_application_role_mapping.napplicationid= :napplicationid and tb_updatelan_application_role_mapping.nroleid IN (select tb_updatelan_role_permission_mapping.nroleid from tb_updatelan_role_permission_mapping where tb_updatelan_role_permission_mapping.nPermissionId= (select tb_updatelan_permission_master.nPermissionId from tb_updatelan_permission_master where tb_updatelan_permission_master.spermissionpath=:spermissionpath))", nativeQuery = true)
	public int checkUserPermission(@Param("napplicationid") Long nappid, @Param("spermissionpath") String spermissionpath);

	@Query(value ="SELECT * from tb_updatelan_application_master WHERE tb_updatelan_application_master.nclientid = :clientid", nativeQuery = true)
	public TbApplicationMaster getClientId(@Param("clientid") String clientid);
	//to get Permission Name
	//public TbPermissionMaster findOneBySPermissionPath(String path);

	}
