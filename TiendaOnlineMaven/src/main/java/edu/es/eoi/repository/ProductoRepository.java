package edu.es.eoi.repository;

import java.util.List;

import edu.es.eoi.entity.Producto;

public class ProductoRepository {

	private List<Producto> almacen;

	public ProductoRepository(List<Producto> productos) {
		super();
		this.almacen = productos;
	}

	public void guardar(Producto producto) {	
		almacen.add(producto);
	}

	public Producto leer(String referencia) {

		Producto producto = null;
		for (Producto tmp : almacen) {
			if(tmp.getReferencia().equals(referencia)) {
				producto=tmp;
			}
		}
		return producto;
	}

	public void actualizar(Producto producto) {		
		almacen.set(almacen.indexOf(producto),producto);		
	}

	public void borrar(String referencia) {
		Producto producto = null;
		
		for (Producto tmp : almacen) {
			if(tmp.getReferencia().equals(referencia)) {
				producto=tmp;
			}
		}
		almacen.remove(producto);
	}

}
