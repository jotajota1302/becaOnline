package edu.es.eoi.repository;

import java.util.Map;

public interface MyRepository<E> {

	E read(String ref) throws Exception;

	void save(E e) throws Exception;

	Map<String, E> readAll() throws Exception;

	void delete(String ref) throws Exception;

}