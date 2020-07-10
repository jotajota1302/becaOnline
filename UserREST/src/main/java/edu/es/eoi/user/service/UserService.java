package edu.es.eoi.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.es.eoi.user.domain.User;
import edu.es.eoi.user.repository.UserRepositoryJDBCImpl;

@Service
public class UserService {

	@Autowired
	UserRepositoryJDBCImpl repository;

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
