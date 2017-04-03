package com.vonotte.dto.evaluation;

import com.vonotte.dto.DTO;

public class EvaluationDTO extends DTO{
	
	
	private static final long serialVersionUID = 3454542971856203811L;
	
	
	private Integer points;
	

	private String name;
	
	
	private String title;
	
	
	public EvaluationDTO(Integer points, String name, String title) {
		super();
		this.points = points;
		this.name = name;
		this.title = title;
	}




	public EvaluationDTO(){
		super();
	}
	
	
	

	public Integer getPoints() {
		return points;
	}

	public void setPoints(Integer points) {
		this.points = points;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}
	
	@Override
	public String toString() {		
		return null;
	}

}
