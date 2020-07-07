package edu.es.eoi.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import edu.es.eoi.entity.Carrito;
import edu.es.eoi.entity.Producto;
import edu.es.eoi.repository.MyRepository;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Service
public class ProductoService {

	@Autowired
	private Carrito carrito;	
	@Autowired
	@Qualifier("JDBC")
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
