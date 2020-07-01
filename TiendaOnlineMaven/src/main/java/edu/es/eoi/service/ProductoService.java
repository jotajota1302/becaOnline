package edu.es.eoi.service;

import java.util.Map;

import edu.es.eoi.entity.Carrito;
import edu.es.eoi.entity.ListaDeseos;
import edu.es.eoi.entity.Producto;
import edu.es.eoi.repository.MyRepository;
import edu.es.eoi.repository.ProductoRepositoryGSONImpl;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ProductoService {

	private Carrito carrito;
	private ListaDeseos deseos;
	private MyRepository<Producto> repository;	

	public void comprar(Producto producto) {
	 //TODO realizar compra
	}

	public void addToCesta(Producto producto) {
		carrito.getProductos().add(producto);
	}	

	public void addToListaDeseos(Producto producto) {
		deseos.getProductos().add(producto);
	}	

	public Producto buscar(String referencia) throws Exception {
		return repository.read(referencia);
	}
	
	public Map<String,Producto> readAll() throws Exception {
		return repository.readAll();
	}
	

}
