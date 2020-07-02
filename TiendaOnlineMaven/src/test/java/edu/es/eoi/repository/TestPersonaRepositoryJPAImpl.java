package edu.es.eoi.repository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.es.eoi.entity.Persona;

public class TestPersonaRepositoryJPAImpl {

	MyRepository<Persona> repository= new PersonaRepositoryJPAImpl();
	
	@Test
	public void testLeer() throws Exception {		
		Persona Persona=repository.read("11111111T");		
		assertEquals(Persona.getNif(), "11111111T");				
	}

	@Test
	public void testGuardar() throws Exception {		
		Persona p= new Persona();
		p.setNif("222222222C");
		p.setUsername("persona@gmail.com");
		p.setPassword("pass");
		repository.save(p);
		assertEquals("pass",repository.read("222222222C").getPassword());	
	}
	
	@Test
	public void testBorrar() throws Exception {			
		repository.delete("222222222C");	
		assertNull(repository.read("222222222C"));
	}
	
	@Test
	public void testLeerTodos() throws Exception {	
		assertNotNull(repository.readAll());	
	}
	
	@Before
	public void initBBDD() throws Exception {	
		Persona p= new Persona();
		p.setNif("11111111T");
		p.setUsername("jj@gmail.com");
		p.setPassword("password");
		repository.save(p);
	}	
	
	@After
	public void deleteBBDD() throws Exception {		
		repository.delete("11111111T");;
	}	
	
}
