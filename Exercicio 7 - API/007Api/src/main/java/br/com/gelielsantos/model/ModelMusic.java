/**
 * 
 */
package br.com.gelielsantos.model;

public class ModelMusic {

	private String title;
	private String nameSinger;
	private String year;
	
	public ModelMusic(String title, String nameSinger, String year) {
		this.title = title;
		this.nameSinger = nameSinger;
		this.year = year;
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
