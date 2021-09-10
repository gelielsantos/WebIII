package loja;

import java.time.LocalDate;

public class Transportadora {

	private String nomeTransportadora;
	private LocalDate dataPrevista;
	private LocalDate dataChegada;
	
	public Transportadora(LocalDate dataChegada) {
		this.dataChegada = dataChegada;
	}
	
	public String getNomeTransportadora() {
		return nomeTransportadora;
	}
	public void setNomeTransportadora(String nomeTransportadora) {
		this.nomeTransportadora = nomeTransportadora;
	}
	public LocalDate getDataPrevista() {
		return dataPrevista;
	}
	public void setDataPrevista(LocalDate dataPrevista) {
		this.dataPrevista = dataPrevista;
	}
	public LocalDate getDataChegada() {
		return dataChegada;
	}
	
	
}
