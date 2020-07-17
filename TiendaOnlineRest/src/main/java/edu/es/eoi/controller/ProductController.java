package edu.es.eoi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.es.eoi.entity.Product;
import edu.es.eoi.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService service;
	
	@GetMapping("/products")
	public ResponseEntity<List<Product>> findAll(){		
		return ResponseEntity.ok(service.findAll());
	}
	
}
