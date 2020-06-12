package edu.es.eoi.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductoElectronico extends Producto {

	private String modelo;
	private double battery;
	
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
