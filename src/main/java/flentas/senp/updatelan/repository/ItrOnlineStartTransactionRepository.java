package flentas.senp.updatelan.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import flentas.senp.updatelan.model.ItrOnlineStartTransactionRequestModel;
import flentas.senp.updatelan.model.ItrStartTransactionResponseModel;



@Repository 
public interface ItrOnlineStartTransactionRepository extends CrudRepository<ItrOnlineStartTransactionRequestModel, Integer> {

	@Transactional
	@Modifying
	@Query(value="UPDATE senp_middleware_itr.log_tb_itr_online_start_transaction_req_master SET lan= :lan_id,cif=:cif WHERE senp_middleware_itr.log_tb_itr_online_start_transaction_req_master.itr_startTransaction_id=:itr_startTransaction_id\n",nativeQuery = true)
	public int updateById(@Param("itr_startTransaction_id")int itr_startTransaction_id,@Param("lan_id") String lan_id,@Param("cif") String cif );


}
