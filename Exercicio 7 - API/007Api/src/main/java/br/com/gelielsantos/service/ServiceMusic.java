package br.com.gelielsantos.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.com.gelielsantos.model.ModelMusic;

@Service
public class ServiceMusic {
	
	private List<ModelMusic> listOfMusic = new ArrayList<ModelMusic>();

	ServiceMusic() {
		listOfMusic.add(new ModelMusic("James Bond Theme", "John Barry", "1962"));
		listOfMusic.add(new ModelMusic("From Russia with Love", "John Barry", "1963"));
		listOfMusic.add(new ModelMusic("Goldfinger", "Shirley Bassey", "1964"));
		listOfMusic.add(new ModelMusic("Thunderball", "Tom Jones", "1965"));
		listOfMusic.add(new ModelMusic("You Only Live Twice", "Nancy Sinatra", "1967"));
		listOfMusic.add(new ModelMusic("On Her Majesty's Secret Service", "The John Barry Orchestra", "1969"));
		listOfMusic.add(new ModelMusic("Diamonds Are Forever", "Shirley Bassey", "1971"));
		listOfMusic.add(new ModelMusic("Live and Let Die", "Paul McCartney & Wings", "1973"));
		listOfMusic.add(new ModelMusic("The Man with the Golden Gun", "Lulu", "1974"));
		listOfMusic.add(new ModelMusic("Nobody Does It Better", "Carly Simon", "1977"));
		listOfMusic.add(new ModelMusic("Moonraker", "Shirley Bassey", "1979"));
		listOfMusic.add(new ModelMusic("For Your Eyes Only", "Sheena Easton", "1981"));
		listOfMusic.add(new ModelMusic("All Time High", "Rita Coolidge", "1983"));
		listOfMusic.add(new ModelMusic("A View to a Kill", "Duran Duran", "1985"));
		listOfMusic.add(new ModelMusic("The Living Daylights", "A-ha", "1987"));
		listOfMusic.add(new ModelMusic("Licence to Kill", "Gladys Knight", "1989"));
		listOfMusic.add(new ModelMusic("GoldenEye", "Tina Turner", "1995"));
		listOfMusic.add(new ModelMusic("Tomorrow Never Dies", "Sheryl Crow", "1997"));
		listOfMusic.add(new ModelMusic("The World Is Not Enough", "Garbage", "1999"));
		listOfMusic.add(new ModelMusic("Die Another Day", "Madonna", "2002"));
		listOfMusic.add(new ModelMusic("You Know My Name", "Chris Cornell", "2006"));
		listOfMusic.add(new ModelMusic("Another Way to Die", "Jack White e Alicia Keys", "2008"));
		listOfMusic.add(new ModelMusic("Skyfall", "Adele", "2012"));
		listOfMusic.add(new ModelMusic("Writing's on the Wall", "Sam Smith", "2015"));
		listOfMusic.add(new ModelMusic("No Time to Die", "Billie Eilish", "2020"));
	}
		

	public List<ModelMusic> findAll() {
		return this.listOfMusic;
	}

	public ModelMusic findOne(String name) {
		for (ModelMusic modelMusic : listOfMusic) {
			if (modelMusic.getTitle().equalsIgnoreCase(name)) {
				return modelMusic;
			}
		}
		return null;
	}

	public Map<String, String> insert(ModelMusic modelMusic) {
		Map<String, String> result = new HashMap<String, String>();
		boolean isSuccess = listOfMusic.add(modelMusic);
		if (isSuccess) {
			result.put("result", "Musica cadastrada com sucesso!!!");
		} else {
			result.put("result", "Não foi possível cadastrar a musica!!!");
		}
		return result;
	}

	public Map<String, String> edit(ModelMusic modelMusic) {
		Map<String, String> result = new HashMap<String, String>();

		for (ModelMusic element : listOfMusic) {
			if (element.getTitle().equalsIgnoreCase(modelMusic.getTitle())) {
				int index = listOfMusic.indexOf(element);
				listOfMusic.set(index, modelMusic);
				result.put("result", "Musica editada com sucesso!!!");
				return result;
			}
		}
		result.put("result", "Não foi possível editar a musica!!!");
		return result;
	}

	public Map<String, String> remove(String name) {
		Map<String, String> result = new HashMap<String, String>();
		boolean isSuccess = listOfMusic.removeIf((modelMusic) -> modelMusic.getTitle().equalsIgnoreCase(name));
		if (isSuccess) {
			result.put("result", "Musica removida com sucesso!!!");
		} else {
			result.put("result", "Não foi possível remover a musica!!!");
		}
		return result;
	}

}
