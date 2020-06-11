import org.junit.jupiter.api.Test;

import edu.es.eoi.entity.Producto;
import edu.es.eoi.repository.ProductoRepository;

class TiendaOnlineTest {

	
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
