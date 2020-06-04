package edu.es.eoi;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import edu.es.eoi.controller.ProductoController;
import edu.es.eoi.entity.Batidora;
import edu.es.eoi.entity.Carrito;
import edu.es.eoi.entity.ListaDeseos;
import edu.es.eoi.entity.Ordenador;
import edu.es.eoi.entity.Producto;
import edu.es.eoi.entity.Television;
import edu.es.eoi.entity.Zapatilla;
import edu.es.eoi.view.MenuPrincipalView;

public class App {

	public static List<Producto> almacen;
	public static Carrito carrito;
	public static ListaDeseos deseos;
	public static ProductoController productoController;

	public static void main(String[] args) {
	
		inicializarApp();
		
		MenuPrincipalView.imprimirMenu();
		
		main(null);
		
	}
	
	public static void inicializarApp() {
		
		almacen=new ArrayList<Producto>();
		carrito= new Carrito(new ArrayList<Producto>());
		deseos= new ListaDeseos(new ArrayList<Producto>());
		
		Producto p1= new Batidora("Moulinex BC1", "4589865412", 40, "Maravillos batidora ultimo modelo", 20, "BC1", 220, 2500);
		Producto p2= new Batidora("Aliexpress CC", "4454545452", 20, "Batidora regulera pero barata", 20, "CC2", 220, 2500);
		Producto p3= new Ordenador("HP Pavilion", "4789878545", 500, "HP PAVILION con SSD y Windows Vista",2,"HP-21", 220,"W64");
		Producto p4= new Zapatilla("Nike Air Jordan", "4858789865", 100.0, "Jordan shoes", 10,"nike","42.5");
		Producto p5= new Television("Samsung", "6734598409", 450, "TV 42'", 5, "SS1", 230, "HD4k", "Samsung");
				
		almacen.add(p1);
		almacen.add(p2);
		almacen.add(p3);
		almacen.add(p4);
		almacen.add(p5);
		
		
		productoController= new ProductoController(almacen, carrito, deseos);
	
	}
	
}
