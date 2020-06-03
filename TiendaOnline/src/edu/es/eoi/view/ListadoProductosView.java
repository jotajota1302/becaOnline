package edu.es.eoi.view;

import edu.es.eoi.entity.Producto;

public class ListadoProductosView {
	
	
	public static void imprimirProductos(Producto[] productos) {
		
		System.out.println("Estos son todos mis productos: ");
		
		for (int i = 0; i < productos.length; i++) {
			if(productos[i]!=null){
				System.out.println(productos[i]);
			}
		}
		
	}

}
