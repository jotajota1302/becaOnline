package edu.es.eoi.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.es.eoi.user.dto.BancoDto;
import edu.es.eoi.user.service.BancoService;

@RestController
public class BancoController {

	@Autowired
	BancoService service;	
	
	@GetMapping("bancos/{id}")
	public ResponseEntity<BancoDto> findBancoByIdUsuario(@PathVariable Integer id) {
		return ResponseEntity.ok(service.findBancoById(id));
	}

	@GetMapping("bancos")
	public ResponseEntity<List<BancoDto>> findAll() {
		return ResponseEntity.ok(service.findAll());
	}

	@PostMapping("bancos")
	public ResponseEntity<String> createBanco(@RequestBody BancoDto banco) {
		service.createBanco(banco);
		return new ResponseEntity<String>(HttpStatus.CREATED);
	}

	@PutMapping("bancos/{id}")
	public ResponseEntity<String> updateBanco(@PathVariable Integer id, @RequestBody BancoDto banco) {
		service.updateBanco(banco);
		return new ResponseEntity<String>(HttpStatus.ACCEPTED);

	}

	@DeleteMapping("bancos/{id}")
	public ResponseEntity<String> deleteByIdUsuario(@PathVariable Integer id) {
		service.deleteById(id);
		return new ResponseEntity<String>(HttpStatus.ACCEPTED);
	}
	
	

}
