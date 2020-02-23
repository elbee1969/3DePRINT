package fr.formation.back3DePrint.dto;

import java.util.Date;

public interface UserViewDto {
	//Long getId();
	String getUserName();
	String getGender();
	String getFirstName();
	String getLastName();
	Date getDateOfBirth();
	String getPassword();
	String getEmail();
	int getStreetNumber();
	String getStreet();
	String getTown();
	int getZipCode();
	String getCountry();
}
