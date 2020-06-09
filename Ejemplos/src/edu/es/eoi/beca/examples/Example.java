package edu.es.eoi.beca.examples;

public class Example {

	private String text;
	
	public double number;
	
	 String concatenaTextoYNumero(){
		return text.concat(String.valueOf(number));
	}

	public String getTexto() {
		return text;
	}

	public void setTexto(String texto) {
		this.text = texto;
	}

	public double getNumero() {
		return number;
	}

	public void setNumero(double numero) {
		this.number = numero;
	}

	public Example() {
		super();
		this.number=5;
		this.text="text";
	}
	
	 
	 
}
