package edu.es.eoi.service;

import java.util.Map;

import edu.es.eoi.entity.Carrito;
import edu.es.eoi.entity.Producto;
import edu.es.eoi.repository.MyRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ProductoService {

	private Carrito carrito;	
	private MyRepository<Producto> repository;	
	
	public void addToCesta(Producto producto) {
		carrito.getProductos().add(producto);
	}	

	public Producto buscar(String referencia) throws Exception {
		return repository.read(referencia);
	}
	
	public Map<String,Producto> readAll() throws Exception {
		return repository.readAll();
	}
	

}
