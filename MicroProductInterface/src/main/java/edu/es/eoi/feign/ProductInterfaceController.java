package edu.es.eoi.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import edu.es.eoi.dto.ProductDto;

public interface ProductInterfaceController {

	@GetMapping("/products")
	public ResponseEntity<List<ProductDto>> findAll();
	
	@GetMapping("/products/{id}")
	public ResponseEntity<ProductDto> findById(Integer id);

	@PostMapping("/products")
	public ResponseEntity<ProductDto> create(ProductDto dto);
	
	@PutMapping("/products/{id}")
	public ResponseEntity<ProductDto> update(ProductDto dto, Integer id);

	@DeleteMapping("/products")
	public ResponseEntity<ProductDto> delete(Integer id) ;
	
	@FeignClient("micro-product")
	interface Feign extends ProductInterfaceController {
	}
	
}
