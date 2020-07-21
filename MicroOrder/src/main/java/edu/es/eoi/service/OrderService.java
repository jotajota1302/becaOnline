package edu.es.eoi.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.es.eoi.dto.OrderDto;
import edu.es.eoi.entities.repository.OrderRepository;
import edu.es.eoi.entity.Order;

@Service
public class OrderService extends Manager<OrderDto, Integer>{

	@Autowired
	private OrderRepository repository;	
	@Autowired
	private ModelMapper mapper;
	
	public List<OrderDto> findAll(){		
		return repository.findAll().
				stream().
				map(e->mapper.map(e, OrderDto.class)).
				collect(Collectors.toList());		
	}

	public Optional<OrderDto> findById(Integer id) {			
		return Optional.of(mapper.map(repository.findById(id), OrderDto.class));
	}
	
	public void create(OrderDto entity) {		
		repository.save(mapper.map(entity, Order.class));
	}
	
	public void update(OrderDto entity) {		
		repository.save(mapper.map(entity, Order.class));
	}
	
	public void delete(Integer id) {		
		repository.deleteById(id);
	}
	
}
