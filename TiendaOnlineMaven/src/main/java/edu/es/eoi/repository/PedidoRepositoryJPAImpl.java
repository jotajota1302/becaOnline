package edu.es.eoi.repository;

import java.util.Map;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import edu.es.eoi.entity.Pedido;

@Repository
public class PedidoRepositoryJPAImpl implements MyRepository<Pedido> {

	static EntityManager manager= Persistence.createEntityManagerFactory("TIENDA_PERSISTENCE_UNIT").createEntityManager();	
	
	@Override
	public Pedido read(String ref) throws Exception {
		return manager.find(Pedido.class, ref);		
	}

	@Override
	public void save(Pedido e) throws Exception {
		
		manager.getTransaction().begin();
		manager.merge(e);	
		manager.getTransaction().commit();
	}

	@Override
	public Map<String, Pedido> readAll() throws Exception {	
		return manager.createQuery("from Pedido",Pedido.class).
				getResultStream().
				collect(Collectors.toMap(Pedido::getReferencia, p->p));
	}

	@Override
	public void delete(String ref) throws Exception {		
		manager.getTransaction().begin();
		manager.remove(manager.find(Pedido.class, ref));
		manager.getTransaction().commit();
		
	}

}
