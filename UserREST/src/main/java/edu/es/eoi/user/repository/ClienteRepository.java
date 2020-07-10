package edu.es.eoi.user.repository;

import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import edu.es.eoi.user.entity.Cliente;

@Repository
public class ClienteRepository {

	@Autowired
	@Qualifier("BANCO")
	EntityManager manager;
	
	
	public Cliente findById(String dni) {
		return manager.find(Cliente.class, dni);
	}

	
	public void create(Cliente e) {
		manager.persist(e);		
	}

	
	public void update(Cliente e) {
		manager.merge(e);		
	}

	public void deleteById(String dni) {
		manager.remove(findById(dni));		
	}
	
	public List<Cliente> findAll() {
		return manager.createQuery("from Cliente",Cliente.class).
				getResultStream().
				collect(Collectors.toList());
	}

}
