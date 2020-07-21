package edu.es.eoi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.es.eoi.dto.ProductDto;
import edu.es.eoi.feign.ProductInterfaceController;
import edu.es.eoi.service.ProductService;

@RestController
public class ProductController implements ProductInterfaceController {

	@Autowired
	private ProductService service;
	
	@GetMapping("/products")
	public ResponseEntity<List<ProductDto>> findAll(){		
		return ResponseEntity.ok(service.findAll());
	}

	@Override
	public ResponseEntity<ProductDto> findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<ProductDto> create(ProductDto dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<ProductDto> update(ProductDto dto, Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<ProductDto> delete(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
