package flentas.senp.updatelan.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import flentas.senp.updatelan.model.BsaInitiateTransactionResponseModel;
import flentas.senp.updatelan.model.CredlinkGstResponseModel;

@Repository
public interface BsaInitiateTransactionResponseRepository extends CrudRepository<BsaInitiateTransactionResponseModel, Integer> {
	
	@Query(value="SELECT * FROM senp_middleware_bsa.log_Bsa_initiateTransaction_res WHERE senp_middleware_bsa.log_Bsa_initiateTransaction_res.perfiosTransactionId= :transactionId",nativeQuery = true)
	public BsaInitiateTransactionResponseModel findByTransactionId(@Param("transactionId") String transactionId);

	@Transactional
	@Modifying
	@Query(value="UPDATE senp_middleware_bsa.log_Bsa_initiateTransaction_res SET lan= :lan_id,cif=:cif WHERE senp_middleware_bsa.log_Bsa_initiateTransaction_res.perfiosTransactionId=:transactionId\n",nativeQuery = true)
	public int updateByTransactionId(@Param("transactionId")String transactionId,@Param("lan_id") String lan_id,@Param("cif") String cif );


}
