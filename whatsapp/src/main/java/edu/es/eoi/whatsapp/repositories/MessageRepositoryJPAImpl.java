package edu.es.eoi.whatsapp.repositories;

import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import edu.es.eoi.whatsapp.entities.Message;

@Repository
public class MessageRepositoryJPAImpl  implements MyRepository<Message> {

	static EntityManager manager= Persistence.createEntityManagerFactory("WHATSAPP_PERSISTENCE_UNIT").createEntityManager();	
	
	public Message read(String ref) throws Exception {
		return manager.find(Message.class, ref);		
	}

	public void save(Message e) throws Exception {
		
		manager.getTransaction().begin();
		manager.merge(e);	
		manager.getTransaction().commit();
	}

	
	public void delete(String ref) throws Exception {		
		manager.getTransaction().begin();
		manager.remove(manager.find(Message.class, ref));
		manager.getTransaction().commit();
		
	}

	public List<Message> readMessagesByDestiny(String ref) {		
		return manager.createQuery("from Message m where m.destiny.phone=:ref",Message.class).setParameter("ref", ref).
				getResultStream().			
				collect(Collectors.toList());
	}
	
	
	
}
