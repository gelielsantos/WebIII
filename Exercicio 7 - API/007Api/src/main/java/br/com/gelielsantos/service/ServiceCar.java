package br.com.gelielsantos.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.com.gelielsantos.model.ModelCar;

@Service
public class ServiceCar {
	
	private List<ModelCar> listOfCars = new ArrayList<ModelCar>();

	ServiceCar() {
		listOfCars.add(new ModelCar("Bel Air", "Chevrolet", "James Bond"));
		listOfCars.add(new ModelCar("Mark IV", "Bentley", "James Bond"));
		listOfCars.add(new ModelCar("DB5", "Aston Martin", "James Bond"));
		listOfCars.add(new ModelCar("2000 GT", "Toyota", "Aki"));
		listOfCars.add(new ModelCar("DBS", "Aston Martin", "James Bond"));
		listOfCars.add(new ModelCar("Mustang", "Ford", "Tiffany Case"));
		listOfCars.add(new ModelCar("Hornet", "AMC", "James Bond"));
		listOfCars.add(new ModelCar("Esprit S1", "Lotus", "James Bond"));
		listOfCars.add(new ModelCar("Vanquish", "Aston Martin", "James Bond"));
	}
		

	public List<ModelCar> findAll() {
		return this.listOfCars;
	}

	public ModelCar findOne(String name) {
		for (ModelCar modelCar : listOfCars) {
			if (modelCar.getName().equalsIgnoreCase(name)) {
				return modelCar;
			}
		}
		return null;
	}

	public Map<String, String> insert(ModelCar modelCar) {
		Map<String, String> result = new HashMap<String, String>();
		boolean isSuccess = listOfCars.add(modelCar);
		if (isSuccess) {
			result.put("result", "Carro cadastrado com sucesso!!!");
		} else {
			result.put("result", "Não foi possível cadastrar o carro!!!");
		}
		return result;
	}

	public Map<String, String> edit(ModelCar modelCar) {
		Map<String, String> result = new HashMap<String, String>();

		for (ModelCar element : listOfCars) {
			if (element.getName().equalsIgnoreCase(modelCar.getName())) {
				int index = listOfCars.indexOf(element);
				listOfCars.set(index, modelCar);
				result.put("result", "Carro editado com sucesso!!!");
				return result;
			}
		}
		result.put("result", "Não foi possível editar o Carro!!!");
		return result;
	}

	public Map<String, String> remove(String name) {
		Map<String, String> result = new HashMap<String, String>();
		boolean isSuccess = listOfCars.removeIf((model007) -> model007.getName().equalsIgnoreCase(name));
		if (isSuccess) {
			result.put("result", "Carro removido com sucesso!!!");
		} else {
			result.put("result", "Não foi possível remover o carro!!!");
		}
		return result;
	}

}
