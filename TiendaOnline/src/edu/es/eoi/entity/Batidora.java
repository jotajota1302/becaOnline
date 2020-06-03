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
		return "Batidora [Revoluciones=" + getRevoluciones() + ", Modelo"
				+ getModelo() + ", Battery" + getBattery() + ", Detalle" + getDetalle() + ", getNombre"
				+ getNombre() + ", Referencia" + getReferencia() + ", Precio" + getPrecio()
				+ ", Descripcion" + getDescripcion() + ", Stock" + getStock();
	}
	
	
	
}
