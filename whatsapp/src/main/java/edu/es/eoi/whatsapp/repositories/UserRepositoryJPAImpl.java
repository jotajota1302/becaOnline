package edu.es.eoi.whatsapp.repositories;

import java.util.Map;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import edu.es.eoi.whatsapp.entities.User;

@Repository
public class UserRepositoryJPAImpl implements MyRepository<User> {

	static EntityManager manager= Persistence.createEntityManagerFactory("WHATSAPP_PERSISTENCE_UNIT").createEntityManager();	
	
	@Override
	public User read(String ref) throws Exception {
		return manager.find(User.class, ref);		
	}

	@Override
	public void save(User e) throws Exception {
		
		manager.getTransaction().begin();
		manager.merge(e);	
		manager.getTransaction().commit();
	}
	
	public Map<String, User> readAll() throws Exception {	
		return manager.createQuery("from User",User.class).
				getResultStream().
				collect(Collectors.toMap(User::getPhone, p->p));
	}

	@Override
	public void delete(String ref) throws Exception {		
		manager.getTransaction().begin();
		manager.remove(manager.find(User.class, ref));
		manager.getTransaction().commit();
		
	}

}
