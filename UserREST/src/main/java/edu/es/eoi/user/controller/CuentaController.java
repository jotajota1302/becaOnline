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

import edu.es.eoi.user.dto.CuentaDto;
import edu.es.eoi.user.service.CuentaService;

@RestController
public class CuentaController {

	@Autowired
	CuentaService service;

	@GetMapping("cuentas/{id}")
	public ResponseEntity<CuentaDto> findCuentaByIdUsuario(@PathVariable Integer id) {
		return ResponseEntity.ok(service.findCuentaById(id));
	}

	@GetMapping("cuentas")
	public ResponseEntity<List<CuentaDto>> findAll() {
		return ResponseEntity.ok(service.findAll());
	}

	@PostMapping("cuentas")
	public ResponseEntity<String> createCuenta(@RequestBody CuentaDto Cuenta) {
		service.createCuenta(Cuenta);
		return new ResponseEntity<String>(HttpStatus.CREATED);
	}

	@PutMapping("cuentas/{id}")
	public ResponseEntity<String> updateCuenta(@PathVariable Integer id, @RequestBody CuentaDto Cuenta) {
		service.updateCuenta(Cuenta);
		return new ResponseEntity<String>(HttpStatus.ACCEPTED);

	}

	@DeleteMapping("cuentas/{id}")
	public ResponseEntity<String> deleteByIdUsuario(@PathVariable Integer id) {
		service.deleteById(id);
		return new ResponseEntity<String>(HttpStatus.ACCEPTED);
	}

}
