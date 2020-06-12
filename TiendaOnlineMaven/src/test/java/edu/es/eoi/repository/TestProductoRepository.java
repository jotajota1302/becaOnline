package edu.es.eoi.repository;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

import edu.es.eoi.App;
import edu.es.eoi.entity.Producto;

public class TestProductoRepository {

	@Test
	public void testLeer() throws Exception {
		
		ProductoRepository repository= new ProductoRepository();
		Producto producto=repository.leer("123456");		
		assertEquals(producto.getReferencia(), "123456");
				
	}

	@Test
	public void testGuardar() throws Exception {	
		ProductoRepository repository= new ProductoRepository();	
		repository.guardar(new Producto("ProductoTEST","123456",100,"descripcion",5));
		repository.guardar(new Producto("ProductoTEST2","654132",100,"descripcion",5));
	}
	
	@Test
	public void testGetFichero() {
		ProductoRepository repository= new ProductoRepository();	
		assertNotNull(repository.getPathFichero());		
	}

}
