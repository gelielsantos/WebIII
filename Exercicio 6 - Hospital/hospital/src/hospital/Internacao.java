package hospital;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Internacao {
	private Medico medico;
	private Paciente paciente;
	private String observacoes;
	private LocalDate dataInternacao;
	private LocalDate dataAlta;
	

	public Internacao(LocalDate dataInternacao) {
		this.dataInternacao = dataInternacao;
	}

	public Internacao(LocalDate dataInternacao, LocalDate dataAlta, String observacoes) {
		this.dataInternacao = dataInternacao;
		this.dataAlta = dataAlta;
		this.observacoes = observacoes;
	}

	// Getters
	public String getObservacoes() {
		return this.observacoes;
	}

	public LocalDate getDataInternacao() {
		return this.dataInternacao;
	}

	public LocalDate getDataAlta() {
		return this.dataAlta;
	}

	// Setters
	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public void setDataAlta(LocalDate dataAlta) {
		this.dataAlta = dataAlta;
	}
	
	private String formartarData(LocalDate data) {
	if(data != null){
		var formato = DateTimeFormatter.ofPattern("dd/MM/YYYY");
		return formato.format(data);
	}
	return "Data n�o informada!!!";
	}
	
	@Override
	public String toString()
	{
		return String.format("Dados do m�dico:\n%s\nDados do Paciente:\n%s\nDatada da interna��o: %s\nData da alta: %s\nObserva��es:\n%s", this.medico.toString(),this.paciente.toString(), this.formartarData(this.dataInternacao), this.formartarData(this.dataAlta), this.observacoes);
	}
}
