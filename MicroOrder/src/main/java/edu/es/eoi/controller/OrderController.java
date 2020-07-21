package edu.es.eoi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;


import edu.es.eoi.dto.OrderDto;
import edu.es.eoi.dto.UserDto;
import edu.es.eoi.feign.InterfaceController;
import edu.es.eoi.feign.UserInterfaceController;
import edu.es.eoi.service.Manager;

@RestController
public class OrderController implements InterfaceController<OrderDto, Integer>{

	@Autowired
	private Manager<OrderDto, Integer> service;	
	@Autowired
	private UserInterfaceController userFeign;
	
	
	@Override
	@GetMapping("/orders")
	public ResponseEntity<List<OrderDto>> findAll() {		
		return ResponseEntity.ok(service.findAll());
	}
		
	@GetMapping("/users/{id}/orders")
	public ResponseEntity<UserDto> findAllOrderdsByUserId(@PathVariable Integer id) {		
		
		UserDto dto=userFeign.findById(id).getBody();
		
		return ResponseEntity.ok(dto);
	}

	@Override
	@GetMapping("/orders/{id}")
	public ResponseEntity<OrderDto> findById(Integer id) {		
		return ResponseEntity.ok(service.findById(id).get());
	}

	@Override
	@PostMapping("/orders")
	public ResponseEntity<OrderDto> create(OrderDto dto) {	
		service.create(dto);
		return new ResponseEntity<OrderDto>(HttpStatus.CREATED);
	}

	@Override
	@PutMapping("/orders/{id}")
	public ResponseEntity<OrderDto> update(OrderDto dto, Integer id) {
		if(dto.getId()!=id) {
			return new ResponseEntity<OrderDto>(HttpStatus.BAD_REQUEST);
		}
		service.create(dto);
		return new ResponseEntity<OrderDto>(HttpStatus.ACCEPTED);
	}

	@Override
	@DeleteMapping("/orders")
	public ResponseEntity<OrderDto> delete(Integer id) {
		service.delete(id);
		return new ResponseEntity<OrderDto>(HttpStatus.ACCEPTED);
	}	
	
	
	
	
	
	
}
