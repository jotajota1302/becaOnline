package edu.es.eoi.repository;

import java.util.Map;

import edu.es.eoi.entity.Producto;

public class ProductoRepository {

	private Map<String,Producto> almacen;

	public ProductoRepository(Map<String,Producto> productos) {
		super();
		this.almacen = productos;
	}

	public void guardar(Producto producto) {	
		almacen.put(producto.getReferencia(), producto);
	}

	public Producto leer(String referencia) {		
		return almacen.get(referencia);
	}

	public void actualizar(Producto producto) {		
		almacen.put(producto.getReferencia(), producto);		
	}

	public void borrar(String referencia) {		
		almacen.remove(referencia);
	}

}
