package edu.es.eoi.entity;

import java.util.Date;

public class Pedido {
	
	private String numeroPedido;
	private Persona comprador;
	private Producto[] productos;
	private Date fechaCompra;
	
	public String getNumeroPedido() {
		return numeroPedido;
	}
	public void setNumeroPedido(String numeroPedido) {
		this.numeroPedido = numeroPedido;
	}
	public Producto[] getProductos() {
		return productos;
	}
	public void setProductos(Producto[] productos) {
		this.productos = productos;
	}
	public Date getFechaCompra() {
		return fechaCompra;
	}
	public void setFechaCompra(Date fechaCompra) {
		this.fechaCompra = fechaCompra;
	}
	public Persona getComprador() {
		return comprador;
	}
	public void setComprador(Persona comprador) {
		this.comprador = comprador;
	}
	
	
}
