package edu.es.eoi.repository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;
import java.util.Calendar;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.es.eoi.entity.Pedido;
import edu.es.eoi.entity.Persona;
import edu.es.eoi.entity.Producto;

public class TestPedidoRepositoryJPAImpl {

	MyRepository<Pedido> repository= new PedidoRepositoryJPAImpl();
	
	@Test
	public void testLeer() throws Exception {		
		Pedido Pedido=repository.read("11111111");		
		assertEquals(Pedido.getReferencia(), "11111111");
		assertEquals(Pedido.getPersona().getNif(), "112345678T");			
	}

	@Test
	public void testGuardar() throws Exception {		
		Pedido p= new Pedido();
		p.setReferencia("222222222");
		p.setFecha(Calendar.getInstance().getTime());
		repository.save(p);
		assertEquals("222222222",repository.read("222222222").getReferencia());	
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
		Pedido p= new Pedido();
		p.setReferencia("11111111");
		p.setFecha(Calendar.getInstance().getTime());
		Persona persona= new Persona();
		persona.setNif("112345678T");
		persona.setUsername("test@gmail");
		persona.setPassword("password");
		persona.setPedidos(new ArrayList<Pedido>());		
		p.setPersona(persona);
		persona.getPedidos().add(p);
		p.setProductos(new ArrayList<Producto>());
		
		Producto producto= new Producto();
		producto.setReferencia("3333333");		
		p.getProductos().add(producto);
		
		producto= new Producto();
		producto.setReferencia("5555555");		
		p.getProductos().add(producto);		
		
		repository.save(p);
	}	
	
	@After
	public void deleteBBDD() throws Exception {		
		repository.delete("11111111");;
	}	
	
}
