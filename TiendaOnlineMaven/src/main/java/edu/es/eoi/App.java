package edu.es.eoi;

import edu.es.eoi.controller.PedidoController;
import edu.es.eoi.controller.ProductoController;
import edu.es.eoi.entity.Carrito;
import edu.es.eoi.entity.Pedido;
import edu.es.eoi.entity.Persona;
import edu.es.eoi.entity.Producto;
import edu.es.eoi.repository.MyRepository;
import edu.es.eoi.repository.PedidoRepositoryJPAImpl;
import edu.es.eoi.repository.ProductoRepositoryGSONImpl;
import edu.es.eoi.repository.ProductoRepositoryJDBCImpl;
import edu.es.eoi.repository.ProductoRepositoryJPAImpl;
import edu.es.eoi.service.PedidoService;
import edu.es.eoi.service.ProductoService;
import edu.es.eoi.view.MenuPrincipalView;

public class App {

	public static Carrito carrito;	
	public static Persona persona;	
	public static ProductoController productoController;
	public static PedidoController	pedidoController;

	public static void main(String[] args) throws Exception {		
			inicializarApp();			
			start();		
	}
	
	public static void start() throws Exception {		
		MenuPrincipalView.imprimirMenu();		
		start();		
	}
	
	@SuppressWarnings("unused")
	public static void inicializarApp() {		
		
		carrito= new Carrito();	
		MyRepository<Producto> jdbcRepository=new ProductoRepositoryJDBCImpl();
		MyRepository<Producto> jpaRepository=new ProductoRepositoryJPAImpl();
		MyRepository<Producto> gsonRepository=new ProductoRepositoryGSONImpl();
		ProductoService productoService= new ProductoService(carrito,jpaRepository);
		productoController= new ProductoController(productoService);
		MyRepository<Pedido> jpaRepoPedidos= new PedidoRepositoryJPAImpl();
		PedidoService pedidoService= new PedidoService(jpaRepoPedidos);
		pedidoController= new PedidoController(carrito,pedidoService);
		persona=new Persona();
		persona.setNif("987654321A");
		persona.setUsername("USER");
		persona.setPassword("password");
		
	
	}
	
}
