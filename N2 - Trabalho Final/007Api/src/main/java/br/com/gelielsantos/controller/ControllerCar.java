package br.com.gelielsantos.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gelielsantos.model.ModelCar;
import br.com.gelielsantos.service.ServiceCar;


@RestController
@RequestMapping("/car")
public class ControllerCar {

	@Autowired
	private ServiceCar serviceCar;
	
	@GetMapping
	public List<ModelCar> findAll(){
		return serviceCar.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<ModelCar> findOne(@PathVariable int id){
		return serviceCar.findOne(id);
	}
	
	@PostMapping
	public String insert(@RequestBody ModelCar modelCar) {
		try {
			return serviceCar.insertOrUpdate(modelCar);
		}catch (Exception e) {
			return null;
		}
	}
	
	@PutMapping
	public String update(@RequestBody ModelCar modelCar) {
		return serviceCar.insertOrUpdate(modelCar);
	}
	
	@DeleteMapping("/{id}")
	public String remove(@PathVariable int id) {
		return serviceCar.remove(id);
	}
	
}
