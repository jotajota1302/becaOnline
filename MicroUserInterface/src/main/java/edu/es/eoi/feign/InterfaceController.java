package edu.es.eoi.feign;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public interface InterfaceController<Entity,Id> {		
	
	public ResponseEntity<List<Entity>> findAll();
	
	public ResponseEntity<Entity> findById(@PathVariable Id id);

	public ResponseEntity<Entity> create(@RequestBody Entity dto);
	
	public ResponseEntity<Entity> update(@RequestBody Entity dto,@PathVariable Id id);
	
	public ResponseEntity<Entity> delete(@PathVariable Id id);
	
}
