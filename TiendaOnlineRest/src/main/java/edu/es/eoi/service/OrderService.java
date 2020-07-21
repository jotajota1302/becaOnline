package edu.es.eoi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.es.eoi.entities.repository.OrderRepository;
import edu.es.eoi.entity.Order;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll(){		
		return repository.findAll();
	}
	
	public Optional<Order> findById(Integer id){		
		return repository.findById(id);
	}
	
}
