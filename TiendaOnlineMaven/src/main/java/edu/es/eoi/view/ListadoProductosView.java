package edu.es.eoi.view;

import java.util.Map;

import edu.es.eoi.entity.Producto;

public class ListadoProductosView {
	
	
	public static void imprimirProductos(Map<String,Producto> productos) {
		
		System.out.println("Estos son todos mis productos: ");
		
		for (Producto producto : productos.values()) {
			System.out.println(producto);
		}
		
	}

}
