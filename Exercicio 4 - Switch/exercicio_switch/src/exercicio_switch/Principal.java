package exercicio_switch;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		//Exercício 1
		
//		System.out.println("Digitar o total da população da cidade:");
//		float total = teclado.nextFloat();
//		System.out.println("Escolha o tipo de taxa para calcular:");
//		System.out.println("1-Natalidade");
//		System.out.println("2-Mortalidade");
//		System.out.println("Ou qualquer outro número para sair");
//		byte tipo = teclado.nextByte();
//		
//		switch(tipo) {
//		case 1:
//			System.out.println("Digite o total de crianças nascidas no ano:");
//			float nascidas = teclado.nextFloat();
//			System.out.printf("A natalidade é %.2f a cada 1000 habitantes", calculo(total, nascidas));
//			break;
//		case 2:
//			System.out.println("Digite o total de óbitos no ano:");
//			float mortalidade = teclado.nextFloat();
//			System.out.printf("A mortalidade é %.2f a cada 1000 habitantes", calculo(total, mortalidade));
//			break;
//			default:
//				System.out.println("Obrigado pela preferência!!!");
//		}
		
		// Exercício 2
		
		System.out.println("Digitar o total da Venda:");
		float total = teclado.nextFloat();
		System.out.println("Escolha o tipo de pagamento:");
		System.out.println("1-Á Vista");
		System.out.println("2-Á Prazo (30 dias)");
		System.out.println("3-Á prazo parcelado");
		System.out.println("Ou qualquer outro número para sair");
		byte tipo = teclado.nextByte();
		
		switch(tipo) {
		case 1:
			total = total*0.9f;
			System.out.println("Á Vista");
			System.out.printf("Valor final: %.2f", total);
			break;
		case 2:
			total = total*1.05f;
			System.out.println("Á Prazo (30 dias)");
			System.out.printf("Valor final: %.2f", total);
			break;
		case 3:
			System.out.println("Número de Parcelas:");
			int parcelas = teclado.nextInt();
			float valorMes = total/parcelas;
			valorMes = valorMes*1.015f;
			System.out.println("Á prazo parcelado");
			System.out.printf("Valor da Parcela: %.2f\nNúmero de Parcelas: %d", valorMes,parcelas);
			break;
			default:
				System.out.println("Obrigado pela preferência!!!");
		}

	}
	
	private static float calculo(float totalPopulacao, float taxaescolhida)
	{
		return (taxaescolhida * 1000)/totalPopulacao;
	}

}
