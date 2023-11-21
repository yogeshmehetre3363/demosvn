package flentas.senp.updatelan.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import flentas.senp.updatelan.model.BsaCallbackRequestModel;

public interface BsaCallbackRequestRepository extends CrudRepository<BsaCallbackRequestModel,Integer>{

	
	@Transactional
	@Modifying
	@Query(value="UPDATE senp_middleware_bsa.log_Bsa_callback_req SET lan= :lan_id, cif=:cif WHERE senp_middleware_bsa.log_Bsa_callback_req.perfiosTransactionId=:transactionId\n",nativeQuery = true)
	public int updateById(@Param("transactionId") String perfiosTransactionId,@Param("lan_id")String lan_id, @Param("cif")String cif);

	@Transactional
	@Modifying
	@Query(value="UPDATE senp_middleware_bsa.log_Bsa_callback_req SET lan= :lan_id, cif=:cif WHERE senp_middleware_bsa.log_Bsa_callback_req.clientTransactionId=:transactionId\n",nativeQuery = true)
	public int updateByClientId(String transactionId, String lan_id, String cif);
	
}
