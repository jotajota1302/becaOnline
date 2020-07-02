package edu.es.eoi.repository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.es.eoi.entity.Producto;

public class TestProductoRepositoryJPAImpl {

	MyRepository<Producto> repository= new ProductoRepositoryJPAImpl();
	
	@Test
	public void testLeer() throws Exception {		
		Producto producto=repository.read("3333333");		
		assertEquals(producto.getReferencia(), "3333333");				
	}

	@Test
	public void testGuardar() throws Exception {		
		Producto p= new Producto("222222222", "HP Pavilion", 300,"PC regulero" , 2,null);
		repository.save(p);
		assertEquals(300,repository.read("222222222").getPrecio(),0);	
	}
	
	@Test
	public void testBorrar() throws Exception {			
		repository.delete("222222222");	
		assertNull(repository.read("222222222"));
	}
	
	@Test
	public void testLeerTodos() throws Exception {	
		assertNotNull(repository.readAll());	
	}
	
	@Before
	public void initBBDD() throws Exception {	
		Producto p= new Producto("111111111", "Samsung TV", 500,"Maravillosa TV de 45'" , 45,null);
		repository.save(p);
	}	
	
	@After
	public void deleteBBDD() throws Exception {		
		repository.delete("111111111");;
	}	
	
}
