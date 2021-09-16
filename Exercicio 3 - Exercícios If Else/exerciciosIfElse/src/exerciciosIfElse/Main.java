package exerciciosIfElse;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		Calculos calc = new Calculos();
//		
		// Triângulo
		
		System.out.println("Digite o primeiro lado do triângulo:");
		float num1 = teclado.nextFloat();
		System.out.println("Digite o segundo lado do triângulo:");
		float num2 = teclado.nextFloat();
		System.out.println("Digite o terceiro lado do triângulo:");
		float num3 = teclado.nextFloat();
		
		String resultado = calc.tipoTriangulo(num1, num2, num3);
		
		System.out.printf("\nO triângulo é %s", resultado);
		
		//Ano Bissexto
		
//		System.out.println("Digite o ano para teste:");
//		int ano1 = teclado.nextInt();
//		
//		String resultadoAno = calc.anoBissexto(ano1);
//		
//		System.out.printf("\n%s", resultadoAno);
		
		//Crime
		
//		System.out.println("Digite 1 para não e 2 para sim\n");
//		System.out.println("Telefonou para a vítima?");
//		int res1 = teclado.nextInt();
//		System.out.println("Esteve no local do crime?");
//		int res2 = teclado.nextInt();
//		System.out.println("Mora perto da vítima?");
//		int res3 = teclado.nextInt();
//		System.out.println("Devia para a vítima?");
//		int res4 = teclado.nextInt();
//		System.out.println("Já trabalhou com a vítima?");
//		int res5 = teclado.nextInt();
//		
//		String resultadoCrime = calc.crime(res1, res2, res3, res4, res5);
//		
//		System.out.printf("\nVocê é %s", resultadoCrime);
//		
		//Gasolina
		
//		System.out.println("Bem vindo a Preços Quentes Postos");
//		System.out.printf("A Gasolina é R$ %.2f e o alcool é R$ %.2f\n\n",calc.getPrecoG(), calc.getPrecoA());
//		System.out.println("Gasolina (1) ou álcool (2)?");
//		int tipo1 = teclado.nextInt();
//		System.out.println("Qual a quantidade:");
//		float quant1 = teclado.nextInt();
//		
//		float resultadoGas = calc.gasolina(tipo1, quant1)*quant1;
//		
//		System.out.printf("O valor fica R$ %.2f\n",calc.gasolina(tipo1, quant1));
//		System.out.printf("O preço final é fica R$ %.2f\n",resultadoGas);
	}

}
