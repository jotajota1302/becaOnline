package edu.es.eoi.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import edu.es.eoi.user.entity.User;
import edu.es.eoi.user.repository.MyRepository;

@Service
public class UserService {

	@Autowired
	@Qualifier("JPA")
	private MyRepository<User> repository;

	public User findUserById(Integer idUsuario) {
		return repository.findById(idUsuario);
	}

	public void createUser(User user) {
		repository.create(user);
	}
	
	public void updateUser(User user) {
		repository.update(user);
	}
	
	public void deleteById(Integer id) {
		repository.deleteById(id);		
	}
	
	public List<User> findAll() {
		return repository.findAll();
	}

}
