package edu.es.eoi.entity;

public class Zapatilla extends ProductoDeportivo {

	private String talla;

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	public Zapatilla(String nombre, String referencia, double precio, String descripcion, int stock, String marca,
			String talla) {
		super(nombre, referencia, precio, descripcion, stock, marca);
		this.talla = talla;
	}
	
	
}
