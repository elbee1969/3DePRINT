package fr.formation.back3DePrint.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.back3DePrint.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
	
    Role findByDefaultRoleTrue();

}
