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
		//vend1.nomeVendedor = "Geliel";
		
		//cli1.cidade = "Novo Hamburgo";
		//cli1.idadeCliente = "50";
		//cli1.nomeCliente = "Roger";
		
		//for1.cnpj = "0000";
		for1.setIdadeEmpresa("130");
		for1.setNomeFornecedor("Batmartelo");
		
		//pro1.fornecedor = for1.nomeFornecedor;
		//pro1.nomeProduto = "Martelão";
		//pro1.vencimento = LocalDate.of(2077, 4, 20);
		
		ven1.setVendasDia("2");
		ven1.setVendasMes("15");
		ven1.setVendasSemana("4");
		
		est1.setCompra("20");
		//est1.nomeEstoque = pro1.nomeProduto;
		est1.setQuantidade("2");
		
		//trans1.dataChegada = LocalDate.of(2021, 10, 20);
		trans1.setDataPrevista(LocalDate.of(2021, 10, 10));
		trans1.setNomeTransportadora("BatMobile");
		
		System.out.printf("Vendedor %s, idade %s anos da sessão %s \n", vend1.getNomeVendedor(), vend1.getIdade() , vend1.getIdade());
		
		System.out.printf(cli1.dadosDoClientes());
		
		System.out.printf("\nProduto da Empresa %s, %s anos no mercado. Do CNPJ %s \n", for1.getNomeFornecedor(), for1.getIdadeEmpresa() , for1.getCnpj());
		
		System.out.printf(pro1.dadosDoProduto());
		
		System.out.printf("\nEssa venda foi de numero %s do dia, %s da semana e %s do mês \n", ven1.getVendasDia(), ven1.getVendasSemana() , ven1.getVendasMes());
		
		System.out.printf(est1.dadosDoEstoque());
		
		System.out.printf("\nA transportadora %s entregou em %s porém a previsão era %s \n", trans1.getNomeTransportadora(), trans1.getDataChegada() , trans1.getDataPrevista());
		
	}
	
}
