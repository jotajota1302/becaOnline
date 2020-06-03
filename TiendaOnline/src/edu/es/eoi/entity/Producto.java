package edu.es.eoi.entity;

public class Producto {

	private String nombre;
	private String referencia;
	private double precio;
	private String descripcion;
	private int stock;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
		
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
	
}

