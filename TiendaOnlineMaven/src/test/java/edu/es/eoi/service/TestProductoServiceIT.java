package edu.es.eoi.service;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import edu.es.eoi.entity.Carrito;
import edu.es.eoi.entity.ListaDeseos;
import edu.es.eoi.entity.Producto;

public class TestProductoServiceIT {

	@Test
	public void testBuscar() throws Exception {
		ProductoService servicio= new ProductoService(new Carrito(new ArrayList<Producto>()),new ListaDeseos(new ArrayList<Producto>()));
		servicio.getRepository().setPathFichero("src/test/resources/productosTest.json");
		Producto p=servicio.buscar("123456");
		assertEquals(p.getReferencia(), "123456");
	}
	
}
