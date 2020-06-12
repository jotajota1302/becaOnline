package edu.es.eoi.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Raqueta extends ProductoDeportivo {

	private String marca;
	private double tensionCordaje;

	public Raqueta(String nombre, String referencia, double precio, String descripcion, int stock, String marca,
			String marca2, double tensionCordaje) {
		super(nombre, referencia, precio, descripcion, stock, marca);
		marca = marca2;
		this.tensionCordaje = tensionCordaje;
	}
	
	
}
