package edu.es.eoi.user.controller;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.es.eoi.user.entity.User;
import edu.es.eoi.user.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService service;
	
	@GetMapping("users/{id}")
	@ResponseBody
	public ResponseEntity<User> findUserByIdUsuario(@PathVariable Integer id) {
		return ResponseEntity.ok(service.findUserById(id));
	}
	
	@GetMapping("users")
	public String findAll(@ModelAttribute("model") ModelMap model) {
		model.addAttribute("users",service.findAll());
		return "users_list";
	}

	@PostMapping("users")
	@ResponseBody
	public ResponseEntity<String> createUser(@RequestBody User user) {
		user.setFecha(Calendar.getInstance().getTime());
		service.createUser(user);
		return new ResponseEntity<String>(HttpStatus.CREATED);
	}

	@PutMapping("users/{id}")
	@ResponseBody
	public ResponseEntity<String> updateUser(@PathVariable Integer id, @RequestBody User user) {

		if (user.getSaldo() == null) {
			return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
		}

		if (!id.equals(user.getId())) {
			return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
		} else {
			service.updateUser(user);
			return new ResponseEntity<String>(HttpStatus.ACCEPTED);
		}
	}

	@DeleteMapping("users/{id}")
	@ResponseBody
	public ResponseEntity<String> deleteByIdUsuario(@PathVariable Integer id) {
		service.deleteById(id);
		return new ResponseEntity<String>(HttpStatus.ACCEPTED);
	}

}
