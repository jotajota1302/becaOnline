package edu.es.eoi.view;

import java.util.Scanner;

import edu.es.eoi.App;
import edu.es.eoi.entity.Producto;

public class ProductoView {
		
	public static void imprimirProducto(Producto producto) {
		
		System.out.println("Informacion del producto: " + producto.getNombre());
		System.out.println(producto);
		
	}
	
	public static Producto introduceReferencia() {
		
		System.out.println("Introduce la referencia del producto: ");
		@SuppressWarnings("resource")
		Scanner scanner= new Scanner(System.in);
		return App.productoController.buscar(scanner.next());
		
	}

}
