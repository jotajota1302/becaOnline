package edu.es.eoi.user.repository;

import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;

import edu.es.eoi.user.entity.Banco;

public class BancoRepository implements MyRepository<Banco>{

	@Autowired
	EntityManager manager;
	
	@Override
	public Banco findById(Integer id) {
		return manager.find(Banco.class, id);
	}

	@Override
	public void create(Banco e) {
		manager.merge(e);		
	}

	@Override
	public void update(Banco e) {
		manager.merge(e);		
	}

	@Override
	public void deleteById(Integer id) {
		manager.remove(findById(id));		
	}

	@Override
	public List<Banco> findAll() {
		return manager.createQuery("from Banco",Banco.class).
				getResultStream().
				collect(Collectors.toList());
	}

}