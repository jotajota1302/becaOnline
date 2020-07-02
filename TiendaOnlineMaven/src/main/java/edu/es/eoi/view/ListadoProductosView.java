package edu.es.eoi.view;

import java.util.Map;
import java.util.Scanner;

import edu.es.eoi.App;
import edu.es.eoi.entity.Producto;

public class ListadoProductosView {
	
	
	@SuppressWarnings("resource")
	public static void imprimirProductos() throws Exception {
		
		System.out.println("Estos son todos mis productos: ");
		
		Map<String,Producto> productos= App.productoController.readAll();
		
		for (Producto producto : productos.values()) {
			System.out.println(producto);
		}
		
		System.out.println("Introduce la referencia del producto que quieres comprar: ");
		Scanner scanner= new Scanner(System.in);
		String opcion=scanner.next();
		
		Producto producto=App.productoController.buscar(opcion);
		
		if(producto!=null) {
			App.productoController.addToCesta(producto);
		}	
	}

}
