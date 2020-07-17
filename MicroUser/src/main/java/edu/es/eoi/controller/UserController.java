package edu.es.eoi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import edu.es.eoi.entity.Product;
import edu.es.eoi.entity.User;
import edu.es.eoi.feign.ProductInterface;
import edu.es.eoi.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService service;
	
	@Autowired
	private ProductInterface feign;
			
	@GetMapping("/users")
	public ResponseEntity<List<User>> findAll(){		
		return ResponseEntity.ok(service.findAll());
	}
	
	@GetMapping("/users/{id}/products")	
	public ResponseEntity<List<Product>> findAllOrdersByUserId(@PathVariable Integer id){			
		return feign.findAll();			
	}
	
	
}
