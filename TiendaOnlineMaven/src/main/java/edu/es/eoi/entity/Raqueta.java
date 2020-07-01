package edu.es.eoi.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Raqueta extends ProductoDeportivo {
	
	private double tensionCordaje;

	public Raqueta(String nombre, String referencia, double precio, String descripcion, int stock, String marca,
			 double tensionCordaje) {
		super(nombre, referencia, precio, descripcion, stock, marca);		
		this.tensionCordaje = tensionCordaje;
	}
	
	
}
