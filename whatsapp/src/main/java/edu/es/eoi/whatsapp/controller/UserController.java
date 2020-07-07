package edu.es.eoi.whatsapp.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import edu.es.eoi.whatsapp.entities.User;
import edu.es.eoi.whatsapp.services.UserService;

@Controller
public class UserController {

	@Autowired
	UserService service;
		
	public User read(String ref) throws Exception {
		return service.read(ref);			}

	public void save(User e) throws Exception {		
		service.save(e);
	}	
	

}