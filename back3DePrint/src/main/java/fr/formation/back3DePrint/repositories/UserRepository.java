package fr.formation.back3DePrint.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.back3DePrint.entities.User;

public interface UserRepository extends JpaRepository<User, Long>  {
	
	UserRepository findByUserName(String userName);
	

}
