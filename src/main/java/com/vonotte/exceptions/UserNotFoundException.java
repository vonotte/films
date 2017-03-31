package com.vonotte.exceptions;

public class UserNotFoundException  extends NotFoundException{

	
	private static final long serialVersionUID = 1755982761677963468L;
	
	private static final String MSG = "El usuario no existe";

	public UserNotFoundException() {
		super(MSG);
	}

}
