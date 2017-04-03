package com.vonotte.service.evaluation;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vonotte.dao.CategoryDao;
import com.vonotte.dao.EvaluationDao;
import com.vonotte.dao.FilmDao;
import com.vonotte.dao.UserDao;
import com.vonotte.dto.evaluation.EvaluationDTO;
import com.vonotte.dto.evaluation.EvaluationPostDTO;
import com.vonotte.exceptions.EvaluationNotFoundException;
import com.vonotte.exceptions.InvalidDataException;
import com.vonotte.model.Category;
import com.vonotte.model.Evaluation;
import com.vonotte.model.Film;
import com.vonotte.model.User;

@Service
public class EvaluationServiceImp implements EvaluationService{

	@Autowired
	private EvaluationDao evaluationDao;
	
	@Autowired
	private FilmDao filmDao;
	
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private CategoryDao categoryDao;
	

	
	@Override
	public EvaluationDTO create(EvaluationPostDTO e) throws InvalidDataException{
		Film film = filmDao.findOne(e.getId_film());
		User user = userDao.findOne(e.getId_user());
		if(validate(e)&& film!= null && user!=null){
			Evaluation evaluation = new Evaluation();
			evaluation.setCreatedAt(new Date());
			evaluation.setUpdatedAt(new Date());
			evaluation.setFilm(film);
			evaluation.setUser(user);
			evaluation.setPoints(e.getPoints());
			evaluationDao.save(evaluation);		
			return new EvaluationDTO(evaluation.getPoints(), evaluation.getUser().getName(), evaluation.getFilm().getTitle());
		}
		else
			throw new InvalidDataException("Los datos no son correctos");		
		
	}

	
	private List<EvaluationDTO> findAll() {
		final Iterable<Evaluation> findAll = evaluationDao.findAll();
		final List<EvaluationDTO> res = new ArrayList<>();
		findAll.forEach(b -> {
			final EvaluationDTO bDTO = new EvaluationDTO(b.getPoints(),b.getUser().getName(),b.getFilm().getTitle());
			res.add(bDTO);
		});
		return res;		
	}

	@Override
	public EvaluationDTO findById(Integer id) throws EvaluationNotFoundException{	
		Evaluation b = evaluationDao.findOne(id);
		if(b!=null)			
			return new EvaluationDTO(b.getPoints(),b.getUser().getName(),b.getFilm().getTitle());
		else
			throw new EvaluationNotFoundException();
	}
	
	private boolean validate(EvaluationPostDTO e){
		return (e.getPoints()>=0 && e.getPoints()<=10);
	}

	@Override
	public EvaluationDTO update(EvaluationPostDTO e, Integer id) throws InvalidDataException {		
		Film film = filmDao.findOne(e.getId_film());
		User user = userDao.findOne(e.getId_user());
		Evaluation evaluation = evaluationDao.findOne(id);
		if(validate(e)&& film!= null && user!=null && evaluation!= null){			
			evaluation.setUpdatedAt(new Date());
			evaluation.setFilm(film);
			evaluation.setUser(user);
			evaluation.setPoints(e.getPoints());
			evaluationDao.save(evaluation);
			return new EvaluationDTO(evaluation.getPoints(), evaluation.getUser().getName(), evaluation.getFilm().getTitle());
		}
		else
			throw new InvalidDataException("Los datos no son correctos");	
		
	}

	@Override
	public void delete(Integer id) throws EvaluationNotFoundException {
		Evaluation evaluation = evaluationDao.findOne(id);
		if(evaluation != null)
			evaluationDao.delete(evaluation);
		else 
			throw new EvaluationNotFoundException();
	}

	@Override
	public List<EvaluationDTO> find(Integer idCategory, Integer idUser, Integer idFilm) throws InvalidDataException {		
		if(idFilm!= null && idUser!= null) return getUserEvaluationFilm(idUser, idFilm);
		if(idUser!=null) return getUserEvaluations(idUser);
		if(idFilm!= null) return getFilmEvaluations(idFilm);
		if(idCategory!=null)return getCategoryEvaluations(idCategory);		
		return findAll();
	}
	
	private List<EvaluationDTO> getUserEvaluationFilm(Integer idUser, Integer idFilm) throws InvalidDataException{		
		List<EvaluationDTO> l= new ArrayList<>(); 
		User user = userDao.findOne(idUser);
	    Film film = filmDao.findOne(idFilm);
	    if(user != null && film != null){
	    	Evaluation e=evaluationDao.findEvaluationUser(film, user);
	    	if(e != null){
	    		l.add(new EvaluationDTO(e.getPoints(), user.getName(), film.getTitle()));
		    	return l;
	    	}
	    	throw new InvalidDataException("El usuario aun no ha valorado la pelicula");	    	
	    }
	    throw new InvalidDataException("Los datos no son correctos");	    
		
	}
	
	private List<EvaluationDTO> getUserEvaluations(Integer idUser) throws InvalidDataException{
		Iterable<Evaluation> l = new ArrayList<>();
		final List<EvaluationDTO> res = new ArrayList<>();		
			User u = userDao.findOne(idUser);
			if(u != null){
				l= u.getEvaluations();
				l.forEach(b -> {
					final EvaluationDTO bDTO = new EvaluationDTO(b.getPoints(),b.getUser().getName(),b.getFilm().getTitle());
					res.add(bDTO);
				});
				return res;
			}
			else throw new InvalidDataException("Datos incorrectos");
						
	}
	
	private List<EvaluationDTO> getFilmEvaluations(Integer idFilm) throws InvalidDataException{
		Iterable<Evaluation> l = new ArrayList<>();
		final List<EvaluationDTO> res = new ArrayList<>();
		Film f= filmDao.findOne(idFilm);
		if(f != null){
			l=f.getEvaluation();
			l.forEach(b -> {
				final EvaluationDTO bDTO = new EvaluationDTO(b.getPoints(),b.getUser().getName(),b.getFilm().getTitle());
				res.add(bDTO);
			});
			return res;
		}
		else throw new InvalidDataException("Datos incorrectos");
	}
	
	
	private List<EvaluationDTO> getCategoryEvaluations(Integer idCategory) throws InvalidDataException{
		
		Category c= categoryDao.findOne(idCategory);
		Iterable<Film> films = new ArrayList<>();
		final List<EvaluationDTO> res = new ArrayList<>();
		if(c != null){
			films=c.getFilms();
			films.forEach(film -> {				
				Iterable<Evaluation> listEvaluation=film.getEvaluation();
				listEvaluation.forEach(evaluation -> {
					final EvaluationDTO bDTO = new EvaluationDTO(evaluation.getPoints(),evaluation.getUser().getName(),evaluation.getFilm().getTitle());
					res.add(bDTO);
				});
				
			});
			return res;
		}
		else throw new InvalidDataException("Datos incorrectos");
	}
	

}
