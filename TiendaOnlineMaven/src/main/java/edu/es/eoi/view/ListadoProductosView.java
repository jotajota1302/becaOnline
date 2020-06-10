package edu.es.eoi.view;

import java.util.List;

import edu.es.eoi.entity.Producto;

public class ListadoProductosView {
	
	
	public static void imprimirProductos(List<Producto> productos) {
		
		System.out.println("Estos son todos mis productos: ");
		
		for (Producto producto : productos) {
			System.out.println(producto);
		}
		
	}

}
