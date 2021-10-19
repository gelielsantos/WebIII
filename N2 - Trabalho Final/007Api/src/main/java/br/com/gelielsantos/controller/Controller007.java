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

import br.com.gelielsantos.model.Model007;
import br.com.gelielsantos.service.Service007;


@RestController
@RequestMapping("/actor")
public class Controller007 {

	@Autowired
	private Service007 service007;

	@GetMapping
	public List<Model007> findAll(){
		return service007.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Model007> findOne(@PathVariable int id){
		return service007.findOne(id);
	}
	
	@PostMapping
	public String insert(@RequestBody Model007 model007) {
		try {
			return service007.insertOrUpdate(model007);
		}catch (Exception e) {
			return null;
		}
	}
	
	@PutMapping
	public String update(@RequestBody Model007 model007) {
		return service007.insertOrUpdate(model007);
	}
	
	@DeleteMapping("/{id}")
	public String remove(@PathVariable int id) {
		return service007.remove(id);
	}
	
	
}
