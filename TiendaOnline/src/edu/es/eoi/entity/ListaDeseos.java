package edu.es.eoi.entity;

public class ListaDeseos {
	
	private Producto[] productos;

	public Producto[] getProductos() {
		return productos;
	}

	public void setProductos(Producto[] productos) {
		this.productos = productos;
	}

	public ListaDeseos(Producto[] productos) {
		super();
		this.productos = productos;
	}
	
	

}
