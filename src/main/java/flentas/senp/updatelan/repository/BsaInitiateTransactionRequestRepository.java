package flentas.senp.updatelan.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import flentas.senp.updatelan.model.BsaInitiateTransactionRequestModel;

@Repository
public interface BsaInitiateTransactionRequestRepository extends CrudRepository<BsaInitiateTransactionRequestModel, Integer>{


	@Transactional
	@Modifying
	@Query(value="UPDATE senp_middleware_bsa.log_Bsa_initiateTransaction_req SET lan= :lan_id, cif=:cif WHERE senp_middleware_bsa.log_Bsa_initiateTransaction_req.initiatetransactionreqid=:initiatetransactionreqid\n",nativeQuery = true)
	public int updateById(@Param("initiatetransactionreqid") int initiatetransactionreqid,@Param("lan_id")String lan_id,@Param("cif")String cif);


}
