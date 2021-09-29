package sistemaBancario;

import java.util.ArrayList;
import java.util.Scanner;

public class Gerentes {

	ArrayList <String> gerentes = new ArrayList<String>();
	Scanner teclado = new Scanner(System.in);
	
	public void cadastroGerente() 
	{
		boolean res = true;
		
		System.out.println("Cadastro de Gerentes");
	    
	    do {
	    	System.out.println("Digite uma opção (1 - Continuar, 2 - Sair):");
	    	int resp = teclado.nextInt();
	    	if(resp == 1) 
	    	{
	    		System.out.println("Digite um nome:");
		 		String nome = teclado.next();
		 		gerentes.add(nome);
		 		System.out.println(gerentes.toString());
	    	}
	    	else {
	    		res=false;
	    	}
	    	
	    }while (res==true);
	}
	public void buscaGerente() 
	{
		boolean res = true;
		System.out.println("Busca de Gerentes");
		do {
    	System.out.println("Digite uma opção (1 - Continuar, 2 - Sair):");
    	int resp = teclado.nextInt();
    	
	    	if(resp == 1) 
	    	{
	    		System.out.println("Digite um nome para buscar:");
	    		String nome = teclado.next();
	    		boolean localizado = gerentes.contains(nome);
		 		System.out.printf("Foi localizado: %s\n", localizado);
	    	}
	    	else {
	    		res=false;
	    	}
		}while (res==true);
	}
	public void removeGerente() 
	{
		boolean res = true;
		System.out.println("Remoção de Gerentes");
		do {
    	System.out.println("Digite uma opção (1 - Continuar, 2 - Sair):");
    	int resp = teclado.nextInt();
    	
	    	if(resp == 1) 
	    	{
	    		System.out.println("Digite um nome para remover:");
	    		String nome = teclado.next();
	    		int local = gerentes.indexOf(nome);
	    		gerentes.remove(local);
	    		System.out.println(gerentes.toString());
	    	}
	    	else {
	    		res=false;
	    	}
		}while (res==true);
	}
}
