package edu.es.eoi.user.repository;

import java.util.List;

public interface MyRepository<E>{
	
	public E findById(Integer id);
	
	public void create(E e);
	
	public void update(E e);
	
	public void deleteById(Integer id);
	
	public List<E> findAll();

}
