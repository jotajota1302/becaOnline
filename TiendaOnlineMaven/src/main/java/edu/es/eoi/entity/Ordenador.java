package edu.es.eoi.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Ordenador extends ProductoElectronico {

	private String sistemaOperativo;
	
	public Ordenador(String nombre, String referencia, double precio, String descripcion, int stock, String modelo,
			double battery, String sistemaOperativo) {
		super(nombre, referencia, precio, descripcion, stock, modelo, battery);
		this.sistemaOperativo = sistemaOperativo;
	}

	@Override
	public String toString() {
		return "Ordenador [sistemaOperativo=" + sistemaOperativo + ", getSistemaOperativo()=" + getSistemaOperativo()
				+ ", getModelo()=" + getModelo() + ", getBattery()=" + getBattery() + ", getDetalle()=" + getDetalle()
				+ ", getNombre()=" + getNombre() + ", getReferencia()=" + getReferencia() + ", getPrecio()="
				+ getPrecio() + ", getDescripcion()=" + getDescripcion() + ", getStock()=" + getStock()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	
	
	
}
