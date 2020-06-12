package edu.es.eoi.repository;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import edu.es.eoi.App;
import edu.es.eoi.entity.Producto;

public class ProductoRepository {
	
	private String pathFichero="src/main/resources/productos.json";

	public Producto leer(String referencia) throws Exception {
		Gson gson =new Gson();
		FileReader reader=new FileReader(new File(pathFichero));	
						
	    Type type = new TypeToken<HashMap<String, Producto>>(){}.getType();
	    Map<String,Producto> productos = gson.fromJson(reader, type);

		return  productos.get(referencia);
	}

	public Producto guardar(Producto producto) throws Exception {		
		Gson gson =new GsonBuilder().setPrettyPrinting().create();			
		FileWriter writer= new FileWriter(new File(pathFichero),false);
		
		App.productos.put(producto.getReferencia(),producto);		
		writer.write(gson.toJson(App.productos));
		writer.close();	
		return producto;
	}

	public String getPathFichero() {
		return pathFichero;
	}

	public void setPathFichero(String pathFichero) {
		this.pathFichero = pathFichero;
	}
	
	

}
