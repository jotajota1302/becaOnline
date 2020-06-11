package edu.es.eoi.controller;

import edu.es.eoi.entity.Carrito;
import edu.es.eoi.entity.ListaDeseos;
import edu.es.eoi.entity.Producto;
import edu.es.eoi.service.ProductoService;

public class ProductoController {

	private ProductoService service;

	public ProductoController(Carrito carrito, ListaDeseos deseos) {
		super();
		this.service = new ProductoService(carrito, deseos);
	}

	public void comprar(Producto producto) {
		service.comprar(producto);
	}

	public Producto buscar(String referencia) throws Exception {
		return service.buscar(referencia);
	}

}
