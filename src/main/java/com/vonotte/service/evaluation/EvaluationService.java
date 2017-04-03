package com.vonotte.service.evaluation;

import java.util.List;

import com.vonotte.dto.evaluation.EvaluationDTO;
import com.vonotte.dto.evaluation.EvaluationPostDTO;
import com.vonotte.exceptions.EvaluationNotFoundException;
import com.vonotte.exceptions.InvalidDataException;

public interface EvaluationService {
	
	
	/**
	 * Crea una nueva Evaluación 
	 * @param EvaluationPostDTO
	 * @return EvaluationDTO
	 * @throws InvalidDataException
	 */
	EvaluationDTO create(EvaluationPostDTO e) throws InvalidDataException;	
	
	/**
	 * Borra una Evaluacion
	 * @param Integer
	 * @throws EvaluationNotFoundException
	 */
	void delete(Integer id) throws EvaluationNotFoundException;	
	
	/**
	 * Actualiza una Evaluación
	 * @param EvaluationPostDTO
	 * @param Integer
	 * @return EvaluationDTO
	 * @throws InvalidDataException
	 */
	EvaluationDTO update(EvaluationPostDTO e, Integer id) throws InvalidDataException;	
	
	/**
	 * Devuelve la evaluación con el id dado
	 * @param Integer
	 * @return EvaluationDTO
	 * @throws EvaluationNotFoundException
	 */
	EvaluationDTO findById(Integer id) throws EvaluationNotFoundException;
	
	
	/**
	 * Busca las evaluaciones por usuario, usuario y pelicula, por pelicula, por categoria o devuelve todas las evaluciones
	 * segun el path.
	 * 
	 * @param Integer
	 * @param Integer
	 * @param Integer
	 * @return List<EvaluationDTO>
	 * @throws InvalidDataException
	 */
	List<EvaluationDTO> find(Integer idCategory,Integer idUser,Integer idFilm) throws InvalidDataException;

}
