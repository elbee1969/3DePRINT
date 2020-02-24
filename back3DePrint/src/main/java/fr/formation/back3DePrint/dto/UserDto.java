package fr.formation.back3DePrint.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import fr.formation.back3DePrint.entities.UserAddress;

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
	
   @Valid
	private UserAddress userAddress;

	public UserDto() {
	}

	public String getUserName() {
		return userName;
	}
	


	public void setUserName(String userName) {
		this.userName = userName;
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

	public UserAddress getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(UserAddress userAddress) {
		this.userAddress = userAddress;
	}



	
	

}
