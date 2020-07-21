package edu.es.eoi.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import edu.es.eoi.dto.OrderDto;

public interface OrderInterfaceController {

	@GetMapping("/orders")
	public ResponseEntity<List<OrderDto>> findAll();
	
	@GetMapping("/orders/{id}")
	public ResponseEntity<OrderDto> findById(Integer id);

	@PostMapping("/orders")
	public ResponseEntity<OrderDto> create(OrderDto dto);
	
	@PutMapping("/orders/{id}")
	public ResponseEntity<OrderDto> update(OrderDto dto, Integer id);

	@DeleteMapping("/orders")
	public ResponseEntity<OrderDto> delete(Integer id) ;
	
	@FeignClient("micro-order")
	interface Feign extends OrderInterfaceController {
	}
	
}
