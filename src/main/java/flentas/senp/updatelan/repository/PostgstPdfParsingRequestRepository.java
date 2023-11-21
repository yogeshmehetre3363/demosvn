package flentas.senp.updatelan.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import flentas.senp.updatelan.model.PostgstPdfParsingRequestModel;

@Repository
public interface PostgstPdfParsingRequestRepository extends CrudRepository<PostgstPdfParsingRequestModel,Integer> {

	
	@Transactional
	@Modifying
	@Query(value="UPDATE senp_middleware_gst.log_gst_postPdfParsing_request SET lan= :lan,cif=:cif WHERE senp_middleware_gst.log_gst_postPdfParsing_request.postPdfReqId=:postPdfReqId\n",nativeQuery = true)
	public int updateByRequestId(@Param("postPdfReqId")int postPdfReqId,@Param("lan") String lan,@Param("cif") String cif);
}
