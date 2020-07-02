package edu.es.eoi.view;

import edu.es.eoi.entity.Pedido;
import edu.es.eoi.entity.Producto;

public class PedidoView {
	
	public static void imprimePedido(Pedido pedido) {
		
		System.out.println("PEDIDO REF: " + pedido.getReferencia());
		System.out.println("CONTENIDO: ");
		double cantidad=0.0;
		for (Producto p : pedido.getProductos()) {
			System.out.println(p);
			cantidad=cantidad+p.getPrecio();
		}		
		System.out.println("TOTAL PEDIDO: " + cantidad);
		
	}

}
