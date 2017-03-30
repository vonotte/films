package com.vonotte.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "film")
public class Film implements Serializable {

	
	private static final long serialVersionUID = -7579286569962835273L;	

	@Id
	@GeneratedValue
	private Integer id;
	
	private String title;
	
	private Integer year;
	
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
}
