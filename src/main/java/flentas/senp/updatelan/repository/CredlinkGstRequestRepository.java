package flentas.senp.updatelan.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import flentas.senp.updatelan.model.CredlinkGstRequestModel;

@Repository
public interface CredlinkGstRequestRepository extends CrudRepository<CredlinkGstRequestModel,Integer> {
	
	@Transactional
	@Modifying
	@Query(value="UPDATE senp_middleware_gst.log_Gst_Credlink_req SET lan= :lan,cif=:cif WHERE senp_middleware_gst.log_Gst_Credlink_req.credlinkReqId=:credlinkReqId\n",nativeQuery = true)
	public int updateById(@Param("credlinkReqId") int credlinkReqId,@Param("lan")String lan,@Param("cif")String cif);
	
	
	

}
