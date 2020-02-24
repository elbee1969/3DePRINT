package fr.formation.back3DePrint.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotBlank;

@Embeddable
public class UserAddress {
	@NotBlank
	@Column(length=5, nullable = false)		
    private int streetNumber;
    
	@Column(length=255, nullable = false)	
    private String street;
	
	@Column(length=100, nullable = false)		
    private String town;
    
	@Column(length=5, nullable = false)		
    private int zipCode;
	
	@Column(length=100, nullable = false)	
    private String country;
	
	public UserAddress() {
		
	}

	public int getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(int streetNumber) {
		this.streetNumber = streetNumber;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	

}
