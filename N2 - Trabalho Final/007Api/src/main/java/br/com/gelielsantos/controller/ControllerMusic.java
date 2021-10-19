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

import br.com.gelielsantos.model.ModelMusic;
import br.com.gelielsantos.service.ServiceMusic;


@RestController
@RequestMapping("/music")
public class ControllerMusic {

	@Autowired
	private ServiceMusic serviceMusic;
	
	@GetMapping
	public List<ModelMusic> findAll(){
		return serviceMusic.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<ModelMusic> findOne(@PathVariable int id){
		return serviceMusic.findOne(id);
	}
	
	@PostMapping
	public String insert(@RequestBody ModelMusic modelMusic) {
		try {
			return serviceMusic.insertOrUpdate(modelMusic);
		}catch (Exception e) {
			return null;
		}
	}
	
	@PutMapping
	public String update(@RequestBody ModelMusic modelMusic) {
		return serviceMusic.insertOrUpdate(modelMusic);
	}
	
	@DeleteMapping("/{id}")
	public String remove(@PathVariable int id) {
		return serviceMusic.remove(id);
	}
	
}
