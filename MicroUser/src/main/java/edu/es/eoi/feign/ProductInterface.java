package edu.es.eoi.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import edu.es.eoi.entity.Product;

@FeignClient("micro-product")
public interface ProductInterface {

	@GetMapping("/products")
	public ResponseEntity<List<Product>> findAll();
	
}
