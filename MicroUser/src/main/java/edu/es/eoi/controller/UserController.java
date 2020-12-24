package edu.es.eoi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import edu.es.eoi.dto.UserDto;
import edu.es.eoi.feign.UserInterfaceController;
import edu.es.eoi.service.UserService;

@RestController
public class UserController implements UserInterfaceController {

	@Autowired
	private UserService service;

	@Override
	public ResponseEntity<List<UserDto>> findAll() {
		return ResponseEntity.ok(service.findAll());
	}

	@Override
	public ResponseEntity<UserDto> findById(Integer id) {
		return ResponseEntity.ok(service.findById(id).get());
	}

	@Override
	public ResponseEntity<UserDto> create(UserDto dto) {
		service.create(dto);
		return new ResponseEntity<UserDto>(HttpStatus.CREATED);
	}

	@Override
	public ResponseEntity<UserDto> update(UserDto dto, Integer id) {
		if(!dto.getId().equals(id)) {
			return new ResponseEntity<UserDto>(HttpStatus.BAD_REQUEST);
		}
		service.create(dto);
		return new ResponseEntity<UserDto>(HttpStatus.ACCEPTED);
	}

	@Override
	public ResponseEntity<UserDto> delete(Integer id) {
		service.delete(id);
		return new ResponseEntity<UserDto>(HttpStatus.ACCEPTED);
	}
	
	
	
}
