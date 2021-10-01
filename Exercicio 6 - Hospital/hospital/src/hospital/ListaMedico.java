package hospital;

import java.util.ArrayList;

public class ListaMedico {
	
private ArrayList<Medico> medicos = new ArrayList<Medico>();
	
	public void cadastrar(Medico medico) {
		if(medico != null) {
			medicos.add(medico);
		}
	}
	
	public void remover(Medico medico) {
		medicos.removeIf((elemento)->elemento.getCrm().equalsIgnoreCase(medico.getCrm()));
	}
	
	public void buscar(Medico medico) {
		for(Medico elemento : medicos) {
			if(elemento.getCrm().equalsIgnoreCase(medico.getCrm())) {
				System.out.printf("Nome: %s - Telefone:%s - CRM:%s\n", elemento.getNomeCompleto(),elemento.getTelefoneContato(), elemento.getCrm());
			}
		}
		
	}
	
	public void editar(Medico novoMedico) {
		for(Medico elemento : medicos) {
			if(elemento.getCrm().equalsIgnoreCase(novoMedico.getCrm())) {
				int indice = medicos.indexOf(elemento);
				if(indice != -1) {
					medicos.set(indice, novoMedico);
				}
			}
		}
	}
	
	public String listar(){
		StringBuilder builder = new StringBuilder();
		for(Medico medico : this.medicos) {
			builder.append("Nome: "+medico.getNomeCompleto()+" - Telefone: "+medico.getTelefoneContato()+ " - CRM: "+medico.getCrm()+"\n");
		}
		return builder.toString();
	}

}
