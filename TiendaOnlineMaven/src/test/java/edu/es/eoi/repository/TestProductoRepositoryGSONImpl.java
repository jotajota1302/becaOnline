package edu.es.eoi.repository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import edu.es.eoi.entity.Producto;

public class TestProductoRepositoryGSONImpl {

	@Test
	public void testLeer() throws Exception {
		
		MyRepository<Producto> repository= new ProductoRepositoryGSONImpl();
		Producto producto=repository.read("4858789865");		
		assertEquals(producto.getReferencia(), "4858789865");
				
	}

	@Test
	public void testGuardar() throws Exception {	
		MyRepository<Producto> repository= new ProductoRepositoryGSONImpl();	
		repository.save(new Producto("ProductoTEST","123456",100,"descripcion",5,null));
		repository.save(new Producto("ProductoTEST2","654132",50,"descripcion",5,null));	
	}
	
	@Test
	public void testGetFichero() {
		ProductoRepositoryGSONImpl repository= new ProductoRepositoryGSONImpl();	
		assertNotNull(repository.getPathFichero());		
	}

}
