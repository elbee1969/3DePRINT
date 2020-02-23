package fr.formation.back3DePrint.entities;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;


@Entity()
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(length=255, nullable = false, unique = true)
    private String username ;	
    
    @Column(length=5, nullable = false)
    private String gender ;
    
	@Column(length=255, nullable = false)
    private String firstName ;
	
	@Column(length=255, nullable = false)
    private String lastName ;
	
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth ;
    
	@Column(length = 255, nullable = false)
    private String password;
    
	@Column(length=255, nullable = false, unique = true)	
    private String email;
    
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
    
	@ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "custom_user_role",
	    joinColumns = @JoinColumn(name = "user_id"),
	    inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles; // Authorities
	
    @Convert(converter = BooleanConverter.class)
    @Column(length = 1, nullable = false)
    private boolean accountNonExpired = true;

    @Convert(converter = BooleanConverter.class)
    @Column(length = 1, nullable = false)
    private boolean accountNonLocked = true;

    @Convert(converter = BooleanConverter.class)
    @Column(length = 1, nullable = false)
    private boolean credentialsNonExpired = true;

    @Convert(converter = BooleanConverter.class)
    @Column(length = 1, nullable = false)
    private boolean enabled;


	


	public User() {
		// TODO Auto-generated constructor stub
	}
	

    /**
     * Creates a new custom user.
     *
     * @param password an encrypted password
     * @param username a unique username
     * @param roles    some roles
     * @param enabled  {@code true} if enabled; {@code false} otherwise
     */
	public User(Long id, String username, String gender, String firstName, String lastName, Date dateOfBirth,
			String password, String email, @NotBlank int streetNumber, String street, String town, int zipCode,
			String country, Set<Role> roles, boolean enabled) {
		this.id = id;
		this.username = username;
		this.gender = gender;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.password = password;
		this.email = email;
		this.streetNumber = streetNumber;
		this.street = street;
		this.town = town;
		this.zipCode = zipCode;
		this.country = country;
		this.roles = roles;
		this.enabled = enabled;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
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


	public Set<Role> getRoles() {
		return roles;
	}


	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}


	public boolean isAccountNonExpired() {
		return accountNonExpired;
	}


	public void setAccountNonExpired(boolean accountNonExpired) {
		this.accountNonExpired = accountNonExpired;
	}


	public boolean isAccountNonLocked() {
		return accountNonLocked;
	}


	public void setAccountNonLocked(boolean accountNonLocked) {
		this.accountNonLocked = accountNonLocked;
	}


	public boolean isCredentialsNonExpired() {
		return credentialsNonExpired;
	}


	public void setCredentialsNonExpired(boolean credentialsNonExpired) {
		this.credentialsNonExpired = credentialsNonExpired;
	}


	public boolean isEnabled() {
		return enabled;
	}


	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	


}
