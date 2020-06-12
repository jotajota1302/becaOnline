package edu.es.eoi.entity;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ListaDeseos {
	
	private ArrayList<Producto> productos;	

	public ListaDeseos(ArrayList<Producto> productos) {
		super();
		this.productos = productos;
	}
	
	

}
