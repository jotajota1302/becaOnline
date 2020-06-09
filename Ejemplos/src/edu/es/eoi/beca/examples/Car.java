package edu.es.eoi.beca.examples;

public class Car extends Vehicle implements Parkeable {

	private double precio;
	
	@Override
	public void aparcar() {
		
		System.out.println("si que se aparcar");
		
	}

	@Override
	public void desaparcar() {
		
		System.out.println("si que se desaparcar");
	}

	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	
	
}
