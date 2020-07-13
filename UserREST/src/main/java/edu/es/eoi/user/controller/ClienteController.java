package edu.es.eoi.user.controller;

import java.util.Calendar;
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

import edu.es.eoi.user.dto.ClienteDto;
import edu.es.eoi.user.dto.CuentaDto;
import edu.es.eoi.user.service.ClienteService;

@RestController
public class ClienteController {

	@Autowired
	ClienteService service;	
		
		
	@GetMapping("clientes/{id}")
	public ResponseEntity<ClienteDto> findClienteByIdUsuario(@PathVariable String id) {
		return ResponseEntity.ok(service.findClienteById(id));
	}
	
	@GetMapping("clientes/{id}/cuentas")
	public ResponseEntity<List<CuentaDto>> findCuentasClienteByIdUsuario(@PathVariable String id) {
		return ResponseEntity.ok(service.findCuentasClienteById(id));
	}

	@GetMapping("clientes")
	public ResponseEntity<List<ClienteDto>> findAll() {
		return ResponseEntity.ok(service.findAll());
	}

	@PostMapping("clientes")
	public ResponseEntity<String> createCliente(@RequestBody ClienteDto cliente) {
		cliente.setFechaAlta(Calendar.getInstance().getTime());
		service.createCliente(cliente);
		return new ResponseEntity<String>(HttpStatus.CREATED);
	}

	@PutMapping("clientes/{id}")
	public ResponseEntity<String> updateCliente(@PathVariable String id, @RequestBody ClienteDto cliente) {
		service.updateCliente(cliente);
		return new ResponseEntity<String>(HttpStatus.ACCEPTED);

	}

	@DeleteMapping("clientes/{id}")
	public ResponseEntity<String> deleteByIdUsuario(@PathVariable String id) {
		service.deleteById(id);
		return new ResponseEntity<String>(HttpStatus.ACCEPTED);
	}
	
	

}
