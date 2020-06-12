package edu.es.eoi.entity;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Carrito {
	
	private List<Producto> productos;
	
	public Carrito(List<Producto> productos) {
		super();
		this.productos = productos;
	}


	public void realizarComprar() {
		//llamare para procesar la compra
	}
	
}
