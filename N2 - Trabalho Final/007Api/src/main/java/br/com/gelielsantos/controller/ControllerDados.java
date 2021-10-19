package br.com.gelielsantos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gelielsantos.service.Service007;
import br.com.gelielsantos.service.ServiceCar;
import br.com.gelielsantos.service.ServiceHome;
import br.com.gelielsantos.service.ServiceMusic;


@RestController
@RequestMapping("/dados")
public class ControllerDados {

	@Autowired
	private Service007 service007;
	@Autowired
	private ServiceMusic serviceMusic;
	@Autowired
	private ServiceCar serviceCar;
	
	@GetMapping
	public String dados(){
		service007.InitService007();
		serviceMusic.InitServiceMusic();
		serviceCar.InitServiceCar();
		return "Dados Cadastrados";
	}	
}
