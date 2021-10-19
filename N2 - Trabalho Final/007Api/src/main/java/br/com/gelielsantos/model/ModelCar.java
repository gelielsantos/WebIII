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
@Table(name = "car")
public class ModelCar {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(length = 30,nullable = false)
	private String name;
	@Column(length = 30,nullable = false)
	private String brand;
	@Column(length = 100,nullable = false)
	private String owner;
	
	public ModelCar(int id, String name, String brand, String owner) {
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.owner = owner;
	}
	
	public ModelCar()
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

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

}
