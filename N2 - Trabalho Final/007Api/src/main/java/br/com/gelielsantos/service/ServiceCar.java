package br.com.gelielsantos.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gelielsantos.model.ModelCar;
import br.com.gelielsantos.repository.RepositoryCar;

@Service
public class ServiceCar {
	
	@Autowired
	private RepositoryCar repositoryCar;

	public void InitServiceCar() {
		ModelCar car1 = new ModelCar(1,"Bel Air", "Chevrolet", "James Bond");
		ModelCar car2 = new ModelCar(2,"Mark IV", "Bentley", "James Bond");
		ModelCar car3 = new ModelCar(3,"DB5", "Aston Martin", "James Bond");
		ModelCar car4 = new ModelCar(4,"2000 GT", "Toyota", "Aki");
		ModelCar car5 = new ModelCar(5,"DBS", "Aston Martin", "James Bond");
		ModelCar car6 = new ModelCar(6,"Mustang", "Ford", "Tiffany Case");
		ModelCar car7 = new ModelCar(7,"Hornet", "AMC", "James Bond");
		ModelCar car8 = new ModelCar(8,"Esprit S1", "Lotus", "James Bond");
		ModelCar car9 = new ModelCar(9,"Vanquish", "Aston Martin", "James Bond");
		repositoryCar.save(car1);
		repositoryCar.save(car2);
		repositoryCar.save(car3);
		repositoryCar.save(car4);
		repositoryCar.save(car5);
		repositoryCar.save(car6);
		repositoryCar.save(car7);
		repositoryCar.save(car8);
		repositoryCar.save(car9);
	}
		

	public List<ModelCar> findAll() {
		List<ModelCar> car = new ArrayList<>();
		repositoryCar.findAll().forEach(car::add);
		return car;
	}

	public Optional<ModelCar> findOne(int id) {
		return repositoryCar.findById(id);
	}

	public String insertOrUpdate(ModelCar modelCar) {
		ModelCar res = repositoryCar.save(modelCar);
		if(res != null) {
			return "Inserido/Upado com sucesso";
		}
		
		return "Não funcionou";
	}

	public String remove(int id) {
		repositoryCar.deleteById(id);
		Optional<ModelCar> res = repositoryCar.findById(id);
		if(res != null) {
			return "Deletado com sucesso";
		}
		
		return "Não removeu";
	}

}
