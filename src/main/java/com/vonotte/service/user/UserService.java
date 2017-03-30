package com.vonotte.service.user;

import java.util.List;

import com.vonotte.dto.user.UserDTO;
import com.vonotte.dto.user.UserPostDTO;
import com.vonotte.model.User;

public interface UserService {

	
	/**
	 * Devuelve todas las peliculas
	 * 
	 * @return Listado de Usuarios
	 */
	List<UserDTO> findAll();	

	/**
	 * Busca un usuario por id
	 * 
	 * @param id
	 * @return
	 * @throws UserNotFoundException
	 */
	UserDTO findUserById(Integer id);
	
	
	/**
	 * Da de alta un usuario en el sistema
	 * 
	 * @param UserPostDTO
	 * @return UserDTO
	 * @throws InvalidDataException
	 * 
	 */
	UserDTO create(UserPostDTO u);
	
	/**
	 * Transforma un UserPostDTO en un User
	 * 
	 * @param UserPostDTO
	 * @return User
	 */
	User transform(UserPostDTO user);
	
	
	/**
	 * Transfrma un User en un UserDTO
	 * 
	 * @param User
	 * @return UserDTO
	 */
	UserDTO transform(User user);
	
	
	
	
	
}
