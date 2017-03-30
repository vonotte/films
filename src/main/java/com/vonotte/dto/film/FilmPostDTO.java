package com.vonotte.dto.film;

import com.vonotte.dto.DTO;

public class FilmPostDTO extends DTO{	

	
	private static final long serialVersionUID = 6436465067178221003L;

	
	
	private String title;
	
	private Integer year;	
	
	public FilmPostDTO(){
		super();
	}
	
	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}	
	@Override
	public String toString() {		
		return "FilmDTO [title=" + title + ", year="+year+"]";
	}

}

