package edu.es.eoi;

import edu.es.eoi.controller.ProductoController;
import edu.es.eoi.entity.Batidora;
import edu.es.eoi.entity.Carrito;
import edu.es.eoi.entity.ListaDeseos;
import edu.es.eoi.entity.Producto;
import edu.es.eoi.view.MenuPrincipalView;

public class App {

	public static Producto[] almacen;
	public static Carrito carrito;
	public static ListaDeseos deseos;
	public static ProductoController productoController;
	
	public static void main(String[] args) {
	
		inicializarApp();
		
		MenuPrincipalView.imprimirMenu();
		
		main(null);
		
	}
	
	public static void inicializarApp() {
		
		almacen=new Producto[1000];
		carrito= new Carrito(new Producto[10]);
		deseos= new ListaDeseos(new Producto[10]);
		
		Producto p1= new Batidora("Moulinex BC1", "4589865412", 40, "Maravillos batidora ultimo modelo", 20, "BC1", 220, 2500);
		Producto p2= new Batidora("Aliexpress CC", "4454545452", 20, "Batidora regulera pero barata", 20, "CC2", 220, 2500);
		
		almacen[0]=p1;
		almacen[1]=p2;
		
		productoController= new ProductoController(almacen, carrito, deseos);	
	
	}
	
}
