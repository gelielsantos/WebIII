package br.com.gelielsantos.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gelielsantos.model.ModelMusic;
import br.com.gelielsantos.repository.RepositoryMusic;

@Service
public class ServiceMusic {
	
	@Autowired
	private RepositoryMusic repositoryMusic;

	public void InitServiceMusic() {
		ModelMusic mus1 = new ModelMusic(1,"James Bond Theme", "John Barry", "1962");
		ModelMusic mus2 = new ModelMusic(2,"From Russia with Love", "John Barry", "1963");
		ModelMusic mus3 = new ModelMusic(3,"Goldfinger", "Shirley Bassey", "1964");
		ModelMusic mus4 = new ModelMusic(4,"Thunderball", "Tom Jones", "1965");
		ModelMusic mus5 = new ModelMusic(5,"You Only Live Twice", "Nancy Sinatra", "1967");
		ModelMusic mus6 = new ModelMusic(6,"On Her Majesty's Secret Service", "The John Barry Orchestra", "1969");
		ModelMusic mus7 = new ModelMusic(7,"Diamonds Are Forever", "Shirley Bassey", "1971");
		ModelMusic mus8 = new ModelMusic(8,"Live and Let Die", "Paul McCartney & Wings", "1973");
		ModelMusic mus9 = new ModelMusic(9,"The Man with the Golden Gun", "Lulu", "1974");
		ModelMusic mus10 = new ModelMusic(10,"Nobody Does It Better", "Carly Simon", "1977");
		ModelMusic mus11 = new ModelMusic(11,"Moonraker", "Shirley Bassey", "1979");
		ModelMusic mus12 = new ModelMusic(12,"For Your Eyes Only", "Sheena Easton", "1981");
		ModelMusic mus13 = new ModelMusic(13,"All Time High", "Rita Coolidge", "1983");
		ModelMusic mus14 = new ModelMusic(14,"A View to a Kill", "Duran Duran", "1985");
		ModelMusic mus15 = new ModelMusic(15,"The Living Daylights", "A-ha", "1987");
		ModelMusic mus16 = new ModelMusic(16,"Licence to Kill", "Gladys Knight", "1989");
		ModelMusic mus17 = new ModelMusic(17,"GoldenEye", "Tina Turner", "1995");
		ModelMusic mus18 = new ModelMusic(18,"Tomorrow Never Dies", "Sheryl Crow", "1997");
		ModelMusic mus19 = new ModelMusic(19,"The World Is Not Enough", "Garbage", "1999");
		ModelMusic mus20 = new ModelMusic(20,"Die Another Day", "Madonna", "2002");
		ModelMusic mus21 = new ModelMusic(21,"You Know My Name", "Chris Cornell", "2006");
		ModelMusic mus22 = new ModelMusic(22,"Another Way to Die", "Jack White e Alicia Keys", "2008");
		ModelMusic mus23 = new ModelMusic(23,"Skyfall", "Adele", "2012");
		ModelMusic mus24 = new ModelMusic(24,"Writing's on the Wall", "Sam Smith", "2015");
		ModelMusic mus25 = new ModelMusic(25,"No Time to Die", "Billie Eilish", "2020");
		repositoryMusic.save(mus1);
		repositoryMusic.save(mus2);
		repositoryMusic.save(mus3);
		repositoryMusic.save(mus4);
		repositoryMusic.save(mus5);
		repositoryMusic.save(mus6);
		repositoryMusic.save(mus7);
		repositoryMusic.save(mus8);
		repositoryMusic.save(mus9);
		repositoryMusic.save(mus10);
		repositoryMusic.save(mus11);
		repositoryMusic.save(mus12);
		repositoryMusic.save(mus13);
		repositoryMusic.save(mus14);
		repositoryMusic.save(mus15);
		repositoryMusic.save(mus16);
		repositoryMusic.save(mus17);
		repositoryMusic.save(mus18);
		repositoryMusic.save(mus19);
		repositoryMusic.save(mus20);
		repositoryMusic.save(mus21);
		repositoryMusic.save(mus22);
		repositoryMusic.save(mus23);
		repositoryMusic.save(mus24);
		repositoryMusic.save(mus25);
	}
		

	public List<ModelMusic> findAll() {
		List<ModelMusic> music = new ArrayList<>();
		repositoryMusic.findAll().forEach(music::add);
		return music;
	}

	public Optional<ModelMusic> findOne(int id) {
		return repositoryMusic.findById(id);
	}

	public String insertOrUpdate(ModelMusic modelMusic) {
		ModelMusic res = repositoryMusic.save(modelMusic);
		if(res != null) {
			return "Inserido/Upado com sucesso";
		}
		
		return "Não funcionou";
	}

	public String remove(int id) {
		repositoryMusic.deleteById(id);
		Optional<ModelMusic> res = repositoryMusic.findById(id);
		if(res != null) {
			return "Deletado com sucesso";
		}
		
		return "Não removeu";
	}

}
