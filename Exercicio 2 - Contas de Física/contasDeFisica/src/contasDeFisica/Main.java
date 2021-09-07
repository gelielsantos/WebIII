package contasDeFisica;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		Calculos calc = new Calculos();
		
			try {
				System.out.println("Digite o valor de Massa");
				calc.massa = teclado.nextFloat();
			} catch (Exception ex) {
				teclado = new Scanner(System.in);
				calc.massa = 0;
			}
			try {
				System.out.println("Digite valor da velocidade Centrípeta");
				calc.velocidadeC = teclado.nextFloat();
			} catch (Exception ex) {
				teclado = new Scanner(System.in);
				calc.velocidadeC = 0;
			}
			try {
				System.out.println("Digite o raio Centrípeta");
				calc.raioC = teclado.nextFloat();
			} catch (Exception ex) {
				teclado = new Scanner(System.in);
				calc.raioC = 0;
			}
			try {
				System.out.println("Digite força Impulso");
				calc.forcaAplicada = teclado.nextFloat();
			} catch (Exception ex) {
				teclado = new Scanner(System.in);
				calc.forcaAplicada = 0;
			}
			try {
				System.out.println("Digite o tempo de Impulso");
				calc.tempoAplicado = teclado.nextFloat();
			} catch (Exception ex) {
				teclado = new Scanner(System.in);
				calc.tempoAplicado = 0;
			}
			try {
				System.out.println("Digite a constante da mola");
				calc.constanteDaMola = teclado.nextFloat();
			} catch (Exception ex) {
				teclado = new Scanner(System.in);
				calc.constanteDaMola = 0;
			}
			try {
				System.out.println("Digite a deformação da mola");
				calc.deformacaoDaMola = teclado.nextFloat();
			} catch (Exception ex) {
				teclado = new Scanner(System.in);
				calc.deformacaoDaMola = 0;
			}
			try {
				System.out.println("Digite o tempo de Viagem");
				calc.tempoViagem = teclado.nextFloat();
			} catch (Exception ex) {
				teclado = new Scanner(System.in);
				calc.tempoViagem = 0;
			}
			try {
				System.out.println("Digite a distância de Viagem");
				calc.distanciaViagem = teclado.nextFloat();
			} catch (Exception ex) {
				teclado = new Scanner(System.in);
				calc.distanciaViagem = 0;
			}
			try {
				System.out.println("Digite a Posição Inicial (MCU)");
				calc.posicaoInicial = teclado.nextFloat();
			} catch (Exception ex) {
				teclado = new Scanner(System.in);
				calc.posicaoInicial = 0;
			}
			try {
				System.out.println("Digite a Tempo do corpo (MRU)");
				calc.tempoCorpo = teclado.nextFloat();
			} catch (Exception ex) {
				teclado = new Scanner(System.in);
				calc.tempoCorpo = 0;
			}
			try {
				System.out.println("Digite a Velocidade do Corpo (MRU)");
				calc.velocidadeCorpo = teclado.nextFloat();
			} catch (Exception ex) {
				teclado = new Scanner(System.in);
				calc.velocidadeCorpo = 0;
			}
			try {
				System.out.println("Digite o tempo de aceleração (MRUV)");
				calc.tempoAceleracao = teclado.nextFloat();
			} catch (Exception ex) {
				teclado = new Scanner(System.in);
				calc.tempoAceleracao = 0;
			}
			try {
				System.out.println("Digite a aceleração (MRUV)");
				calc.aceleracao = teclado.nextFloat();
			} catch (Exception ex) {
				teclado = new Scanner(System.in);
				calc.aceleracao = 0;
			}
		
		System.out.printf("Força Peso: %.2f N \n", calc.forcaPeso());
		System.out.printf("Força Centrípeta: %.2f N \n", calc.forcaCentripeta());
		System.out.printf("Impulso: %.2f N/s \n", calc.impulso());
		System.out.printf("Força Elástica: %.2f N/m \n", calc.forcaElastica());
		System.out.printf("Velocidade Média: %.2f Km/h \n", calc.velocidadeMedia());
		System.out.printf("MRU: %.2f m \n", calc.mru());
		System.out.printf("MRUV: %.2f m \n", calc.mruv());
		

	}

}
