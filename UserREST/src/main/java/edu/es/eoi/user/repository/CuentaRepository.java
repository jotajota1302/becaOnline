package edu.es.eoi.user.repository;

import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;

import edu.es.eoi.user.entity.Cuenta;

public class CuentaRepository implements MyRepository<Cuenta>{

	@Autowired
	EntityManager manager;
	
	@Override
	public Cuenta findById(Integer id) {
		return manager.find(Cuenta.class, id);
	}

	@Override
	public void create(Cuenta e) {
		manager.merge(e);		
	}

	@Override
	public void update(Cuenta e) {
		manager.merge(e);		
	}

	@Override
	public void deleteById(Integer id) {
		manager.remove(findById(id));		
	}

	@Override
	public List<Cuenta> findAll() {
		return manager.createQuery("from Cuenta",Cuenta.class).
				getResultStream().
				collect(Collectors.toList());
	}

}
