package fr.formation.back3DePrint.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class UserDto {
	   
	@NotEmpty
	@Size(max = 255)
	private String userName ;
	
	@NotEmpty
	@Size(max = 5)
   private String gender ;
   
	@NotEmpty
	@Size(max = 255)
   private String firstName ;
	
	@NotEmpty
	@Size(max = 255)
   private String lastName ;
	
   @NotEmpty
   private Date dateOfBirth ;
   
	@NotEmpty
	@Size(max = 12)
   private String password;
   
	@NotEmpty
	@Size(max = 255)	
   private String email;
   
	@NotEmpty
	@Size(max = 5)		
   private int streetNumber;
   
	@NotEmpty
	@Size(max = 255)	
   private String street;
	
	@NotEmpty
	@Size(max = 100)		
   private String town;
   
	@NotEmpty
	@Size(max = 5)		
   private int zipCode;
	
	@NotEmpty
	@Size(max = 100)
   private String country;
   

	public UserDto() {
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
