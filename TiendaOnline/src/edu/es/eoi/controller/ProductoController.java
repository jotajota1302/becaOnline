package edu.es.eoi.controller;

import edu.es.eoi.entity.Carrito;
import edu.es.eoi.entity.ListaDeseos;
import edu.es.eoi.entity.Producto;
import edu.es.eoi.service.ProductoService;

public class ProductoController {
	
	private Producto[] almacen;	
	private Carrito carrito;
	private ListaDeseos deseos;	
	private ProductoService service;

	public ProductoController(Producto[] almacen, Carrito carrito, ListaDeseos deseos) {
		super();
		this.almacen = almacen;
		this.carrito = carrito;
		this.deseos = deseos;
		this.service= new ProductoService(almacen, carrito, deseos);
	}
	
	public void comprar(Producto producto) {		
		service.comprar(producto);
	}
	
	public Producto buscar(String referencia) {
		return service.buscar(referencia);
	}
	
	public void comparar(String referencia1,String referencia2) {
		service.comparar(referencia1, referencia2);
	}	
	
	public void addToListaDeseos(Producto producto) {
		
		service.addToListaDeseos(producto);
	} 
	

}
