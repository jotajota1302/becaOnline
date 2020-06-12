package edu.es.eoi.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Television extends ProductoElectronico {

	private String definicion;
	private String marca;
	
	public Television(String nombre, String referencia, double precio, String descripcion, int stock, String modelo,
			double battery, String definicion, String marca) {
		super(nombre, referencia, precio, descripcion, stock, modelo, battery);
		this.definicion = definicion;
		this.marca = marca;
	}
	
	@Override
	public String toString() {
		return "Television [definicion=" + definicion + ", marca=" + marca + ", getDefinicion()=" + getDefinicion()
				+ ", getMarca()=" + getMarca() + ", getModelo()=" + getModelo() + ", getBattery()=" + getBattery()
				+ ", getDetalle()=" + getDetalle() + ", getNombre()=" + getNombre() + ", getReferencia()="
				+ getReferencia() + ", getPrecio()=" + getPrecio() + ", getDescripcion()=" + getDescripcion()
				+ ", getStock()=" + getStock() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
	
}
