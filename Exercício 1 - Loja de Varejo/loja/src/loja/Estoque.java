package loja;

public class Estoque {

	private Produtos nomeEstoque;
	private String quantidade;
	private String compra;
	
	public Estoque(Produtos nomeEstoque) {
		this.nomeEstoque = nomeEstoque;
	}
	
	public String getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}
	public String getCompra() {
		return compra;
	}
	public void setCompra(String compra) {
		this.compra = compra;
	}
	public Produtos getNomeEstoque() {
		return nomeEstoque;
	}
	public String dadosDoEstoque()
	{
		StringBuilder dados = new StringBuilder();
		dados.append("Estoque do ");
		dados.append(this.nomeEstoque.getNomeProduto());
		dados.append(" tem ");
		dados.append(this.getQuantidade());
		dados.append(" unidades. ");
		dados.append(this.getCompra());
		dados.append(" devem ser compradas");
		return dados.toString();
	}
	
	public String toString()
	{
		return String.format("Estoque do %s tem %s unidades. %s devem ser compradas\n", this.nomeEstoque.getNomeProduto(), this.quantidade , this.compra);
	}
	
	
	
}
