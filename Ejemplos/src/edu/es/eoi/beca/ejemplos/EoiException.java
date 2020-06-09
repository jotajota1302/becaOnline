package edu.es.eoi.beca.ejemplos;

public class EoiException extends Exception{

	@Override
	public void printStackTrace() {
		
		System.out.println("Mi app ha fallado por que soy un gañan");
	}

}
