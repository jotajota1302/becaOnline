package edu.es.eoi.service;

import java.util.Map;

import edu.es.eoi.entity.Carrito;
import edu.es.eoi.entity.ListaDeseos;
import edu.es.eoi.entity.Producto;
import edu.es.eoi.repository.ProductoRepository;

public class ProductoService {

	private Carrito carrito;
	private ListaDeseos deseos;
	private ProductoRepository repository;

	public ProductoService(Map<String, Producto> almacen, Carrito carrito, ListaDeseos deseos) {
		super();
		this.carrito = carrito;
		this.deseos = deseos;
		this.repository = new ProductoRepository(almacen);
	}

	public void comprar(Producto producto) {
		if (producto.getStock() > 0) {
			addToCesta(producto);
			producto.setStock(producto.getStock()-1);
		} else {
			addToListaDeseos(producto);
		}
	}

	public void addToCesta(Producto producto) {
		carrito.getProductos().add(producto);
	}

	public Producto buscar(String referencia) {
		return repository.leer(referencia);
	}

	public void addToListaDeseos(Producto producto) {
		deseos.getProductos().add(producto);
	}

}
