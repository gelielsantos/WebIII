package exerciciosIfElse;

public class Calculos {
	
	private float precoG = 5;
	private float precoA = 4;

	public float getPrecoG() {
		return precoG;
	}

	public float getPrecoA() {
		return precoA;
	}

	public String tipoTriangulo(float lado1, float lado2, float lado3) 
	{
		
		if(lado1 == lado2 && lado1 == lado3) {
			return "Equilátero";
		}
		else if(lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
			return "Isósceles";
		}
		return "Escaleno";
	}
	
	public String anoBissexto(int ano) 
	{
		if(ano%4 == 0 && ano%100 != 0) {
			return "Ano Bissexto";
		}
		else if(ano%4 == 0 && ano%100 == 0 && ano%400 == 0) {
			return "Ano Bissexto";
		}
		return "Não é ano Bissexto";
	}
	
	public String crime(int res1, int res2, int res3, int res4, int res5) 
	{
		if(res1==1 && res2==1 && res3==1 && res4==1 && res5==1||res1==1 && res2==1 && res3==1 && res4==1||res1==1 && res2==1 && res3==1 && res5==1||res1==1 && res2==1 && res4==1 && res5==1||res1==1 && res3==1 && res4==1 && res5==1||res2==1 && res3==1 && res4==1 && res5==1) {
			return "Inocente";
		}
		else if(res1==1 && res2==1 && res3==1|| res1==1 && res2==1 && res4==1||res1==1 && res2==1 && res5==1||res1==1 && res3==1 && res4==1||res1==1 && res3==1 && res5==1||res1==1 && res4==1 && res5==1||res2==1 && res3==1 && res4==1||res2==1 && res3==1 && res5==1||res2==1 && res4==1 && res5==1||res3==1 && res4==1 && res5==1) {
			return "Suspeito";
		}
		else if(res1==2 && res2==2 && res3==2 && res4==2 && res5==2) 
		{
			return "Assassino";
		}
		return "Cúmplice";
	}
	
	public float gasolina(int tipo, float quantidade) 
	{
		
		if(tipo == 1) {
			if(quantidade<20) {
				return (precoG/100)*97;
			}
			else {
				return (precoG/100)*95;
			}
		}
		else if(tipo==2) {
			if(quantidade<20) {
				return (precoA/100)*97;
			}
			else {
				return (precoA/100)*95;
			}
		}
		return 100000000;
	}
	
}
