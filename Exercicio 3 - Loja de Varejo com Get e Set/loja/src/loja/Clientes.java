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
	
	public String dadosDoClientes()
	{
		StringBuilder dados = new StringBuilder();
		dados.append("Cliente ");
		dados.append(this.getNomeCliente());
		dados.append(" que reside na cidade de ");
		dados.append(this.getCidade());
		dados.append(" que tem ");
		dados.append(this.getIdadeCliente());
		dados.append(" anos de idade");
		return dados.toString();
	}
	
}
