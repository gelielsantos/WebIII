package sistemaBancario;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Clientes cli = new Clientes();
		Gerentes ger = new Gerentes();
		Contas con = new Contas();
		byte opcao = 0;
		
		System.out.println("Digite uma opção (1 - Gerentes, 2 - Clientes, 3 - Contas)");
		System.out.println("Ou qualquer outro número para sair");
		System.out.println("Digite a opção:");
 		opcao = teclado.nextByte();
		
		switch(opcao){
		case 1:
			ger.cadastroGerente();
			ger.buscaGerente();
			ger.removeGerente();
			break;
		case 2:
			cli.cadastroCliente();
			cli.buscaCliente();
			cli.removeCliente();
			break;
		case 3:
			con.cadastroContas();
			con.buscaContas();
			con.removeContas();
			break;
			default:
				System.out.println("Obrigado pela preferência");
				break;
		}
		

	}

}
