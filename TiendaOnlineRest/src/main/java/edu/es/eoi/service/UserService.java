package edu.es.eoi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.es.eoi.entities.repository.UserRepository;
import edu.es.eoi.entity.User;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){		
		return repository.findAll();
	}
	
}
