package edu.es.eoi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.es.eoi.entity.Banco;
import edu.es.eoi.repository.BancoRepository;

@Service
public class BancoService {

	@Autowired
	BancoRepository repository;
	
	public Banco findBancoById(Integer id) {			
		return repository.findById(id).get();
	}
	
	public Banco saveBanco(Banco Banco) {			
		return repository.save(Banco);
	}
	
	public List<Banco> findAll() {			
		return repository.findAll();
	}
	
	public void deleteBancoById(Integer id) {
		repository.deleteById(id);
	}
	
}
