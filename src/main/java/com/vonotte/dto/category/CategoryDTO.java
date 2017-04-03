package com.vonotte.dto.category;

import com.vonotte.dto.DTO;

public class CategoryDTO extends DTO{

	
	private static final long serialVersionUID = -4369569385017702123L;
	
	private Integer id;	
	
	public CategoryDTO(){
		super();
	}	

	public CategoryDTO(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

}
