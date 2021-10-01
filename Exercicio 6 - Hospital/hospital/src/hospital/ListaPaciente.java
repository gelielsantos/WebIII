package hospital;

import java.util.ArrayList;

public class ListaPaciente {

private ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
	
	public void cadastrar(Paciente paciente) {
		if(paciente != null) {
			pacientes.add(paciente);
		}
	}
	
	public void remover(Paciente paciente) {
		pacientes.removeIf((elemento)->elemento.getCpf().equalsIgnoreCase(paciente.getCpf()));
	}
	
	public void buscar(Paciente paciente) {
		for(Paciente elemento : pacientes) {
			if(elemento.getCpf().equalsIgnoreCase(paciente.getCpf())) {
				System.out.printf("Nome: %s - CPF:%s - Telefone:%s\n", elemento.getNomeCompleto(),elemento.getCpf(), elemento.getTelefone());
			}
		}
		
	}
	
	public void editar(Paciente novoPaciente) {
		for(Paciente elemento : pacientes) {
			if(elemento.getCpf().equalsIgnoreCase(novoPaciente.getCpf())) {
				int indice = pacientes.indexOf(elemento);
				if(indice != -1) {
					pacientes.set(indice, novoPaciente);
				}
			}
		}
	}
	
	public String listar(){
		StringBuilder builder = new StringBuilder();
		for(Paciente paciente : this.pacientes) {
			builder.append("Nome: "+paciente.getNomeCompleto()+" - CPF: "+paciente.getCpf()+" - Telefone: "+paciente.getTelefone()+ "\n");
		}
		return builder.toString();
	}
	
}
