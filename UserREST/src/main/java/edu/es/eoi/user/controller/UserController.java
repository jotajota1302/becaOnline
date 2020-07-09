package edu.es.eoi.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import edu.es.eoi.user.domain.User;
import edu.es.eoi.user.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService service;
	
	@GetMapping("users/{id}")
	public User findUserByIdUsuario(@PathVariable Integer id) {
		return service.findUserById(id);
	}
	
}
