package fr.formation.back3DePrint.services;

import javax.validation.Valid;

import fr.formation.back3DePrint.dto.UserDto;
import fr.formation.back3DePrint.services.UserService;

public interface UserService  {

	void create(@Valid UserDto dto);


	//void create(UserDto dto);

}
