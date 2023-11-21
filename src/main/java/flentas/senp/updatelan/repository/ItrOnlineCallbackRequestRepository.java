package flentas.senp.updatelan.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import flentas.senp.updatelan.model.ItrCallbackRequestModel;
import flentas.senp.updatelan.model.ItrOnlineCallbackRequestModel;

@Repository
public interface ItrOnlineCallbackRequestRepository extends CrudRepository<ItrOnlineCallbackRequestModel,Integer> {

	@Transactional
	@Modifying
	@Query(value="UPDATE senp_middleware_itr.log_itr_online_callback_req_master SET lan= :lan_id, cif=:cif WHERE senp_middleware_itr.log_itr_online_callback_req_master.perfiosTransactionId=:perfiosTransactionId\n",nativeQuery = true)
	int updateById(String perfiosTransactionId, String lan_id, String cif);

}
