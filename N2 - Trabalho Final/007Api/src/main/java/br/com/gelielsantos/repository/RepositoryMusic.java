package br.com.gelielsantos.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.gelielsantos.model.ModelMusic;

@Repository
public interface RepositoryMusic extends CrudRepository<ModelMusic,Integer> {

	
}
