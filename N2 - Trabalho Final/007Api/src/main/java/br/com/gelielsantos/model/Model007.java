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
@Table(name = "actor")
public class Model007 {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(length = 10,nullable = false)
	private String name;
	@Column(length = 40,nullable = false)
	private String lastName;
	@Column(length = 11,nullable = false)
	private String birthDay;
	@Column(columnDefinition = "text not null")
	private String movies;
	
	public Model007(int id,String name, String lastName, String birthDay, String movies) {
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.birthDay = birthDay;
		this.movies = movies;
	}
	
	public Model007()
	{
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	public String getMovies() {
		return movies;
	}

	public void setMovies(String movies) {
		this.movies = movies;
	}
	
}
