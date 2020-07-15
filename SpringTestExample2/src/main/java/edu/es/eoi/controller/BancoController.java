package edu.es.eoi.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import edu.es.eoi.entity.Banco;
import edu.es.eoi.service.BancoService;

@RestController
public class BancoController {

	@Autowired
	BancoService service;
	
	@GetMapping("bancos/{id}")	
	public ResponseEntity<Banco> findBancoByIdUsuario(@PathVariable Integer id) {
		return ResponseEntity.ok(service.findBancoById(id));
	}	
	
	@GetMapping("bancos")
	public ResponseEntity<List<Banco>> findAll() {
		return ResponseEntity.ok(service.findAll());
	}	
	
}