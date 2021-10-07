package br.com.gelielsantos.model;

import java.util.Map;

public class ModelHome {
	
	private Map<String, String> ator;
	private Map<String, String> carro;
	private Map<String, String> musica;
	
	public ModelHome(Map<String, String> ator,Map<String, String> carro, Map<String, String> musica) {
		this.ator = ator;
		this.carro = carro;
		this.musica = musica;
	}

	public Map<String, String> getAtor() {
		return ator;
	}

	public void setAtor(Map<String, String> ator) {
		this.ator = ator;
	}

	public Map<String, String> getCarro() {
		return carro;
	}

	public void setCarro(Map<String, String> carro) {
		this.carro = carro;
	}

	public Map<String, String> getMusica() {
		return musica;
	}

	public void setMusica(Map<String, String> musica) {
		this.musica = musica;
	}

	

}
