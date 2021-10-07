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

import br.com.gelielsantos.model.ModelMusic;
import br.com.gelielsantos.service.ServiceMusic;


@RestController
@RequestMapping("/musica")
public class ControllerMusic {

	@Autowired
	private ServiceMusic service007;
	
	@GetMapping
	public List<ModelMusic> findAll(){
		return service007.findAll();
	}
	
	@GetMapping("/{name}")
	public ModelMusic findOne(@PathVariable String name) {
		return service007.findOne(name);
	}
	
	@PostMapping
	public Map<String, String> insert(@RequestBody ModelMusic model007){
		return service007.insert(model007);
	}
	
	@PutMapping
	public Map<String,String> edit(@RequestBody ModelMusic model007){
		return service007.edit(model007);
	}
	
	@DeleteMapping("/{name}")
	public Map<String,String> remove(@PathVariable String name){
		return service007.remove(name);
	}
	
}
