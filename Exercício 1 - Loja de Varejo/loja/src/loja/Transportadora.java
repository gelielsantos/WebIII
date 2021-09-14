package loja;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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
	private String formartarData(LocalDate data) {
		if(data != null){
			var formato = DateTimeFormatter.ofPattern("dd/MM/YYYY");
			return formato.format(data);
		}
		return "Data não informada!!!";
		}
	
	public String toString()
	{
		return String.format("A transportadora %s entregou em %s porém a previsão era %s \n", this.nomeTransportadora, this.formartarData(this.dataChegada) , this.formartarData(this.dataPrevista));
	}
	
}
