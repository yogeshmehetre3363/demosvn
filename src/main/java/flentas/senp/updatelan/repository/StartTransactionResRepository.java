package flentas.senp.updatelan.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import flentas.senp.updatelan.model.ItrStartTransactionResponseModel;
import flentas.senp.updatelan.model.LogTbStartTransactionResMaster;

public interface StartTransactionResRepository  extends CrudRepository<LogTbStartTransactionResMaster, Long>{

	@Query(value ="SELECT * from senp_middleware_fsa.log_tb_start_transaction_res_master WHERE senp_middleware_fsa.log_tb_start_transaction_res_master.sperfiostransactionid = :sperfiostransactionid", nativeQuery = true)
	public LogTbStartTransactionResMaster getStartTxnReqDataByPerfiosId(@Param("sperfiostransactionid") String sperfiostransactionid);
	
	
	@Query(value ="SELECT * from senp_middleware_fsa.log_tb_start_transaction_res_master WHERE senp_middleware_fsa.log_tb_start_transaction_res_master.sperfiostransactionid = :sperfiostransactionid", nativeQuery = true)
	public LogTbStartTransactionResMaster findByPerfiosId(@Param("sperfiostransactionid") String sperfiostransactionid);
	
	
	@Transactional
	@Modifying
	@Query(value="UPDATE senp_middleware_fsa.log_tb_start_transaction_res_master SET lan_id= :lan_id ,cif=:cif WHERE senp_middleware_fsa.log_tb_start_transaction_res_master.sperfiostransactionid=:sperfiostransactionid\n",nativeQuery = true)
	public int updateByTransactionId(@Param("sperfiostransactionid")String sperfiostransactionid,@Param("lan_id") String lan_id,@Param("cif") String cif );
	

	}

