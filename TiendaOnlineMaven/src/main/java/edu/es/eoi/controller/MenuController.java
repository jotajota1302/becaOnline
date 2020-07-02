package edu.es.eoi.controller;

import edu.es.eoi.App;
import edu.es.eoi.entity.Pedido;
import edu.es.eoi.view.ListadoProductosView;
import edu.es.eoi.view.PedidoView;

public class MenuController {

	public static void gestionaOpcionMenu(int opcion) throws Exception {

		switch (opcion) {
		case 0:
			System.out.println("Navegar a menu 0");
			ListadoProductosView.imprimirProductos();
			App.start();
			break;
		case 1:
			System.out.println("Voy a tramitar tu pedido");	
			Pedido p=App.pedidoController.comprar(App.persona, App.carrito);
			PedidoView.imprimePedido(p);
			App.start();
			break;
		}

	}

}
