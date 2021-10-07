/**
 * 
 */
package br.com.gelielsantos.model;

public class Model007 {

	private String name;
	private String lastName;
	private String birthDay;
	private String movies;
	
	public Model007(String name, String lastName, String birthDay, String movies) {
		this.name = name;
		this.lastName = lastName;
		this.birthDay = birthDay;
		this.movies = movies;
	}

	public String getName() {
		return name;
	}

	public String getLastName() {
		return lastName;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public String getMovies() {
		return movies;
	}

	public void setMovies(String movies) {
		this.movies = movies;
	}
	
}
