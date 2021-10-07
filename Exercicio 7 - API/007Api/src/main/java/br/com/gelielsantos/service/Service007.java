package br.com.gelielsantos.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.com.gelielsantos.model.Model007;

@Service
public class Service007 {
	
	private List<Model007> listOfPersons = new ArrayList<Model007>();

	Service007() {
		listOfPersons.add(new Model007("Sean", "Connery", "25/08/1930", "007 - Contra o Satânico Dr. No (1962), Moscou contra 007(1963), 007 - Contra Goldfinger (1964), 007 - Contra a chantagem atômica (1965), Com 007 só se vive duas vezes (1967) e 007 - Os diamantes são eternos (1971)"));
		listOfPersons.add(new Model007("George", "Lazenby", "05/09/1939", "007 - A serviço secreto de Sua Majestade(1969)"));
		listOfPersons.add(new Model007("Roger", "Moore", "14/10/1927", "007 - Viva e deixe morrer (1973), 007 - Contra o homem com a pistola de ouro (1974), 007 - O espião que me amava (1977), 007 - Contra o foguete da morte (1979), 007 - Somente para os seus olhos (1981), 007 - Contra Octopussy (1983) e 007 - Na mira dos assassinos (1985)"));
		listOfPersons.add(new Model007("Timothy", "Dalton", "21/03/1946", " 007 - Marcado para a morte (1987) e 007 - Licença para matar (1989)"));
		listOfPersons.add(new Model007("Pierce", "Brosnan", "16/04/1953", "007 - Contra GoldenEye (1995), 007 - O amanhã nunca morre (1997), 007 - O mundo não é o bastante e 007 (1999) - Um novo dia para morrer (2002)."));
		listOfPersons.add(new Model007("Daniel", "Craig", "02/03/1968", "007 - Cassino Royale (2006), 007 - Quantum of Solace (2008), 007 - Operação Skyfall (2012), 007 - Spectre (2015) e 007 Sem Tempo para Morrer (2021)"));
	}
		

	public List<Model007> findAll() {
		return this.listOfPersons;
	}

	public Model007 findOne(String name) {
		for (Model007 model007 : listOfPersons) {
			if (model007.getName().equalsIgnoreCase(name)) {
				return model007;
			}
		}
		return null;
	}

	public Map<String, String> insert(Model007 model007) {
		Map<String, String> result = new HashMap<String, String>();
		boolean isSuccess = listOfPersons.add(model007);
		if (isSuccess) {
			result.put("result", "Ator cadastrado com sucesso!!!");
		} else {
			result.put("result", "Não foi possível cadastrar o ator!!!");
		}
		return result;
	}

	public Map<String, String> edit(Model007 model007) {
		Map<String, String> result = new HashMap<String, String>();

		for (Model007 element : listOfPersons) {
			if (element.getName().equalsIgnoreCase(model007.getName())) {
				int index = listOfPersons.indexOf(element);
				listOfPersons.set(index, model007);
				result.put("result", "Ator editado com sucesso!!!");
				return result;
			}
		}
		result.put("result", "Não foi possível editar o ator!!!");
		return result;
	}

	public Map<String, String> remove(String name) {
		Map<String, String> result = new HashMap<String, String>();
		boolean isSuccess = listOfPersons.removeIf((model007) -> model007.getName().equalsIgnoreCase(name));
		if (isSuccess) {
			result.put("result", "Ator removido com sucesso!!!");
		} else {
			result.put("result", "Não foi possível remover o ator!!!");
		}
		return result;
	}

}
