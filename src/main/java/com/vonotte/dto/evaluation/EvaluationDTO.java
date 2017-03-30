package com.vonotte.dto.evaluation;

import com.vonotte.dto.DTO;
import com.vonotte.model.Film;
import com.vonotte.model.User;

public class EvaluationDTO extends DTO{
	
	
	private static final long serialVersionUID = 3454542971856203811L;
	
	private Integer id;
	

	private Integer rate;
	
	
	private User user;
	
	
	private Film film;
	

	
	public Film getFilm() {
		return film;
	}

	public void setFilm(Film film) {
		this.film = film;
	}		
	

	public Integer getRate() {
		return rate;
	}

	public void setRate(Integer rate) {
		this.rate = rate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

}
