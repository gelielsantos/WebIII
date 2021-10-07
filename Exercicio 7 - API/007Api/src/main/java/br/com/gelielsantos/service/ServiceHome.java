package br.com.gelielsantos.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.springframework.stereotype.Service;

import br.com.gelielsantos.model.ModelHome;

@Service
public class ServiceHome {
	
	private List<ModelHome> listOfHome = new ArrayList<ModelHome>();
	
	ServiceHome(){
		Map<String, String> ator = new HashMap<String, String>();
		ator.put("Mostrar Atores", "/ator");
		ator.put("Mostrar Somente um", "/ator/primeiroNome");
		ator.put("Adicionar Atores", "/ator");
		ator.put("Editar Atores", "/ator");
		ator.put("Remover Atores", "/ator");
		
		Map<String, String> carro = new HashMap<String, String>();
		carro.put("Mostrar Carros", "/carro");
		carro.put("Mostrar Somente um", "/carro/nomeDoCarroComEspacos");
		carro.put("Adicionar Carros", "/carro");
		carro.put("Editar Carros", "/carro");
		carro.put("Remover Carros", "/carro");
		
		Map<String, String> musica = new HashMap<String, String>();
		musica.put("Mostrar Musicas", "/musica");
		musica.put("Mostrar Somente uma", "/musica/tituloMusicaComEspacos");
		musica.put("Adicionar Musicas", "/musica");
		musica.put("Editar Musica", "/musica");
		musica.put("Remover Musica", "/musica");
		
		listOfHome.add(new ModelHome(ator, carro, musica));
	}
	
	public List<ModelHome> findAll() {
		return this.listOfHome;
	}
	
}
