package edu.es.eoi.view;

import java.util.Scanner;

import edu.es.eoi.controller.TiendaOnlineController;

public class MenuPrincipal {

	public static void imprimirMenu() {

		System.out.println("Bienvenido a mi tienda, seleccion opcion: ");
		System.out.println("1-Registro: ");
		System.out.println("2-Buscar articulos: ");
		System.out.println("3-Realizar pedido: ");

		Scanner scanner = new Scanner(System.in);
		int opcion = scanner.nextInt();

		TiendaOnlineController.gestionaOpcionMenu(opcion);

	}

	public static void imprimirOpcion1() {

	}

	public static void imprimirOpcion2() {

	}

	public static void imprimirOpcion3() {

	}

}
