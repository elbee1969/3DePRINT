package fr.formation.back3DePrint.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class UserAddressDTO {
	   
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

		public UserAddressDTO() {
			super();
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
