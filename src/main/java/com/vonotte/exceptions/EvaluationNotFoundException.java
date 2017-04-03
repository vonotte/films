package com.vonotte.exceptions;

public class EvaluationNotFoundException  extends NotFoundException{

	
	private static final long serialVersionUID = -5984742456046183781L;
	
	private static final String MSG = "La evaluacion no existe";

	public EvaluationNotFoundException() {
		super(MSG);
	}

}
