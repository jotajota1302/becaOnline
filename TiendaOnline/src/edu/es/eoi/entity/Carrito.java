package edu.es.eoi.entity;

import java.util.ArrayList;

public class Carrito {
	
	private ArrayList<Producto> productos;

	public ArrayList<Producto> getProductos() {
		return productos;
	}
	

	public Carrito(ArrayList<Producto> productos) {
		super();
		this.productos = productos;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}

	public void realizarComprar() {
		//llamare para procesar la compra
	}
	
}
