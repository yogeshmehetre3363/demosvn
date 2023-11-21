package flentas.senp.updatelan.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import flentas.senp.updatelan.model.ItrCallbackRequestModel;

@Repository
public interface ItrCallbackRequestRepository extends CrudRepository<ItrCallbackRequestModel,Integer> {

	
	
	@Transactional
	@Modifying
	@Query(value="UPDATE senp_middleware_itr.log_Itr_callback_req_master SET lan_id= :lan_id, cif=:cif WHERE senp_middleware_itr.log_Itr_callback_req_master.perfiosTransactionId=:perfiosTransactionId\n",nativeQuery = true)
	public int updateById(@Param("perfiosTransactionId") String perfiosTransactionId,@Param("lan_id")String lan_id, @Param("cif")String cif);
	
}
