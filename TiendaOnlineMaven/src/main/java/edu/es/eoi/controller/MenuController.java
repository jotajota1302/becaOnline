package edu.es.eoi.controller;

import edu.es.eoi.App;
import edu.es.eoi.entity.Producto;
import edu.es.eoi.view.ListadoProductosView;
import edu.es.eoi.view.MenuPrincipalView;
import edu.es.eoi.view.ProductoView;

public class MenuController {

	public static void gestionaOpcionMenu(int opcion) {

		switch (opcion) {
		case 0:
			System.out.println("Navegar a menu 0");
			ListadoProductosView.imprimirProductos(App.almacen);
			MenuPrincipalView.imprimirMenu();
			break;
		case 1:
			System.out.println("Navegar a menu 1");
			break;
		case 2:
			System.out.println("Navegar a menu 2");	
			Producto producto=ProductoView.introduceReferencia();
			ProductoView.imprimirProducto(producto);
			MenuPrincipalView.imprimirMenu();
			break;
		case 3:
			System.out.println("Navegar a menu 3");

			break;
		default:
			System.out.println("Error en la opcion elegida");
			MenuPrincipalView.imprimirMenu();
			break;
		}

	}

}
