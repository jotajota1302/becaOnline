package edu.es.eoi.repository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import edu.es.eoi.entity.Producto;
import edu.es.eoi.entity.Zapatilla;

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
		repository.save(new Producto("ProductoTEST","123456",100,"descripcion",5));
		repository.save(new Producto("ProductoTEST2","654132",50,"descripcion",5));
		repository.save(new Zapatilla("Nike Air Jordan", "4858789865", 100.0, "Jordan shoes", 10,"nike","42.5"));
	
	}
	
	@Test
	public void testGetFichero() {
		ProductoRepositoryGSONImpl repository= new ProductoRepositoryGSONImpl();	
		assertNotNull(repository.getPathFichero());		
	}

}
