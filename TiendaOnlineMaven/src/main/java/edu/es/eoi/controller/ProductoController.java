package edu.es.eoi.controller;

import java.util.List;

import edu.es.eoi.entity.Carrito;
import edu.es.eoi.entity.ListaDeseos;
import edu.es.eoi.entity.Producto;
import edu.es.eoi.service.ProductoService;

public class ProductoController {
	
	private ProductoService service;

	public ProductoController(List<Producto> almacen, Carrito carrito, ListaDeseos deseos) {
		super();
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
