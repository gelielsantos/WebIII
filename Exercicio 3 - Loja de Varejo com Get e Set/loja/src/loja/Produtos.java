package loja;

import java.time.LocalDate;

public class Produtos {

	private String nomeProduto;
	private LocalDate vencimento;
	private Fornecedores fornecedor;
	
	public Produtos(String nomeProduto, LocalDate vencimento, Fornecedores fornecedor) {
		this.nomeProduto = nomeProduto;
		this.vencimento = vencimento;
		this.fornecedor = fornecedor;
	}
	
	public LocalDate getVencimento() {
		return vencimento;
	}
	public void setVencimento(LocalDate vencimento) {
		this.vencimento = vencimento;
	}
	public Fornecedores getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(Fornecedores fornecedor) {
		this.fornecedor = fornecedor;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	
	public String dadosDoProduto()
	{
		StringBuilder dados = new StringBuilder();
		dados.append("Produto ");
		dados.append(this.getNomeProduto());
		dados.append(" com vencimento em ");
		dados.append(this.getVencimento());
		dados.append(" do fornecedor ");
		dados.append(this.fornecedor.getNomeFornecedor());
		return dados.toString();
	}
	
}
