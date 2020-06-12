package edu.es.eoi.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Producto {

	private String nombre;
	private String referencia;
	private double precio;
	private String descripcion;
	private int stock;
		
	public String getDetalle() {		
		return this.nombre.concat(", "+this.descripcion);
	}
	public Producto(String nombre, String referencia, double precio, String descripcion, int stock) {
		super();
		this.nombre = nombre;
		this.referencia = referencia;
		this.precio = precio;
		this.descripcion = descripcion;
		this.stock = stock;
	}
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", referencia=" + referencia + ", precio=" + precio + ", descripcion="
				+ descripcion + ", stock=" + stock + "]";
	}
	
	
	
}

