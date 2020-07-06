package edu.es.eoi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import edu.es.eoi.App;
import edu.es.eoi.entity.Pedido;
import edu.es.eoi.view.ListadoProductosView;
import edu.es.eoi.view.PedidoView;

@Controller
public class MenuController {
	
	@Autowired	
	public PedidoController pedidoController;
	
	@Autowired
	public ListadoProductosView view;
	
	public void gestionaOpcionMenu(int opcion) throws Exception {

		switch (opcion) {
		case 0:
			System.out.println("Navegar a menu 0");
			view.imprimirProductos();
			App.start();
			break;
		case 1:
			System.out.println("Voy a tramitar tu pedido");	
			Pedido p=pedidoController.comprar();
			PedidoView.imprimePedido(p);
			App.start();
			break;
		}

	}

}
