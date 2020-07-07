package edu.es.eoi.whatsapp.repositories;

public interface MyRepository<E> {

	E read(String ref) throws Exception;

	void save(E e) throws Exception;

	void delete(String ref) throws Exception;


}