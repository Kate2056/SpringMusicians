/**
 * @author Kaitlyn Briggs - krbriggs
 * CIS175 - Fall 2022
 * Nov 1, 2022
 */
package dmacc.beans;

import javax.persistence.Embeddable;

@Embeddable
public class Instrument {
	private String type;
	private String brand;
	private String model;
	private int yearMade;
	
	//Constructors
	public Instrument() {
		super();
	}
	
	public Instrument(String type, String brand, int yearMade) {
		super();
		this.type = type;
		this.brand = brand;
		this.yearMade = yearMade;
	}
	
	public Instrument(String type, String brand, String model, int yearMade) {
		super();
		this.type = type;
		this.brand = brand;
		this.model = model;
		this.yearMade = yearMade;
	}
	
	//Getters and Setters
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public int getYearMade() {
		return yearMade;
	}
	
	public void setYearMade(int yearMade) {
		this.yearMade = yearMade;
	}

	@Override
	public String toString() {
		return "Instrument [type=" + type + ", brand=" + brand + ", model=" + model + ", yearMade=" + yearMade + "]";
	}
	
	
}
