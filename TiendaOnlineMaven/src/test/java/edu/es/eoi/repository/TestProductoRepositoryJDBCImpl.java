package edu.es.eoi.repository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.es.eoi.entity.Producto;

public class TestProductoRepositoryJDBCImpl {

	MyRepository<Producto> repository= new ProductoRepositoryJDBCImpl();
	
	@Test
	public void testLeer() throws Exception {		
		Producto producto=repository.read("111111111");		
		assertEquals(producto.getReferencia(), "111111111");				
	}

	@Test
	public void testGuardar() throws Exception {		
		Producto p= new Producto("HP Pavilion", "222222222", 300,"PC regulero" , 2);
		repository.save(p);
		assertEquals(300,repository.read("222222222").getPrecio(),0);	
	}
	
	@Test
	public void testBorrar() throws Exception {	
		repository.delete("222222222");
		assertEquals(1,repository.readAll().size());	
	}
	
	@Test
	public void testLeerTodos() throws Exception {	
		assertNotNull(repository.readAll());	
	}
	
	@Before
	public void initBBDD() throws Exception {	
		Producto p= new Producto("Samsung TV", "111111111", 500,"Maravillosa TV de 45'" , 45);
		repository.save(p);
	}	
	
	@After
	public void deleteBBDD() throws Exception {		
		repository.delete("111111111");;
	}	
	
}
