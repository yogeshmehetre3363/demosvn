package flentas.senp.updatelan.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import flentas.senp.updatelan.model.CredlinkGstCallBackRequestModel;
import flentas.senp.updatelan.model.CredlinkGstRequestModel;
import flentas.senp.updatelan.model.ItrStartTransactionResponseModel;

public interface CredlinkGstCallBackRequestRepository extends CrudRepository<CredlinkGstCallBackRequestModel,Integer> {
	
	
//
//	@Query(value="SELECT * FROM senp_middleware_gst.log_Gst_Credlink_CallBack_req WHERE senp_middleware_gst.log_Gst_Credlink_CallBack_req.requestid=:requestid",nativeQuery = true)
//	public CredlinkGstCallBackRequestModel findByRequestid(@Param("requestid") String requestid);

	
	
//	@Transactional
//	@Modifying
//	@Query(value="UPDATE senp_middleware_gst.log_Gst_Credlink_CallBack_req SET lan= :lan WHERE senp_middleware_gst.log_Gst_Credlink_CallBack_req.credlinkCallBackReqId=:credlinkCallBackReqId\n",nativeQuery = true)
//	public int updateById(@Param("credlinkCallBackReqId") int credlinkCallBackReqId,@Param("lan")String lan);
//	
	
	
	@Transactional
	@Modifying
	@Query(value="UPDATE senp_middleware_gst.log_Gst_Credlink_CallBack_req SET lan= :lan ,cif=:cif WHERE senp_middleware_gst.log_Gst_Credlink_CallBack_req.requestid=:requestid\n",nativeQuery = true)
	public int updateById(@Param("requestid") String requestid,@Param("lan")String lan,@Param("cif")String cif);
	
}
