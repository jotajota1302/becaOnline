package edu.es.eoi.repository;

import edu.es.eoi.entity.Producto;

public class ProductoRepository {

	private Producto[] almacen;

	public ProductoRepository(Producto[] productos) {
		super();
		this.almacen = productos;
	}

	public void guardar(Producto producto) {
		for (int i = 0; i < almacen.length; i++) {
			if (almacen[i] == null) {
				almacen[i] = producto;
			}
		}
	}

	public Producto leer(String referencia) {

		Producto producto = null;

		for (int i = 0; i < almacen.length; i++) {
			if (almacen[i].getReferencia().equals(referencia)) {
				producto = almacen[i];
				break;
			}
		}
		return producto;
	}

	public void actualizar(Producto producto) {

		for (int i = 0; i < almacen.length; i++) {
			if (almacen[i].getReferencia().equals(producto.getReferencia())) {
				almacen[i] = producto;
				break;
			}
		}
	}

	public void borrar(String referencia) {
		for (int i = 0; i < almacen.length; i++) {
			if (almacen[i].getReferencia().equals(referencia)) {
				almacen[i] = null;
				break;
			}
		}
	}

}
