package edu.es.eoi.service;

import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.es.eoi.entity.Carrito;
import edu.es.eoi.entity.Pedido;
import edu.es.eoi.entity.Persona;
import edu.es.eoi.entity.Producto;
import edu.es.eoi.repository.MyRepository;
import edu.es.eoi.util.Utils;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Service
public class PedidoService {
		
	@Autowired
	MyRepository<Pedido> repository;
	
	public Pedido compra(Persona persona, Carrito carrito) throws Exception {
		
		Pedido pedido=new Pedido();
		pedido.setFecha(Calendar.getInstance().getTime());
		pedido.setReferencia(Utils.getIdentificadorPedido(persona));
		pedido.setPersona(persona);
		pedido.setProductos(carrito.getProductos());
		
		repository.save(pedido);	
		
		return pedido;
	}

	public Pedido getInformacionPedido(String referencia) throws Exception {		
		return repository.read(referencia);		
	}	
	
	public List<Pedido> getPedidosByPersona(String referencia) throws Exception{
		
		return repository.readAll().values().stream().
				filter(p->p.getReferencia().equals(referencia)).
				collect(Collectors.toList());
	}
	
	public Producto getProductoMasVendido() throws Exception {	
		return null;
	}
	
}
