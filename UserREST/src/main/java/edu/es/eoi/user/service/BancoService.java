package edu.es.eoi.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.es.eoi.user.entity.Banco;
import edu.es.eoi.user.repository.MyRepository;

@Service
public class BancoService {

	@Autowired	
	private MyRepository<Banco> repository;

	public Banco findBancoById(Integer id) {
		return repository.findById(id);
	}

	public void createBanco(Banco Banco) {
		repository.create(Banco);
	}
	
	public void updateBanco(Banco Banco) {
		repository.update(Banco);
	}
	
	public void deleteById(Integer id) {
		repository.deleteById(id);		
	}
	
	public List<Banco> findAll() {
		return repository.findAll();
	}

}
