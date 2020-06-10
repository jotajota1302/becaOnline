package edu.es.eoi.exception;

public class TiendaOnlineException extends Exception{

	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {	
		return "Ha ocurrido un error en la entrada de datos";
	}
	

}
