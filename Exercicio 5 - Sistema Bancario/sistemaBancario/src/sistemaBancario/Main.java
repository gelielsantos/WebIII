package sistemaBancario;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Clientes cli = new Clientes();
		Gerentes ger = new Gerentes();
		Contas con = new Contas();
		byte opcao = 0;
		
		System.out.println("Digite uma op��o (1 - Gerentes, 2 - Clientes, 3 - Contas)");
		System.out.println("Ou qualquer outro n�mero para sair");
		System.out.println("Digite a op��o:");
 		opcao = teclado.nextByte();
		
		switch(opcao){
		case 1:
			ger.cadastroGerente();
			ger.buscaGerente();
			ger.editarGerente();
			ger.removeGerente();
			System.out.println(ger.listarGerente());
			break;
		case 2:
			cli.cadastroCliente();
			cli.buscaCliente();
			cli.editarCliente();
			cli.removeClientes();
			System.out.println(cli.listarCliente());
			break;
		case 3:
			con.cadastroConta();;
			con.buscaConta();
			con.editarConta();
			con.removeConta();
			System.out.println(con.listarConta());
			break;
			default:
				System.out.println("Obrigado pela prefer�ncia");
				break;
		}
		

	}

}
