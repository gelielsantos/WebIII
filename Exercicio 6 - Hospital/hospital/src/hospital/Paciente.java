package hospital;

public class Paciente {
	private String nomeCompleto;
	private String rg;
	private String cpf;
	private String telefone;
	private Endereco endereco;
	
	public Paciente(String nomeCompleto, String cpf, String telefone) {
		this.nomeCompleto = nomeCompleto;
		this.cpf = cpf;
		this.telefone = telefone;
		// Adicionar a tua lógica
	}
	public Paciente(String cpf) {
		this.cpf = cpf;
	}
	
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public String getRg() {
		return rg;
	}
	public String getCpf() {
		return cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}	
	
	@Override
	public String toString()
	{
		return String.format("Nome: %s\tTelefone: %s\t Endereço: %s", this.nomeCompleto, this.telefone, this.endereco.toString());
	}
}
