package edu.es.eoi.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import edu.es.eoi.dto.UserDto;

public interface UserInterfaceController {

	@GetMapping("/users")
	public ResponseEntity<List<UserDto>> findAll();
	
	@GetMapping("/users/{id}")
	public ResponseEntity<UserDto> findById(Integer id);

	@PostMapping("/users")
	public ResponseEntity<UserDto> create(UserDto dto);
	
	@PutMapping("/users/{id}")
	public ResponseEntity<UserDto> update(UserDto dto, Integer id);

	@DeleteMapping("/users")
	public ResponseEntity<UserDto> delete(Integer id) ;
	
	@FeignClient("micro-user")
	interface Feign extends UserInterfaceController {
	}
	
}
