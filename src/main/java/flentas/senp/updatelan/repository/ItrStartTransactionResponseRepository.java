package flentas.senp.updatelan.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import flentas.senp.updatelan.model.ItrStartTransactionResponseModel;

@Repository
public interface ItrStartTransactionResponseRepository extends CrudRepository<ItrStartTransactionResponseModel,Integer> {

	@Query(value="SELECT * FROM senp_middleware_itr.log_itr_start_transaction_res WHERE senp_middleware_itr.log_itr_start_transaction_res.transactionid=:perfiosTransactionId",nativeQuery = true)
	public ItrStartTransactionResponseModel findByTransactionId(@Param("perfiosTransactionId") String perfiosTransactionId);

	@Transactional
	@Modifying
	@Query(value="UPDATE senp_middleware_itr.log_itr_start_transaction_res SET lan_id= :lan_id,cif=:cif WHERE senp_middleware_itr.log_itr_start_transaction_res.transactionid=:perfiosTransactionId\n",nativeQuery = true)
	public int updateByTransactionId(@Param("perfiosTransactionId")String perfiosTransactionId,@Param("lan_id") String lan_id,@Param("cif") String cif );
	
}
