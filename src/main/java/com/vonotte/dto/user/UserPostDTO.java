package com.vonotte.dto.user;

import com.vonotte.dto.DTO;

public class UserPostDTO extends DTO{

	
	private static final long serialVersionUID = 8215997059592982662L;
	
	
	private String name;
	
	
	
	public UserPostDTO(){
		super();
	}
	
	public UserPostDTO(String name) {
		super();		
		this.name = name;
	}	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {		
		return "UserPostDTO [name=" + name + "]";
	}

}
