package edu.es.eoi.repository;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import edu.es.eoi.entity.Producto;
import edu.es.eoi.util.TiendaOnlineUtils;

public class ProductoRepository {

	public Producto leer(String referencia) throws Exception {

		Producto producto = null;
		TiendaOnlineUtils util = new TiendaOnlineUtils();
//		File fichero = util.getFileFromResources("productos.txt");
		File fichero= new File("C:/git beca online/becaOnline/TiendaOnlineMaven/src/main/resources/productos.txt");
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
}
