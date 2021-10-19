/**
 * 
 */
package br.com.gelielsantos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "music")
public class ModelMusic {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(length = 100,nullable = false)
	private String title;
	@Column(length = 80,nullable = false)
	private String nameSinger;
	@Column(length = 5,nullable = false)
	private String year;
	
	public ModelMusic(int id, String title, String nameSinger, String year) {
		this.id = id;
		this.title = title;
		this.nameSinger = nameSinger;
		this.year = year;
	}
	
	public ModelMusic() 
	{
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getNameSinger() {
		return nameSinger;
	}

	public void setNameSinger(String nameSinger) {
		this.nameSinger = nameSinger;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}
	
}
