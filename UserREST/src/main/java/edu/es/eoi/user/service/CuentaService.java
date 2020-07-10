package edu.es.eoi.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.es.eoi.user.entity.Cuenta;
import edu.es.eoi.user.repository.MyRepository;

@Service
public class CuentaService {

	@Autowired	
	private MyRepository<Cuenta> repository;

	public Cuenta findCuentaById(Integer id) {
		return repository.findById(id);
	}

	public void createCuenta(Cuenta Cuenta) {
		repository.create(Cuenta);
	}
	
	public void updateCuenta(Cuenta Cuenta) {
		repository.update(Cuenta);
	}
	
	public void deleteById(Integer id) {
		repository.deleteById(id);		
	}
	
	public List<Cuenta> findAll() {
		return repository.findAll();
	}

}
