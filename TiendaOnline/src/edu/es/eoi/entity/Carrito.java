package edu.es.eoi.entity;

public class Carrito {
	
	private Producto[] productos;

	public Producto[] getProductos() {
		return productos;
	}
	

	public Carrito(Producto[] productos) {
		super();
		this.productos = productos;
	}

	public void setProductos(Producto[] productos) {
		this.productos = productos;
	}

	public void realizarComprar() {
		//llamare para procesar la compra
	}
	
}
