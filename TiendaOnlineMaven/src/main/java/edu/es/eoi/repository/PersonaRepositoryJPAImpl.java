package edu.es.eoi.repository;

import java.util.Map;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import edu.es.eoi.entity.Persona;

public class PersonaRepositoryJPAImpl implements MyRepository<Persona> {

	static EntityManager manager= Persistence.createEntityManagerFactory("TIENDA_PERSISTENCE_UNIT").createEntityManager();	
	
	@Override
	public Persona read(String ref) throws Exception {
		return manager.find(Persona.class, ref);		
	}

	@Override
	public void save(Persona e) throws Exception {
		
		manager.getTransaction().begin();
		manager.merge(e);	
		manager.getTransaction().commit();
	}

	@Override
	public Map<String, Persona> readAll() throws Exception {	
		return manager.createQuery("from Persona",Persona.class).
				getResultStream().
				collect(Collectors.toMap(Persona::getUsername, p->p));
	}

	@Override
	public void delete(String ref) throws Exception {		
		manager.getTransaction().begin();
		manager.remove(manager.find(Persona.class, ref));
		manager.getTransaction().commit();
		
	}

}
