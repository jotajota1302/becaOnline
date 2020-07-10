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

import edu.es.eoi.user.entity.Cliente;
import edu.es.eoi.user.service.ClienteService;

@RestController
public class ClienteController {

	@Autowired
	ClienteService service;

	@GetMapping("clientes/{id}")
	public ResponseEntity<Cliente> findClienteByIdUsuario(@PathVariable String dni) {
		return ResponseEntity.ok(service.findClienteById(dni));
	}

	@GetMapping("clientes")
	public ResponseEntity<List<Cliente>> findAll() {
		return ResponseEntity.ok(service.findAll());
	}

	@PostMapping("clientes")
	public ResponseEntity<String> createCliente(@RequestBody Cliente Cliente) {
		service.createCliente(Cliente);
		return new ResponseEntity<String>(HttpStatus.CREATED);
	}

	@PutMapping("clientes/{id}")
	public ResponseEntity<String> updateCliente(@PathVariable Integer id, @RequestBody Cliente Cliente) {

		service.updateCliente(Cliente);
		return new ResponseEntity<String>(HttpStatus.ACCEPTED);

	}

	@DeleteMapping("clientes/{id}")
	public ResponseEntity<String> deleteByIdUsuario(@PathVariable String dni) {
		service.deleteById(dni);
		return new ResponseEntity<String>(HttpStatus.ACCEPTED);
	}

}
