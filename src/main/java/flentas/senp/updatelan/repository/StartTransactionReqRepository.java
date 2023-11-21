package flentas.senp.updatelan.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import flentas.senp.updatelan.model.LogTbStartTransactionReqMaster;
//import flentas.senp.updatelan.model.TbApplicationMaster;

public interface StartTransactionReqRepository extends CrudRepository<LogTbStartTransactionReqMaster, Long>{
	
	@Transactional
	@Modifying
	@Query(value="UPDATE senp_middleware_fsa.log_tb_start_transaction_req_master SET lan_id= :lan_id,cif=:cif WHERE senp_middleware_fsa.log_tb_start_transaction_req_master.nreqtransactionid=:nreqtransactionid\n",nativeQuery = true)
	public int updateById(@Param("nreqtransactionid") long nreqtransactionid,@Param("lan_id")String lan_id,@Param("cif")String cif);

	

	}

