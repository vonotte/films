package com.vonotte.dto.film;

import com.vonotte.dto.DTO;

public class FilmDTO extends DTO{	
	

	private static final long serialVersionUID = -833511092135468362L;

	private Integer id;
	
	private String title;
	
	private Integer year;	
	
	public FilmDTO(){
		super();
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
		return "FilmDTO [id=" + id + ", title=" + title + ", year="+year+"]";
	}

}
