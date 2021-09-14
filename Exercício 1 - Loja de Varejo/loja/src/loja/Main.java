package loja;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		//Criando os objeto
		Vendedores vend1 = new Vendedores("Geliel");
		Clientes cli1 = new Clientes("Roger","Novo Hamburgo","50");
		Fornecedores for1 = new Fornecedores("0000");
		Produtos pro1 = new Produtos("Martelão", LocalDate.of(2077, 4, 20), for1);
		Vendas ven1 = new Vendas();
		Estoque est1 = new Estoque(pro1);
		Transportadora trans1 = new Transportadora(LocalDate.of(2021, 10, 20));
		
		vend1.setCessao("Martelos");
		vend1.setIdade("20");
		
		for1.setIdadeEmpresa("130");
		for1.setNomeFornecedor("Batmartelo");
		
		ven1.setVendasDia("2");
		ven1.setVendasMes("15");
		ven1.setVendasSemana("4");
		
		est1.setCompra("20");
		est1.setQuantidade("2");
		
		//trans1.dataChegada = LocalDate.of(2021, 10, 20);
		trans1.setDataPrevista(LocalDate.of(2021, 10, 10));
		trans1.setNomeTransportadora("BatMobile");
		
		System.out.printf(vend1.toString());
		
		System.out.printf(cli1.toString());
		
		System.out.printf(for1.toString());
		
		System.out.printf(pro1.toString());
		
		System.out.printf(ven1.toString());
		
		System.out.printf(est1.toString());
		
		System.out.printf(trans1.toString());
		
	}
	
}
