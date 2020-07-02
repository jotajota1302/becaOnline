package edu.es.eoi.controller;

import edu.es.eoi.entity.Pedido;
import edu.es.eoi.service.PedidoService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PedidoController {

	private PedidoService service;

	public void alta(Pedido pedido) throws Exception {
		service.alta(pedido);
	}


}
