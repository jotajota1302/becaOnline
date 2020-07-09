package edu.es.eoi.user.controller;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.es.eoi.user.domain.User;
import edu.es.eoi.user.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService service;
	
	@GetMapping("users/{id}")
	public ResponseEntity<User> findUserByIdUsuario(@PathVariable Integer id) {
		return ResponseEntity.ok(service.findUserById(id));
	}
	
	@PostMapping("users")
	public ResponseEntity<String> createUser(@RequestBody User user) {	
		user.setFecha(Calendar.getInstance().getTime());			
		service.createUser(user);	
		return new ResponseEntity<String>(HttpStatus.CREATED);
	}
	
	@PutMapping("users/{id}")
	public ResponseEntity<String> updateUser(@PathVariable Integer id,@RequestBody User user) {		
		
		if(user.getSaldo()==null) {
			return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
		}
		
		if(!id.equals(user.getIdUsuario())) {
			return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
		}else {						
			service.updateUser(user);	
			return new ResponseEntity<String>(HttpStatus.OK);
		}
	}
	
}
