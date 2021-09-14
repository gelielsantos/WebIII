package loja;

public class Clientes {

	private String nomeCliente;
	private String cidade;
	private String idadeCliente;
	
	public Clientes(String nomeCliente, String cidade, String idadeCliente) {
		this.nomeCliente = nomeCliente;
		this.cidade = cidade;
		this.idadeCliente = idadeCliente;
	}
	
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getIdadeCliente() {
		return idadeCliente;
	}
	public void setIdadeCliente(String idadeCliente) {
		this.idadeCliente = idadeCliente;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	
	public String toString()
	{
		return String.format("O cliente %s, idade %s anos da cidade de %s \n", this.nomeCliente, this.idadeCliente , this.cidade);
	}
	
	
}
