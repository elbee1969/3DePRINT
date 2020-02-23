package fr.formation.back3DePrint.services;

import org.springframework.stereotype.Service;

import fr.formation.back3DePrint.dto.UserDto;
import fr.formation.back3DePrint.entities.User;
import fr.formation.back3DePrint.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	private final UserRepository userRepo;
	protected UserServiceImpl(UserRepository userRepo) {
		this.userRepo = userRepo;
	    }

    @Override
    public void create(UserDto dto) {
	// TODO Auto-generated method stub
	User user = new User();
	user.setUserName(dto.getUserName());
	user.setGender(dto.getGender());
	user.setFirstName(dto.getFirstName());
	user.setLastName(dto.getLastName());
	user.setDateOfBirth(dto.getDateOfBirth());
	user.setPassword(dto.getPassword());
	user.setEmail(dto.getEmail());
	user.setStreetNumber(dto.getStreetNumber());
	user.setStreet(dto.getStreet());
	user.setTown(dto.getTown());
	user.setZipCode(dto.getZipCode());
	user.setCountry(dto.getCountry());
	userRepo.save(user);
    }

}
