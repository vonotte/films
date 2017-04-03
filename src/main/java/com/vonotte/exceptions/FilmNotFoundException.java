package com.vonotte.exceptions;

public class FilmNotFoundException extends NotFoundException{

	
	private static final long serialVersionUID = 7473176131501873583L;
	private static final String MSG = "Pelicula no existe";
	
	public FilmNotFoundException(){
		super(MSG);
	}

}
