package sistemaBancario;

import java.util.ArrayList;
import java.util.Scanner;

public class Clientes {
	
	ArrayList <String> clientes = new ArrayList<String>();
	Scanner teclado = new Scanner(System.in);
	
	public void cadastroCliente() 
	{
		boolean res = true;
		
		System.out.println("Cadastro de Clientes");
	    
	    do {
	    	System.out.println("Digite uma opção (1 - Continuar, 2 - Sair):");
	    	int resp = teclado.nextInt();
	    	if(resp == 1) 
	    	{
	    		System.out.println("Digite um nome:");
		 		String nome = teclado.next();
		 		clientes.add(nome);
		 		System.out.println(clientes.toString());
	    	}
	    	else {
	    		res=false;
	    	}
	    	
	    }while (res==true);
	}
	public void buscaCliente() 
	{
		boolean res = true;
		System.out.println("Busca de Clientes");
		do {
    	System.out.println("Digite uma opção (1 - Continuar, 2 - Sair):");
    	int resp = teclado.nextInt();
    	
	    	if(resp == 1) 
	    	{
	    		System.out.println("Digite um nome para buscar:");
	    		String nome = teclado.next();
	    		boolean localizado = clientes.contains(nome);
		 		System.out.printf("Foi localizado: %s\n", localizado);
	    	}
	    	else {
	    		res=false;
	    	}
		}while (res==true);
	}
	public void removeCliente() 
	{
		boolean res = true;
		System.out.println("Remoção de Clientes");
		do {
    	System.out.println("Digite uma opção (1 - Continuar, 2 - Sair):");
    	int resp = teclado.nextInt();
    	
	    	if(resp == 1) 
	    	{
	    		System.out.println("Digite um nome para remover:");
	    		String nome = teclado.next();
	    		int local = clientes.indexOf(nome);
	    		clientes.remove(local);
	    		System.out.println(clientes.toString());
	    	}
	    	else {
	    		res=false;
	    	}
		}while (res==true);
	}
    	
    	
    

}
