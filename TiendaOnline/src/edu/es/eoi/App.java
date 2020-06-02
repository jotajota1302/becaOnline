package edu.es.eoi;

import edu.es.eoi.entity.Producto;
import edu.es.eoi.view.MenuPrincipal;

public class App {

	public static Producto[] productos=new Producto[100];
		
	public static void main(String[] args) {
	
		MenuPrincipal.imprimirMenu();
		
		main(null);
		
	}
	
	public void inicializarProductos() {
		//crear los productos inciales que vamos a vender
	}
	
}
