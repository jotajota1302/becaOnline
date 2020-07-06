package edu.es.eoi.view;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.es.eoi.controller.MenuController;

@Component
public class MenuPrincipalView {

	@Autowired
	MenuController controller;
	
	public void imprimirMenu() throws Exception {

		System.out.println("Bienvenido a mi tienda, seleccion opcion: ");
		System.out.println("0-Listar productos: ");
		System.out.println("1-Tramitar compra: ");
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int opcion = scanner.nextInt();

		controller.gestionaOpcionMenu(opcion);

	}

	

}
