package com.vonotte.service.film;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vonotte.dao.FilmDao;
import com.vonotte.dto.film.FilmDTO;
import com.vonotte.dto.film.FilmPostDTO;
import com.vonotte.model.Film;

@Service
public class FilmServiceImpl implements FilmService{

	@Autowired
	private FilmDao filmDao;
	
	@Autowired
	private DozerBeanMapper dozer;
	
	@Override
	public List<FilmDTO> findAll() {
		final Iterable<Film> findAll = filmDao.findAll();
		final List<FilmDTO> res = new ArrayList<>();
		findAll.forEach(b -> {
			final FilmDTO bDTO = transform(b);
			res.add(bDTO);
		});
		return res;
	}
	
	@Override
	public FilmDTO findfilmById(Integer id) {		
		return transform(filmDao.findOne(id));
	}
	
	@Override
	public FilmDTO create(FilmPostDTO f) {
		final Film film= transform(f);
		film.setCreatedAt(new Date());
		return transform(filmDao.save(film));
	}

	public FilmDTO transform(Film film) {		
		return dozer.map(film, FilmDTO.class);
	}

	@Override
	public Film transform(FilmPostDTO film) {		
		return dozer.map(film, Film.class);
	}

	

	

}
