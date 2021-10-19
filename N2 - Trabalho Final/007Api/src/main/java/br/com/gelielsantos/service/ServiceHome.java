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
		Map<String, String> dados = new HashMap<String, String>();
		dados.put("Inserir dados iniciais", "/dados");
		Map<String, String> ator = new HashMap<String, String>();
		ator.put("Mostrar Atores", "/actor");
		ator.put("Mostrar Somente um", "/actor/primeiroNome");
		ator.put("Adicionar Atores", "/actor");
		ator.put("Editar Atores", "/actor");
		ator.put("Remover Atores", "/actor/id");
		
		Map<String, String> carro = new HashMap<String, String>();
		carro.put("Mostrar Carros", "/car");
		carro.put("Mostrar Somente um", "/car/nomeDoCarroComEspacos");
		carro.put("Adicionar Carros", "/car");
		carro.put("Editar Carros", "/car");
		carro.put("Remover Carros", "/car/id");
		
		Map<String, String> musica = new HashMap<String, String>();
		musica.put("Mostrar Musicas", "/music");
		musica.put("Mostrar Somente uma", "/music/tituloMusicaComEspacos");
		musica.put("Adicionar Musicas", "/music");
		musica.put("Editar Musica", "/music");
		musica.put("Remover Musica", "/music/id");
		
		listOfHome.add(new ModelHome(dados, ator, carro, musica));
	}
	
	public List<ModelHome> findAll() {
		return this.listOfHome;
	}
	
}
