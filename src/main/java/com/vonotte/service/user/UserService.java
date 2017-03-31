package com.vonotte.service.user;

import java.util.List;

import com.vonotte.dto.user.UserDTO;
import com.vonotte.dto.user.UserPostDTO;
import com.vonotte.exceptions.InvalidDataException;
import com.vonotte.exceptions.UserNotFoundException;
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
	 * @param Integer
	 * @return UserDTO
	 * @throws UserNotFoundException
	 */
	UserDTO findUserById(Integer id) throws UserNotFoundException;
	
	
	/**
	 * Da de alta un usuario en el sistema
	 * 
	 * @param UserPostDTO
	 * @return UserDTO
	 * @throws InvalidDataException
	 * 
	 */
	UserDTO create(UserPostDTO u) throws InvalidDataException;;
	
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
	
	
	/**
	 * Realiza el borrado de un usuario
	 * 
	 * @param Integer
	 * @throws UserNotFoundException
	 */
	void delete(Integer id) throws UserNotFoundException;

	
	
	
	
	
}
