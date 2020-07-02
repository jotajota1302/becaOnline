package edu.es.eoi.controller;

import edu.es.eoi.App;
import edu.es.eoi.view.IntroduceDatosPedidoView;
import edu.es.eoi.view.ListadoProductosView;

public class MenuController {

	public static void gestionaOpcionMenu(int opcion) throws Exception {

		switch (opcion) {
		case 0:
			System.out.println("Navegar a menu 0");
			ListadoProductosView.imprimirProductos(App.productoController.readAll());
			App.start();
			break;
		case 1:
			System.out.println("Navegar a menu 0");
			IntroduceDatosPedidoView.imprimir();
			App.start();
			break;
		}

	}

}
