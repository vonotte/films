package com.vonotte.dto.category;

import com.vonotte.dto.DTO;

public class CategoryPostDTO extends DTO{

	
	private static final long serialVersionUID = 5494267169883305478L;
	
	private String name;
	
	public CategoryPostDTO(){
		super();
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
