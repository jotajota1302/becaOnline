package edu.es.eoi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
		return ResponseEntity.ok(service.findById(id).get());
	}

	@Override
	public ResponseEntity<ProductDto> create(ProductDto dto) {
		service.create(dto);
		return new ResponseEntity<ProductDto>(HttpStatus.CREATED);
	}

	@Override
	public ResponseEntity<ProductDto> update(ProductDto dto, Integer id) {
		if(dto.getId()!=id) {
			return new ResponseEntity<ProductDto>(HttpStatus.BAD_REQUEST);
		}
		service.create(dto);
		return new ResponseEntity<ProductDto>(HttpStatus.ACCEPTED);
	}

	@Override
	public ResponseEntity<ProductDto> delete(Integer id) {
		service.delete(id);
		return new ResponseEntity<ProductDto>(HttpStatus.ACCEPTED);
	}
	
}
