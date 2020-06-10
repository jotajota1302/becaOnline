package edu.es.eoi.view;

import edu.es.eoi.App;
import edu.es.eoi.entity.Producto;

public class CestaView {
		
	public static void imprimirCesta() {
		
		for (Producto producto : App.carrito.getProductos()) {
			System.out.println(producto);
		} 
		
	}
	

}
