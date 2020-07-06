package edu.es.eoi.view;

import java.util.Map;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.es.eoi.controller.ProductoController;
import edu.es.eoi.entity.Producto;

@Component
public class ListadoProductosView {
	
	@Autowired
	ProductoController controller;
	
	@SuppressWarnings("resource")
	public void imprimirProductos() throws Exception {
		
		System.out.println("Estos son todos mis productos: ");
		
		Map<String,Producto> productos= controller.readAll();
		
		for (Producto producto : productos.values()) {
			System.out.println(producto);
		}
		
		System.out.println("Introduce la referencia del producto que quieres comprar: ");
		Scanner scanner= new Scanner(System.in);
		String opcion=scanner.next();
		
		Producto producto=controller.buscar(opcion);
		
		if(producto!=null) {
			controller.addToCesta(producto);
		}	
	}

}
