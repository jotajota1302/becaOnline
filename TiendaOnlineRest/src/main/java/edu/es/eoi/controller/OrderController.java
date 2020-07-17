package edu.es.eoi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.es.eoi.entity.Order;
import edu.es.eoi.service.OrderService;

@RestController
public class OrderController {

	@Autowired
	private OrderService service;	
	
	@GetMapping("/orders")
	public ResponseEntity<List<Order>> findAll(){		
		return ResponseEntity.ok(service.findAll());
	}
	
}
