package edu.es.eoi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.es.eoi.dto.OrderDto;
import edu.es.eoi.feign.OrderInterfaceController;
import edu.es.eoi.service.Manager;

@RestController
public class OrderController implements OrderInterfaceController{

	@Autowired
	private Manager<OrderDto, Integer> service;	
		
	@GetMapping("/orders")
	public ResponseEntity<List<OrderDto>> findAll() {		
		return ResponseEntity.ok(service.findAll());
	}
		
	@GetMapping("/orders/{id}")
	public ResponseEntity<OrderDto> findById(Integer id) {		
		return ResponseEntity.ok(service.findById(id).get());
	}

	@PostMapping("/orders")
	public ResponseEntity<OrderDto> create(OrderDto dto) {	
		service.create(dto);
		return new ResponseEntity<OrderDto>(HttpStatus.CREATED);
	}

	@PutMapping("/orders/{id}")
	public ResponseEntity<OrderDto> update(OrderDto dto, Integer id) {
		if(dto.getId()!=id) {
			return new ResponseEntity<OrderDto>(HttpStatus.BAD_REQUEST);
		}
		service.create(dto);
		return new ResponseEntity<OrderDto>(HttpStatus.ACCEPTED);
	}

	@DeleteMapping("/orders")
	public ResponseEntity<OrderDto> delete(Integer id) {
		service.delete(id);
		return new ResponseEntity<OrderDto>(HttpStatus.ACCEPTED);
	}	
	
	
	
	
	
	
}
