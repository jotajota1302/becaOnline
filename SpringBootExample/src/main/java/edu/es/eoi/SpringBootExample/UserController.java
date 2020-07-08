package edu.es.eoi.SpringBootExample;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class UserController {
	
	@GetMapping("users")	
	public String getUsers() throws Exception {
		return "return all users ";
	}
	
	@GetMapping("users/{id}/products")	
	public String getProductsFromUser(@PathVariable String id) throws Exception {
		return "return all products from user:" +id;
	}
	
	@GetMapping("users/{id}")	
	public String getUser(@PathVariable String id) throws Exception {
		return "return only with id: " + id;
	}
	
	@PostMapping("users")
	public String createUser(@RequestParam String name) {
		return "He creado un nuevo usuario : " + name;
	}
	
	@PutMapping("users/{id}")
	public String updateUser(@RequestParam String name,@PathVariable String id) {
		return "He updateado el usuario: " + name +", con id:" + id;
	}
	
	@DeleteMapping("users/{id}")
	public String deleteUser(@PathVariable String id) {
		return "He borrado el usuario con id:" + id;
	}
	
}
