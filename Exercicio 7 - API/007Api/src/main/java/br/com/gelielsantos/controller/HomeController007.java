package br.com.gelielsantos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gelielsantos.model.ModelHome;
import br.com.gelielsantos.service.ServiceHome;

@RestController
@RequestMapping("/")
public class HomeController007 {
	
	@Autowired
	private ServiceHome serviceHome;
	
	@GetMapping
	public List<ModelHome> findAll(){
		return serviceHome.findAll();
	}
}
