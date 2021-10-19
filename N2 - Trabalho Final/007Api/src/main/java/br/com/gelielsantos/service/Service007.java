package br.com.gelielsantos.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gelielsantos.model.Model007;
import br.com.gelielsantos.repository.Repository007;

@Service
public class Service007 {
	
	@Autowired
	private Repository007 repository007;

	public void InitService007() {
		Model007 actor1 = new Model007(1,"Sean", "Connery", "25/08/1930", "007 - Contra o Satânico Dr. No (1962), Moscou contra 007(1963), 007 - Contra Goldfinger (1964), 007 - Contra a chantagem atômica (1965), Com 007 só se vive duas vezes (1967) e 007 - Os diamantes são eternos (1971)");
		Model007 actor2 = new Model007(2,"George", "Lazenby", "05/09/1939", "007 - A serviço secreto de Sua Majestade(1969)");
		Model007 actor3 = new Model007(3,"Roger", "Moore", "14/10/1927", "007 - Viva e deixe morrer (1973), 007 - Contra o homem com a pistola de ouro (1974), 007 - O espião que me amava (1977), 007 - Contra o foguete da morte (1979), 007 - Somente para os seus olhos (1981), 007 - Contra Octopussy (1983) e 007 - Na mira dos assassinos (1985)");
		Model007 actor4 = new Model007(4,"Timothy", "Dalton", "21/03/1946", " 007 - Marcado para a morte (1987) e 007 - Licença para matar (1989)");
		Model007 actor5 = new Model007(5,"Pierce", "Brosnan", "16/04/1953", "007 - Contra GoldenEye (1995), 007 - O amanhã nunca morre (1997), 007 - O mundo não é o bastante e 007 (1999) - Um novo dia para morrer (2002).");
		Model007 actor6 = new Model007(6,"Daniel", "Craig", "02/03/1968", "007 - Cassino Royale (2006), 007 - Quantum of Solace (2008), 007 - Operação Skyfall (2012), 007 - Spectre (2015) e 007 Sem Tempo para Morrer (2021)");
		repository007.save(actor1);
		repository007.save(actor2);
		repository007.save(actor3);
		repository007.save(actor4);
		repository007.save(actor5);
		repository007.save(actor6);
	}
		
	
	public String insertOrUpdate(Model007 model007) {
		Model007 res = repository007.save(model007);
		if(res != null) {
			return "Inserido/Upado com sucesso";
		}
		
		return "Não funcionou";
	}
	
	public List<Model007> findAll() {
		List<Model007> actor = new ArrayList<>();
		repository007.findAll().forEach(actor::add);
		return actor;
	}

	public Optional<Model007> findOne(int id) {
		return repository007.findById(id);
	}


	public String remove(int id) {
		repository007.deleteById(id);
		Optional<Model007> res = repository007.findById(id);
		if(res != null) {
			return "Deletado com sucesso";
		}
		
		return "Não removeu";
	}

}
