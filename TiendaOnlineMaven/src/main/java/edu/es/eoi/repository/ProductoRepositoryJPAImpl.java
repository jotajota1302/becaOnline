package edu.es.eoi.repository;

import java.util.Map;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import edu.es.eoi.entity.Producto;

@Repository
@Qualifier("JPA")
public class ProductoRepositoryJPAImpl implements MyRepository<Producto> {
	
	static EntityManager manager= Persistence.createEntityManagerFactory("TIENDA_PERSISTENCE_UNIT").createEntityManager();	
	
	@Override
	public Producto read(String ref) throws Exception {		
		return manager.find(Producto.class, ref);		
	}

	@Override
	public void save(Producto e) throws Exception {		
		manager.getTransaction().begin();
		manager.merge(e);	
		manager.getTransaction().commit();
	}

	@Override
	public Map<String, Producto> readAll() throws Exception {			
		
		return manager.createQuery("from Producto",Producto.class).
				getResultStream().
				collect(Collectors.toMap(Producto::getReferencia, p->p));
	}

	@Override
	public void delete(String ref) throws Exception {		
		manager.getTransaction().begin();
		manager.remove(manager.find(Producto.class, ref));
		manager.getTransaction().commit();
		
	}

}
