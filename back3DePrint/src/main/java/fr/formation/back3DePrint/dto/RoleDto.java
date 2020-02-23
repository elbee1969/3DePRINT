package fr.formation.back3DePrint.dto;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;

public class RoleDto {
	
	@NotEmpty
    private Long id;
	 
	@NotEmpty
	private String name ;
 
	@NotEmpty
	private int code ;
}
