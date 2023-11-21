package flentas.senp.updatelan.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import flentas.senp.updatelan.model.ItrOnlineStartTransactionOptionalRequestModel;



@Repository
public interface ItrOnlineStartTransactionOptionalRequestRepository extends CrudRepository<ItrOnlineStartTransactionOptionalRequestModel, Integer> { 

}
