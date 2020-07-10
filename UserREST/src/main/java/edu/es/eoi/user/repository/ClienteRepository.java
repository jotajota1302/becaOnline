package edu.es.eoi.user.repository;

import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;

import edu.es.eoi.user.entity.Cliente;

public class ClienteRepository implements MyRepository<Cliente>{

	@Autowired
	EntityManager manager;
	
	@Override
	public Cliente findById(Integer id) {
		return manager.find(Cliente.class, id);
	}

	@Override
	public void create(Cliente e) {
		manager.merge(e);
		
	}

	@Override
	public void update(Cliente e) {
		manager.merge(e);
		
	}

	@Override
	public void deleteById(Integer id) {
		manager.remove(findById(id));		
	}

	@Override
	public List<Cliente> findAll() {
		return manager.createQuery("from Cliente",Cliente.class).
				getResultStream().
				collect(Collectors.toList());
	}

}
