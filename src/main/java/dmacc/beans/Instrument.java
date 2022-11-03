/**
 * @author Kaitlyn Briggs - krbriggs
 * CIS175 - Fall 2022
 * Nov 1, 2022
 */
package dmacc.beans;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class Instrument {
	private String type;
	private String brand;
	private String model;
	private int yearMade;
	
	//Constructors
	
	public Instrument(String type, String brand, int yearMade) {
		super();
		this.type = type;
		this.brand = brand;
		this.yearMade = yearMade;
	}
	
}
