package loja;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		//Criando os objeto
		Vendedores vend1 = new Vendedores();
		Clientes cli1 = new Clientes();
		Fornecedores for1 = new Fornecedores();
		Produtos pro1 = new Produtos();
		Vendas ven1 = new Vendas();
		Estoque est1 = new Estoque();
		Transportadora trans1 = new Transportadora();
		
		vend1.cessao = "Martelos";
		vend1.idade = "20";
		vend1.nomeVendedor = "Geliel";
		
		cli1.cidade = "Novo Hamburgo";
		cli1.idadeCliente = "50";
		cli1.nomeCliente = "Roger";
		
		for1.cnpj = "0000";
		for1.idadeEmpresa = "130";
		for1.nomeFornecedor = "Batmartelo";
		
		pro1.fornecedor = for1.nomeFornecedor;
		pro1.nomeProduto = "Martelão";
		pro1.vencimento = LocalDate.of(2077, 4, 20);
		
		ven1.vendasDia = "2";
		ven1.vendasMes = "15";
		ven1.vendasSemana = "4";
		
		est1.compra = "20";
		est1.nomeEstoque = pro1.nomeProduto;
		est1.quantidade = "2";
		
		trans1.dataChegada = LocalDate.of(2021, 10, 20);
		trans1.dataPrevista = LocalDate.of(2021, 10, 10);
		trans1.nomeTransportadora = "BatMobile";
		
		System.out.printf("Vendedor %s, idade %s anos da sessão %s \n", vend1.nomeVendedor, vend1.idade , vend1.cessao);
		
		System.out.printf("Cliente %s, idade %s anos da cidade de %s \n", cli1.nomeCliente, cli1.idadeCliente , cli1.cidade);
		
		System.out.printf("Produto da Empresa %s, %s anos no mercado. Do CNPJ %s \n", for1.nomeFornecedor, for1.idadeEmpresa , for1.cnpj);
		
		System.out.printf("Produto Vendido %s, fornecido por %s. Vencimento em %s \n", pro1.nomeProduto, pro1.fornecedor , pro1.vencimento);
		
		System.out.printf("Essa venda foi de numero %s do dia, %s da semana e %s do mês \n", ven1.vendasDia, ven1.vendasSemana , ven1.vendasMes);
		
		System.out.printf("Estoque de %s são %s unidades. %s devem ser compradas de reposição. \n", est1.nomeEstoque, est1.quantidade , est1.compra);
		
		System.out.printf( "A transportadora %s deve entregar em %s se for adquirido até %s \n", trans1.nomeTransportadora, trans1.dataChegada , trans1.dataPrevista);
		
	}
	
}
