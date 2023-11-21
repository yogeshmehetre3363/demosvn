package flentas.senp.updatelan.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import flentas.senp.updatelan.model.PatchPdfparsingResponseModel;

@Repository
public interface PatchPdfparsingResponseRepository extends CrudRepository<PatchPdfparsingResponseModel,Integer> {

}
