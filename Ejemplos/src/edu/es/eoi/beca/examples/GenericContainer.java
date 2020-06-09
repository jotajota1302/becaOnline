package edu.es.eoi.beca.examples;

	
public class GenericContainer<T> {
		
	private T contenido;		
	
	
	public GenericContainer() {
		
	}

	public void setContenido(T contenido) {
		
		this.contenido = contenido;
		
	}
		
	public T getContenido() {
		
		return contenido;
		
	}
}
	
	

