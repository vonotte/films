package com.vonotte.dto.user;

import com.vonotte.dto.DTO;

public class UserDTO extends DTO{

	
	private static final long serialVersionUID = 8215997059592982662L;
	
	
	private Integer id;	
	
	private String name;
	
	
	public UserDTO(){
		super();
	}
	
	public UserDTO(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	@Override
	public String toString() {		
		return "UserDTO [id=" + id + ", name=" + name + "]";
	}

}
