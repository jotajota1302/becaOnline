package edu.es.eoi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import edu.es.eoi.entity.Carrito;
import edu.es.eoi.entity.Pedido;
import edu.es.eoi.entity.Persona;
import edu.es.eoi.service.PedidoService;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Controller
public class PedidoController {
	
	@Autowired
	private Persona persona;	
	@Autowired
	private Carrito carrito;
	@Autowired
	private PedidoService service;

	public Pedido comprar() throws Exception {
		return service.compra(persona, carrito);		
	}

}
