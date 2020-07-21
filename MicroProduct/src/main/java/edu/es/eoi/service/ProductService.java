package edu.es.eoi.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.es.eoi.dto.ProductDto;
import edu.es.eoi.entities.repository.ProductRepository;
import edu.es.eoi.entity.Product;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;	
	@Autowired
	private ModelMapper mapper;
	
	public List<ProductDto> findAll(){		
		return repository.findAll().
				stream().
				map(e->mapper.map(e, ProductDto.class)).
				collect(Collectors.toList());		
	}

	public Optional<ProductDto> findById(Integer id) {			
		return Optional.of(mapper.map(repository.findById(id), ProductDto.class));
	}
	
	public void create(ProductDto entity) {		
		repository.save(mapper.map(entity, Product.class));
	}
	
	public void update(ProductDto entity) {		
		repository.save(mapper.map(entity, Product.class));
	}
	
	public void delete(Integer id) {		
		repository.deleteById(id);
	}
	
}
