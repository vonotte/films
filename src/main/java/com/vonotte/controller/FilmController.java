package com.vonotte.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vonotte.dto.film.FilmDTO;
import com.vonotte.dto.film.FilmPostDTO;
import com.vonotte.exceptions.FilmNotFoundException;
import com.vonotte.exceptions.InvalidDataException;
import com.vonotte.service.film.FilmService;

@RestController
@RequestMapping(value = "/film")
public class FilmController {
	
	@Autowired
	private FilmService filmService;
	
	@RequestMapping(method = { RequestMethod.GET })
	public List<FilmDTO> getAll() {		
		return filmService.findAll();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public FilmDTO findById(@PathVariable("id") Integer id) throws FilmNotFoundException  {
		return filmService.findfilmById(id);
	}	
	
	@RequestMapping(method = RequestMethod.POST)
	public FilmDTO create(@RequestBody FilmPostDTO f) throws InvalidDataException{
		return filmService.create(f);
	}
	
	

}
