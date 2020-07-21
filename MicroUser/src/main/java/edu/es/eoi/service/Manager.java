package edu.es.eoi.service;

import java.util.List;
import java.util.Optional;

public abstract class Manager<DTO,ID> {
	
	public abstract List<DTO> findAll();
	public abstract Optional<DTO> findById(ID id);
	public abstract void create(DTO entity);	
	public abstract void update(DTO entity);	
	public abstract void delete(ID id);	
	
}
