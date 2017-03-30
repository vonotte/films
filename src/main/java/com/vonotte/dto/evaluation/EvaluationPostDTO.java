package com.vonotte.dto.evaluation;


import com.vonotte.dto.DTO;
import com.vonotte.model.Film;
import com.vonotte.model.User;

public class EvaluationPostDTO extends DTO{

	
	private static final long serialVersionUID = 8810127016307283618L;
	
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

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

}
