package edu.es.eoi.entity;

public class Batidora extends ProductoElectronico {

	private int revoluciones;

	public int getRevoluciones() {
		return revoluciones;
	}

	public void setRevoluciones(int revoluciones) {
		this.revoluciones = revoluciones;
	}

	public Batidora(String nombre, String referencia, double precio, String descripcion, int stock, String modelo,
			double battery, int revoluciones) {
		super(nombre, referencia, precio, descripcion, stock, modelo, battery);
		this.revoluciones = revoluciones;
	}

	@Override
	public String toString() {
		return "Batidora [revoluciones=" + revoluciones + ", getRevoluciones()=" + getRevoluciones() + ", getModelo()="
				+ getModelo() + ", getBattery()=" + getBattery() + ", getDetalle()=" + getDetalle() + ", getNombre()="
				+ getNombre() + ", getReferencia()=" + getReferencia() + ", getPrecio()=" + getPrecio()
				+ ", getDescripcion()=" + getDescripcion() + ", getStock()=" + getStock() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	
	
	
	
}
