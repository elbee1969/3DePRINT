package fr.formation.back3DePrint.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.back3DePrint.dto.UserDto;
import fr.formation.back3DePrint.services.UserService;

@RestController
@RequestMapping("/3DePrint")
@CrossOrigin
public class UserController {

		@Autowired
	    private UserService service;

	    @PostMapping("/3DePrint/createUser")
	    protected void create(@Valid @RequestBody UserDto dto) {
		service.create(dto);
	    }



}
