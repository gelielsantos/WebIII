package loja;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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
	private String formartarData(LocalDate data) {
		if(data != null){
			var formato = DateTimeFormatter.ofPattern("dd/MM/YYYY");
			return formato.format(data);
		}
		return "Data não informada!!!";
		}
	
	public String toString()
	{
		return String.format("Produto %s, com vencimento %s do fornecedor %s \n", this.nomeProduto, this.formartarData(this.vencimento) , this.fornecedor.getNomeFornecedor());
	}
	
}
