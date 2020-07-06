package edu.es.eoi.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import edu.es.eoi.entity.Producto;
import edu.es.eoi.service.ProductoService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Controller
public class ProductoController {

	@Autowired
	private ProductoService service;	

	public void addToCesta(Producto producto) {
		service.addToCesta(producto);
	}
	
	public Producto buscar(String referencia) throws Exception {
		return service.buscar(referencia);
	}
	
	public Map<String, Producto> readAll() throws Exception {
		return service.readAll();
	}

}
