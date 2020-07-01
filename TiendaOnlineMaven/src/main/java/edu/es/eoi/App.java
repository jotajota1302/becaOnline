package edu.es.eoi;

import java.util.ArrayList;

import edu.es.eoi.controller.ProductoController;
import edu.es.eoi.entity.Carrito;
import edu.es.eoi.entity.ListaDeseos;
import edu.es.eoi.entity.Producto;
import edu.es.eoi.repository.MyRepository;
import edu.es.eoi.repository.ProductoRepositoryGSONImpl;
import edu.es.eoi.repository.ProductoRepositoryJDBCImpl;
import edu.es.eoi.repository.ProductoRepositoryJPAImpl;
import edu.es.eoi.service.ProductoService;
import edu.es.eoi.view.MenuPrincipalView;

public class App {

	public static Carrito carrito;
	public static ListaDeseos deseos;
	public static ProductoController productoController;

	public static void main(String[] args) throws Exception {		
			inicializarApp();			
			start();		
	}
	
	public static void start() throws Exception {		
		MenuPrincipalView.imprimirMenu();		
		start();		
	}
	
	public static void inicializarApp() {		
		
		carrito= new Carrito(new ArrayList<Producto>());
		deseos= new ListaDeseos(new ArrayList<Producto>());	
		MyRepository<Producto> jdbcRepository=new ProductoRepositoryJDBCImpl();
		MyRepository<Producto> jpaRepository=new ProductoRepositoryJPAImpl();
		MyRepository<Producto> gsonRepository=new ProductoRepositoryGSONImpl();
		ProductoService service= new ProductoService(carrito, deseos, jpaRepository);
		productoController= new ProductoController(service);
	
	}
	
}
