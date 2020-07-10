package edu.es.eoi.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.es.eoi.user.entity.Cliente;
import edu.es.eoi.user.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repository;

	public Cliente findClienteById(String dni) {
		return repository.findById(dni);
	}

	public void createCliente(Cliente Cliente) {
		repository.create(Cliente);
	}
	
	public void updateCliente(Cliente Cliente) {
		repository.update(Cliente);
	}
	
	public void deleteById(String dni) {
		repository.deleteById(dni);		
	}
	
	public List<Cliente> findAll() {
		return repository.findAll();
	}

}
