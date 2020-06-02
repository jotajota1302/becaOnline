package edu.es.eoi.entities;

import java.util.ArrayList;
import java.util.List;

public class NuevaMaquina extends Maquina {

	List<Producto> productos= new ArrayList<Producto>();
	
	@Override
	public void rellenar(Producto producto) {		
		super.rellenar(producto);
	}

	@Override
	public void vender(Producto producto) {		
		productos.remove(1);
	}

	
	
	
}
