package com.vonotte.service.film;

import java.util.List;

import com.vonotte.dto.film.FilmDTO;
import com.vonotte.dto.film.FilmPostDTO;
import com.vonotte.model.Film;



public interface FilmService {
	/**
	 * Devuelve todas las peliculas
	 * 
	 * @return Listado de Usuarios
	 */
	List<FilmDTO> findAll();
	

	/**
	 * Devuelve una pelicula por id
	 * 
	 * @param Integer
	 * @return FilmDTO 
	 */
	FilmDTO findfilmById(Integer id);
	
	
	
	/**
	 * Da de una pelicula en el sistema
	 * 
	 * @param FilmPostDTO
	 * @return FilmDTOs
	 * @throws InvalidDataException
	 * 
	 */
	FilmDTO create(FilmPostDTO f);
	
	
	/**
	 * Transfrma un film en un FilmDTO
	 * 
	 * @param User
	 * @return UserDTO
	 */
	FilmDTO transform(Film film);
	
	
	/**
	 * Transfrma un FilmPostDTO en un Film
	 * 
	 * @param FilmPostDTO
	 * @return Film
	 */
	Film transform(FilmPostDTO film);

}
