package br.com.gelielsantos.controller;

import java.util.List;
import java.util.Map;

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
@RequestMapping("/carro")
public class ControllerCar {

	@Autowired
	private ServiceCar serviceCar;
	
	@GetMapping
	public List<ModelCar> findAll(){
		return serviceCar.findAll();
	}
	
	@GetMapping("/{name}")
	public ModelCar findOne(@PathVariable String name) {
		return serviceCar.findOne(name);
	}
	
	@PostMapping
	public Map<String, String> insert(@RequestBody ModelCar modelCar){
		return serviceCar.insert(modelCar);
	}
	
	@PutMapping
	public Map<String,String> edit(@RequestBody ModelCar modelCar){
		return serviceCar.edit(modelCar);
	}
	
	@DeleteMapping("/{name}")
	public Map<String,String> remove(@PathVariable String name){
		return serviceCar.remove(name);
	}
	
}
