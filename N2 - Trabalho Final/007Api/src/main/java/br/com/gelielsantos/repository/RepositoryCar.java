package br.com.gelielsantos.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.gelielsantos.model.ModelCar;

@Repository
public interface RepositoryCar extends CrudRepository<ModelCar,Integer> {

	
}
