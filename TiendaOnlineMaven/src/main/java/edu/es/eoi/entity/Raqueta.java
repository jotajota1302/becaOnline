package edu.es.eoi.entity;

public class Raqueta extends ProductoDeportivo {

	private String marca;
	private double tensionCordaje;
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getTensionCordaje() {
		return tensionCordaje;
	}
	public void setTensionCordaje(double tensionCordaje) {
		this.tensionCordaje = tensionCordaje;
	}
	public Raqueta(String nombre, String referencia, double precio, String descripcion, int stock, String marca,
			String marca2, double tensionCordaje) {
		super(nombre, referencia, precio, descripcion, stock, marca);
		marca = marca2;
		this.tensionCordaje = tensionCordaje;
	}
	
	
}
