package edu.es.eoi.repository;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import edu.es.eoi.entity.Producto;
import edu.es.eoi.util.TiendaOnlineUtils;

public class ProductoRepository {

	public Producto leer(String referencia) throws Exception {

		Producto producto = null;
		TiendaOnlineUtils util = new TiendaOnlineUtils();
		File fichero = util.getFileFromResources("productos.txt");
		FileReader reader = new FileReader(fichero);
		BufferedReader br = new BufferedReader(reader);

		String line;
		while ((line = br.readLine()) != null) {
			String[] prod = line.split(",");
			if (prod[1].equals(referencia)) {
				producto = new Producto(prod[0], prod[1], Double.valueOf(prod[2]), prod[3], Integer.valueOf(prod[4]));
				br.close();
				return producto;
			}
		}
		br.close();
		return producto;
	}

	public Producto guardar(Producto producto) throws Exception {

		TiendaOnlineUtils util = new TiendaOnlineUtils();
		File fichero = util.getFileFromResources("productos.txt");
		FileWriter writer = new FileWriter(fichero, true);

		writer.write(producto.getNombre().concat(",")
				.concat(producto.getReferencia()
				.concat(",")
				.concat(String.valueOf(producto.getPrecio())
				.concat(",")
				.concat(producto.getDescripcion()
				.concat(",")
				.concat(String.valueOf(producto.getStock()))))));
				
		writer.close();

		return producto;
	}

}
