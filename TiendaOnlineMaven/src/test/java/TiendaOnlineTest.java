import java.io.FileNotFoundException;
import java.io.FileReader;

import org.junit.jupiter.api.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import edu.es.eoi.entity.Producto;
import edu.es.eoi.repository.ProductoRepository;
import edu.es.eoi.util.TiendaOnlineUtils;

class TiendaOnlineTest {

	
	@Test
	void leerJson() throws FileNotFoundException {

		TiendaOnlineUtils util= new TiendaOnlineUtils();	
		Gson gson =new GsonBuilder().setPrettyPrinting().create();	

		FileReader reader=new FileReader(util.getFileFromResources("productos.json"));
			
		Producto producto = gson.fromJson(reader, Producto.class);
	
		Producto producto2= new Producto("aaaaa", "bbbb",1,"ddd",2);
		
		String json = gson.toJson(producto2);
		System.out.println(json);
		System.out.println(producto);
		
	}
	
	
	@Test
	void testGuardar() {

		ProductoRepository repository= new ProductoRepository();
		try {
			repository.guardar(new Producto("ProductoTEST","referencia",100,"descripcion",5));
		} catch (Exception e) {		
			e.printStackTrace();
		}
		
	}

}
