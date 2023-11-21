package flentas.senp.updatelan.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import flentas.senp.updatelan.model.BsaOnlineGenerateLinkRequestModel;

public interface BsaOnlineGenerateLinkRequestRepository extends CrudRepository<BsaOnlineGenerateLinkRequestModel, Integer> {

	@Query(value="SELECT * FROM senp_middleware_bsa.log_bsaonline_generatelink_req WHERE senp_middleware_bsa.log_bsaonline_generatelink_req.txnid=:transactionId ",nativeQuery = true)
	public BsaOnlineGenerateLinkRequestModel findByClientId(@Param("transactionId") String transactionId);

	@Transactional
	@Modifying
	@Query(value="UPDATE senp_middleware_bsa.log_bsaonline_generatelink_req SET lan= :lan_id, cif=:cif WHERE senp_middleware_bsa.log_bsaonline_generatelink_req.txnId=:transactionId\n",nativeQuery = true)
	public int updateById(String transactionId, String lan_id, String cif);
}
