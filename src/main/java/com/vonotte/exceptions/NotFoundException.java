package com.vonotte.exceptions;

public class NotFoundException extends Exception{

	
	private static final long serialVersionUID = 5848798792707113670L;
	
	private static final String MSG = "La entidad buscada no existe";

	public NotFoundException(String message) {
		super(message);
	}

	public NotFoundException() {
		super(MSG);
	}

}
