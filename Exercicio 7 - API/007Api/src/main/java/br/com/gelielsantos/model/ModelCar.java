/**
 * 
 */
package br.com.gelielsantos.model;

public class ModelCar {

	private String name;
	private String brand;
	private String owner;
	
	public ModelCar(String name, String brand, String owner) {
		this.name = name;
		this.brand = brand;
		this.owner = owner;
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
