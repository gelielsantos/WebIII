package hospital;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		// Criando os objetos
		Endereco end1 = new Endereco("Travessa não te interessa","12-A","Centro","Porto Alegre","RS","00000");
		
		ListaPaciente lispac = new ListaPaciente();
		Paciente pac1 = new Paciente("Julia","9999","988880");
		Paciente pac2 = new Paciente("Junior","7777","988780");
		Paciente pacNew = new Paciente("Bruno","9999","789480");
		Paciente pacBus = new Paciente("7777");
		
		ListaMedico lismed = new ListaMedico();
		Medico med1 = new Medico("000-RS","Geovane Mota","0000");
		Medico med2 = new Medico("111-RS","Maria Eduarda","1111");
		Medico medNew = new Medico("111-RS","Geliel Santos","3333");
		Medico medBus = new Medico("000-RS");
		
		ListaInternacao lisint = new ListaInternacao();
		Internacao inter1 = new Internacao(LocalDate.of(2021, 10, 10),LocalDate.of(2021, 10, 30),"Parece bem o paciente");
		Internacao inter2 = new Internacao(LocalDate.of(2021, 8, 13),LocalDate.of(2021, 8, 27),"Parece tranquilo");
		Internacao interNew = new Internacao(LocalDate.of(2021, 10, 10),LocalDate.of(2021, 7, 1),"Teve Alta");
		Internacao interBus = new Internacao(LocalDate.of(2021, 8, 13));
		
		med1.setEndereco(end1);
		
		//Médico
		lismed.cadastrar(med1);
		lismed.cadastrar(med2);
		System.out.println("Cadastrado");
		System.out.println(lismed.listar());
		lismed.editar(medNew);
		System.out.println("Editado");
		System.out.println(lismed.listar());
		System.out.println("Busca");
		lismed.buscar(medBus);
		lismed.remover(medBus);
		System.out.println("\nRemovido");
		System.out.println(lismed.listar());
		
		//Paciente
//		lispac.cadastrar(pac1);
//		lispac.cadastrar(pac2);
//		System.out.println("Cadastrado");
//		System.out.println(lispac.listar());
//		lispac.editar(pacNew);
//		System.out.println("Editado");
//		System.out.println(lispac.listar());
//		System.out.println("Busca");
//		lispac.buscar(pacBus);
//		lispac.remover(pacBus);
//		System.out.println("\nRemovido");
//		System.out.println(lispac.listar());
		
		//Internação
//		lisint.cadastrar(inter1);
//		lisint.cadastrar(inter2);
//		System.out.println("Cadastrado");
//		System.out.println(lisint.listar());
//		lisint.editar(interNew);
//		System.out.println("Editado");
//		System.out.println(lisint.listar());
//		System.out.println("Busca");
//		lisint.buscar(interBus);
//		lisint.remover(interBus);
//		System.out.println("\nRemovido");
//		System.out.println(lisint.listar());
	}

}
