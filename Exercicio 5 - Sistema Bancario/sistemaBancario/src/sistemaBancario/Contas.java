package sistemaBancario;

import java.util.ArrayList;
import java.util.Scanner;

public class Contas {

	ArrayList <Float> contas = new ArrayList<Float>();
	Scanner teclado = new Scanner(System.in);
	
	public void cadastroContas() 
	{
		boolean res = true;
		
		System.out.println("Cadastro de Contas");
	    
	    do {
	    	System.out.println("Digite uma opção (1 - Continuar, 2 - Sair):");
	    	int resp = teclado.nextInt();
	    	if(resp == 1) 
	    	{
	    		System.out.println("Digite uma conta:");
		 		float numero = teclado.nextFloat();
		 		contas.add(numero);
		 		System.out.println(contas.toString());
	    	}
	    	else {
	    		res=false;
	    	}
	    	
	    }while (res==true);
	}
	public void buscaContas() 
	{
		boolean res = true;
		System.out.println("Busca de Contas");
		do {
    	System.out.println("Digite uma opção (1 - Continuar, 2 - Sair):");
    	int resp = teclado.nextInt();
    	
	    	if(resp == 1) 
	    	{
	    		System.out.println("Digite uma conta para buscar:");
	    		Float numero = teclado.nextFloat();
	    		boolean localizado = contas.contains(numero);
		 		System.out.printf("Foi localizado: %s\n", localizado);
	    	}
	    	else {
	    		res=false;
	    	}
		}while (res==true);
	}
	public void removeContas() 
	{
		boolean res = true;
		System.out.println("Remoção de Contas");
		do {
    	System.out.println("Digite uma opção (1 - Continuar, 2 - Sair):");
    	int resp = teclado.nextInt();
    	
	    	if(resp == 1) 
	    	{
	    		System.out.println("Digite uma conta para remover:");
	    		Float numero = teclado.nextFloat();
	    		int local = contas.indexOf(numero);
	    		contas.remove(local);
	    		System.out.println(contas.toString());
	    	}
	    	else {
	    		res=false;
	    	}
		}while (res==true);
	}
}
