package edu.es.eoi.entity;

public class ProductoElectronico extends Producto {

	private String modelo;
	private double battery;
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getBattery() {
		return battery;
	}
	public void setBattery(double battery) {
		this.battery = battery;
	}
	@Override
	public String getDetalle() {		
		return super.getDetalle().concat(",battery: "+battery);
	}
	public ProductoElectronico(String nombre, String referencia, double precio, String descripcion, int stock,
			String modelo, double battery) {
		super(nombre, referencia, precio, descripcion, stock);
		this.modelo = modelo;
		this.battery = battery;
	}
	
	
	
}
