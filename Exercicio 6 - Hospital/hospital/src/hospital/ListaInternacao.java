package hospital;

import java.util.ArrayList;

public class ListaInternacao {

private ArrayList<Internacao> internacoes = new ArrayList<Internacao>();
	
	public void cadastrar(Internacao internacao) {
		if(internacao != null) {
			internacoes.add(internacao);
		}
	}
	
	public void remover(Internacao internacao) {
		internacoes.removeIf((elemento)->elemento.getDataInternacao().equals(internacao.getDataInternacao()));
	}
	
	public void buscar(Internacao internacao) {
		for(Internacao elemento : internacoes) {
			if(elemento.getDataInternacao().equals(internacao.getDataInternacao())) {
				System.out.printf("Internação: %s - Alta:%s - Observações:%s\n", elemento.getDataInternacao(),elemento.getDataAlta(), elemento.getObservacoes());
			}
		}
		
	}
	
	public void editar(Internacao novaInternacao) {
		for(Internacao elemento : internacoes) {
			if(elemento.getDataInternacao().equals(novaInternacao.getDataInternacao())) {
				int indice = internacoes.indexOf(elemento);
				if(indice != -1) {
					internacoes.set(indice, novaInternacao);
				}
			}
		}
	}
	
	public String listar(){
		StringBuilder builder = new StringBuilder();
		for(Internacao internacao : this.internacoes) {
			builder.append("Internação: "+internacao.getDataInternacao()+" - Alta: "+internacao.getDataAlta()+" - Observações: "+internacao.getObservacoes()+ "\n");
		}
		return builder.toString();
	}
	
}
