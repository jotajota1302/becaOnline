package edu.es.eoi.controller;

import edu.es.eoi.entity.Carrito;
import edu.es.eoi.entity.Pedido;
import edu.es.eoi.entity.Persona;
import edu.es.eoi.service.PedidoService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PedidoController {
	
	private Carrito carrito;
	private PedidoService service;

	public Pedido comprar(Persona persona, Carrito carrito) throws Exception {
		return service.compra(persona, carrito);
	}


}
