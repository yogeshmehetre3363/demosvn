package flentas.senp.updatelan.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import flentas.senp.updatelan.model.PatchPdfparsingRequestModel;

@Repository
public interface PatchPdfparsingRequestRepository extends CrudRepository<PatchPdfparsingRequestModel,Integer>{

	@Transactional
	@Modifying
	@Query(value="UPDATE senp_middleware_gst.log_gst_patchPdfParsing_request SET lan= :lan, cif=:cif WHERE senp_middleware_gst.log_gst_patchPdfParsing_request.requestid=:Transaction_Id\n",nativeQuery = true)
	public int updateByRequestId(@Param("Transaction_Id")String Transaction_Id,@Param("lan") String lan,@Param("cif") String cif );
}
