package edu.es.eoi.entity;

import java.util.ArrayList;

public class ListaDeseos {
	
	private ArrayList<Producto> productos;

	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}

	public ListaDeseos(ArrayList<Producto> productos) {
		super();
		this.productos = productos;
	}
	
	

}
