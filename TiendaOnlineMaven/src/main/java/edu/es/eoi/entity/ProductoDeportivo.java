package edu.es.eoi.entity;

public class ProductoDeportivo extends Producto {

	public ProductoDeportivo(String nombre, String referencia, double precio, String descripcion, int stock,
			String marca) {
		super(nombre, referencia, precio, descripcion, stock);
		this.marca = marca;
	}

	private String marca;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
}
