package loja;

public class Fornecedores {

	private String nomeFornecedor;
	private String idadeEmpresa;
	private String cnpj;
	
	public Fornecedores(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getNomeFornecedor() {
		return nomeFornecedor;
	}
	public void setNomeFornecedor(String nomeFornecedor) {
		this.nomeFornecedor = nomeFornecedor;
	}
	public String getIdadeEmpresa() {
		return idadeEmpresa;
	}
	public void setIdadeEmpresa(String idadeEmpresa) {
		this.idadeEmpresa = idadeEmpresa;
	}
	public String getCnpj() {
		return cnpj;
	}
	
	
	
}
