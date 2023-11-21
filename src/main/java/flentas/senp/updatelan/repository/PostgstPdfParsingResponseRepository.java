package flentas.senp.updatelan.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import flentas.senp.updatelan.model.CredlinkGstResponseModel;
import flentas.senp.updatelan.model.PostgstPdfParsingResponseModel;

@Repository
public interface PostgstPdfParsingResponseRepository extends CrudRepository<PostgstPdfParsingResponseModel,Integer>    {
	
	
	@Query(nativeQuery = true,value = "select * from senp_middleware_gst.log_gst_postPdfParsing_response where log_gst_postPdfParsing_response.requestId =:requestId")
	public PostgstPdfParsingResponseModel findByRequestid(String requestId);
	
	@Transactional
	@Modifying
	@Query(value="UPDATE senp_middleware_gst.log_gst_postPdfParsing_response SET lan= :lan, cif=:cif WHERE senp_middleware_gst.log_gst_postPdfParsing_response.requestId=:Transaction_Id\n",nativeQuery = true)
	public int updateByRequestId(@Param("Transaction_Id")String Transaction_Id,@Param("lan") String lan,@Param("cif") String cif );

}
