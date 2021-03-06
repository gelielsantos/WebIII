package loja;

public class Vendedores {

	private String nomeVendedor;
	private String cessao;
	private String idade;
	
	public Vendedores(String nomeVendedor) {
		this.nomeVendedor = nomeVendedor;
	}
	
	public String getCessao() {
		return cessao;
	}
	public void setCessao(String cessao) {
		this.cessao = cessao;
	}
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	public String getNomeVendedor() {
		return nomeVendedor;
	}
	
	public String toString()
	{
		return String.format("Vendedor %s, idade %s anos da sess?o %s \n", this.nomeVendedor, this.idade , this.cessao);
	}
	
	
}
