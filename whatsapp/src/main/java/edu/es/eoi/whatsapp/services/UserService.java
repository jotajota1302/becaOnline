package edu.es.eoi.whatsapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.es.eoi.whatsapp.entities.User;
import edu.es.eoi.whatsapp.repositories.MyRepository;

@Service
public class UserService {

	@Autowired
	MyRepository<User> repository;
		
	public User read(String ref) throws Exception {
		return repository.read(ref);			}

	public void save(User e) throws Exception {		
		repository.save(e);
	}	
	

}
