package com.vonotte.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vonotte.dto.evaluation.EvaluationDTO;
import com.vonotte.dto.evaluation.EvaluationPostDTO;
import com.vonotte.exceptions.EvaluationNotFoundException;
import com.vonotte.exceptions.InvalidDataException;
import com.vonotte.service.evaluation.EvaluationService;

@RestController
@RequestMapping(value = "/evaluation")
public class EvaluationController {
	
	@Autowired
	private EvaluationService evaluationService;	
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public EvaluationDTO findById(@PathVariable("id") Integer id) throws EvaluationNotFoundException{
		return evaluationService.findById(id);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public List<EvaluationDTO> find(
									@RequestParam(required=false) Integer idCategory,
									@RequestParam(required=false) Integer idUser,
									@RequestParam(required=false) Integer idFilm) throws InvalidDataException{
		return evaluationService.find(idCategory, idUser, idFilm);		
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public EvaluationDTO create(@RequestBody EvaluationPostDTO e) throws InvalidDataException{
		return evaluationService.create(e);
	}
	
	@RequestMapping(value = "/{id}", method = { RequestMethod.PUT })
	public EvaluationDTO update(@PathVariable("id") Integer id, @RequestBody EvaluationPostDTO e) throws InvalidDataException{		
		return evaluationService.update(e,id);	}
	
	
	@RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
	public void delete(@PathVariable("id") Integer id) throws EvaluationNotFoundException {
		evaluationService.delete(id);
	}
	
	

}
