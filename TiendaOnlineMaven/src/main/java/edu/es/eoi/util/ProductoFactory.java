package edu.es.eoi.util;

import edu.es.eoi.entity.Ordenador;
import edu.es.eoi.entity.Producto;

public class ProductoFactory {
	
	public static Producto getProducto(String tipo) {
		
		Producto producto = null;
				
		if(tipo.equals("PC")) {
			producto=new Ordenador("nombre", "referencia", 100, "descripcion", 10, "modelo", 220, "sistemaOperativo");
		}
		
		return producto;
	}

}
