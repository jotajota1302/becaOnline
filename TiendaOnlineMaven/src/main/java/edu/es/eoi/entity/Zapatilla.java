package edu.es.eoi.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Zapatilla extends ProductoDeportivo {

	private String talla;	

	public Zapatilla(String nombre, String referencia, double precio, String descripcion, int stock, String marca,
			String talla) {
		super(nombre, referencia, precio, descripcion, stock, marca);
		this.talla = talla;
	}

	@Override
	public String toString() {
		return "Zapatilla [talla=" + talla + ", getTalla()=" + getTalla() + ", getMarca()=" + getMarca()
				+ ", getNombre()=" + getNombre() + ", getReferencia()=" + getReferencia() + ", getPrecio()="
				+ getPrecio() + ", getDescripcion()=" + getDescripcion() + ", getStock()=" + getStock()
				+ ", getDetalle()=" + getDetalle() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	
}
