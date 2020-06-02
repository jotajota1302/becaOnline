package edu.es.eoi.controller;

import edu.es.eoi.view.MenuPrincipal;

public class TiendaOnlineController {

	public static void gestionaOpcionMenu(int opcion) {

		switch (opcion) {
		case 1:
			System.out.println("Navegar a menu 1");
			MenuPrincipal.imprimirOpcion1();
			break;
		case 2:
			System.out.println("Navegar a menu 2");
			MenuPrincipal.imprimirOpcion2();
			break;
		case 3:
			System.out.println("Navegar a menu 3");
			MenuPrincipal.imprimirOpcion3();
			break;
		default:
			System.out.println("Error en la opcion elegida");
			MenuPrincipal.imprimirMenu();
			break;
		}

	}

}
