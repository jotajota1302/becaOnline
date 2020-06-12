package edu.es.eoi.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductoDeportivo extends Producto {

	public ProductoDeportivo(String nombre, String referencia, double precio, String descripcion, int stock,
			String marca) {
		super(nombre, referencia, precio, descripcion, stock);
		this.marca = marca;
	}

	private String marca;
	
}
