package belmoz.dializ.pacient.dao;

import org.springframework.data.repository.CrudRepository;

import belmoz.dializ.pacient.model.Pacient;

public interface PacientsRepository extends CrudRepository<Pacient, String> {

}
