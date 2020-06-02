package edu.es.eoi.entity;

public class Carrito {
	
	private Producto[] productos=new Producto[10];

	public Producto[] getProductos() {
		return productos;
	}

	public void setProductos(Producto[] productos) {
		this.productos = productos;
	}

	public void realizarComprar() {
		//llamare para procesar la compra
	}
	
}
