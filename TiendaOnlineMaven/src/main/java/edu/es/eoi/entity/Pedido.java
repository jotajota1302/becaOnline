package edu.es.eoi.entity;

import java.util.ArrayList;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pedido {
	
	private String numeroPedido;
	private Persona comprador;
	private ArrayList<Producto> productos;
	private Date fechaCompra;	
	
}
