package exerciciosIfElse;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		Calculos calc = new Calculos();
//		
		// Tri�ngulo
		
		System.out.println("Digite o primeiro lado do tri�ngulo:");
		float num1 = teclado.nextFloat();
		System.out.println("Digite o segundo lado do tri�ngulo:");
		float num2 = teclado.nextFloat();
		System.out.println("Digite o terceiro lado do tri�ngulo:");
		float num3 = teclado.nextFloat();
		
		String resultado = calc.tipoTriangulo(num1, num2, num3);
		
		System.out.printf("\nO tri�ngulo � %s", resultado);
		
		//Ano Bissexto
		
//		System.out.println("Digite o ano para teste:");
//		int ano1 = teclado.nextInt();
//		
//		String resultadoAno = calc.anoBissexto(ano1);
//		
//		System.out.printf("\n%s", resultadoAno);
		
		//Crime
		
//		System.out.println("Digite 1 para n�o e 2 para sim\n");
//		System.out.println("Telefonou para a v�tima?");
//		int res1 = teclado.nextInt();
//		System.out.println("Esteve no local do crime?");
//		int res2 = teclado.nextInt();
//		System.out.println("Mora perto da v�tima?");
//		int res3 = teclado.nextInt();
//		System.out.println("Devia para a v�tima?");
//		int res4 = teclado.nextInt();
//		System.out.println("J� trabalhou com a v�tima?");
//		int res5 = teclado.nextInt();
//		
//		String resultadoCrime = calc.crime(res1, res2, res3, res4, res5);
//		
//		System.out.printf("\nVoc� � %s", resultadoCrime);
//		
		//Gasolina
		
//		System.out.println("Bem vindo a Pre�os Quentes Postos");
//		System.out.printf("A Gasolina � R$ %.2f e o alcool � R$ %.2f\n\n",calc.getPrecoG(), calc.getPrecoA());
//		System.out.println("Gasolina (1) ou �lcool (2)?");
//		int tipo1 = teclado.nextInt();
//		System.out.println("Qual a quantidade:");
//		float quant1 = teclado.nextInt();
//		
//		float resultadoGas = calc.gasolina(tipo1, quant1)*quant1;
//		
//		System.out.printf("O valor fica R$ %.2f\n",calc.gasolina(tipo1, quant1));
//		System.out.printf("O pre�o final � fica R$ %.2f\n",resultadoGas);
	}

}
