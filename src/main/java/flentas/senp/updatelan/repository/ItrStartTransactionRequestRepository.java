package flentas.senp.updatelan.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import flentas.senp.updatelan.model.ItrStartTransactionRequestModel;
import flentas.senp.updatelan.model.ItrStartTransactionResponseModel;

@Repository
public interface ItrStartTransactionRequestRepository extends CrudRepository<ItrStartTransactionRequestModel,Integer> {

	@Transactional
	@Modifying
	@Query(value="UPDATE senp_middleware_itr.log_Itr_Start_Transaction_req_master SET lan_id= :lan_id, cif=:cif WHERE senp_middleware_itr.log_Itr_Start_Transaction_req_master.itr_startTransaction_id=:itr_startTransaction_id\n",nativeQuery = true)
	public int updateById(@Param("itr_startTransaction_id") int itr_startTransaction_id,@Param("lan_id")String lan_id,@Param("cif")String cif);
	
	
}
