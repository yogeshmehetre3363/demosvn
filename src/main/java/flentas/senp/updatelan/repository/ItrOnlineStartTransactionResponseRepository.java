package flentas.senp.updatelan.repository;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import flentas.senp.updatelan.model.ItrOnlineStartTransactionResponseModel;



@Repository
public interface ItrOnlineStartTransactionResponseRepository extends CrudRepository<ItrOnlineStartTransactionResponseModel, Integer> {

	@Query(value="select * from senp_middleware_itr.log_tb_itr_online_start_transaction_res where log_tb_itr_online_start_transaction_res.transactionId = :perfiosTransactionId",nativeQuery = true)
	public ItrOnlineStartTransactionResponseModel findByTransactionId(String perfiosTransactionId);
	
	@Transactional
	@Modifying
	@Query(value="UPDATE senp_middleware_itr.log_tb_itr_online_start_transaction_res SET lan= :lan_id,cif=:cif WHERE senp_middleware_itr.log_tb_itr_online_start_transaction_res.transactionid=:perfiosTransactionId\n",nativeQuery = true)
	public int updateByTransactionId(@Param("perfiosTransactionId")String perfiosTransactionId,@Param("lan_id") String lan_id,@Param("cif") String cif );

}
