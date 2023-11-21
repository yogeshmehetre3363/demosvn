package flentas.senp.updatelan.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import flentas.senp.updatelan.model.CredlinkGstResponseModel;

@Repository
public interface CredlinkGstResponseRepository extends CrudRepository< CredlinkGstResponseModel,Integer>{

	@Query(nativeQuery = true,value = "select * from senp_middleware_gst.log_gst_credlink_res where log_gst_credlink_res.requestid =:requestid")
	public CredlinkGstResponseModel findByRequestid(String requestid);
	
	@Transactional
	@Modifying
	@Query(value="UPDATE senp_middleware_gst.log_gst_credlink_res SET lan= :lan,cif=:cif WHERE senp_middleware_gst.log_gst_credlink_res.requestId=:requestid\n",nativeQuery = true)
	public int updateByRequestId(@Param("requestid")String requestid,@Param("lan") String lan,@Param("cif") String cif);
}
