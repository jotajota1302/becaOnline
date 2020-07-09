package edu.es.eoi.SpringBootExample;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class UserController {
	
	@GetMapping("users")	
	public List<User> getUsers() throws Exception {
		
		List<User> users=new ArrayList<User>();
		User user1= new User();
		user1.setId(1);
		user1.setName("JJ");
		User user2= new User();
		user2.setId(1);
		user2.setName("PP");
		users.add(user1);
		users.add(user2);
		
		return users;
	}
	
	@GetMapping("users/{id}/products")	
	public String getProductsFromUser(@PathVariable String id) throws Exception {
		return "return all products from user:" +id;
	}
	
	@GetMapping("users/{id}")	
	public ResponseEntity<User> getUser(@PathVariable Integer id) throws Exception {
		User user= new User();
		user.setId(id);
		user.setName("JJ");
		return ResponseEntity.ok(user);
	}
	
	@PostMapping("users")
	public String createUser(@RequestBody String name) {
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
