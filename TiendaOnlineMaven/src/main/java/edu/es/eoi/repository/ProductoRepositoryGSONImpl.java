package edu.es.eoi.repository;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import edu.es.eoi.entity.Producto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Repository
@Qualifier("GSON")
public class ProductoRepositoryGSONImpl implements MyRepository<Producto> {
	
	private String pathFichero="src/main/resources/productos.json";

	@Override
	public Producto read(String referencia) throws Exception {
		
		Gson gson =new GsonBuilder().setPrettyPrinting().create();
		FileReader reader=new FileReader(new File(pathFichero));							
	    Type type = new TypeToken<HashMap<String, Producto>>(){}.getType();
	    Map<String,Producto> productos = gson.fromJson(reader, type);

		return  productos.get(referencia);
	}

	@Override
	public void save(Producto producto) throws Exception {	
		
		Gson gson =new GsonBuilder().setPrettyPrinting().create(); 
		Map<String,Producto> productos=readAll();
		
		if(productos==null) {
			productos= new HashMap<String,Producto>();
		}		
		if(!productos.containsKey(producto.getReferencia())) {
			productos.put(producto.getReferencia(),producto);
		}else {			
			Producto p=productos.get(producto.getReferencia());
			p.setDescripcion(producto.getDescripcion());
			p.setNombre(producto.getNombre());
			p.setPrecio(producto.getPrecio());
			p.setStock(producto.getStock());			
		}
		
		FileWriter writer= new FileWriter(new File(pathFichero));	
		writer.write(gson.toJson(productos));
		writer.close();	
		
	}
	
	@Override
	public Map<String, Producto> readAll() throws FileNotFoundException{
	
		Gson gson =new GsonBuilder().setPrettyPrinting().create(); 
		FileReader reader=new FileReader(new File(pathFichero));
		Type type = new TypeToken<HashMap<String, Producto>>(){}.getType();
		Map<String,Producto> productos = gson.fromJson(reader, type);
		
		return productos;
	}
		
	@Override
	public void delete(String referencia) throws IOException {
		
		Map<String, Producto> productos = readAll();
		productos.remove(referencia);
		
		Gson gson =new GsonBuilder().setPrettyPrinting().create();
		FileWriter writer= new FileWriter(new File(pathFichero));	
		writer.write(gson.toJson(productos));
		writer.close();	
		
	}
	

}
