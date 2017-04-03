package com.vonotte.dto.evaluation;


import com.vonotte.dto.DTO;


public class EvaluationPostDTO extends DTO{

	
	private static final long serialVersionUID = 8810127016307283618L;
	
	
	private Integer id_user;
	
	private Integer id_film;
	
	private Integer points;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer getId_user() {
		return id_user;
	}

	public void setId_user(Integer id_user) {
		this.id_user = id_user;
	}

	public Integer getId_film() {
		return id_film;
	}

	public void setId_film(Integer id_film) {
		this.id_film = id_film;
	}

	public Integer getPoints() {
		return points;
	}

	public void setPoints(Integer points) {
		this.points = points;
	}
	
	

}
