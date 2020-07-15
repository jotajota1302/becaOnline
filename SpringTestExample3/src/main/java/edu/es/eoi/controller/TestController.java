package edu.es.eoi.controller;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import edu.es.eoi.entity.User;

@RestController
public class TestController {
	
	final HttpHeaders headers = new HttpHeaders();
	RestTemplate restTemplate= new RestTemplate();
	final String userRestUrl="http://localhost:8081/users/";
	final String bancoRestUrl="http://localhost:8082/bancos/";


	
	@GetMapping("user/{id}")	
	public ResponseEntity<User> findUserById(@PathVariable Integer id) {		
		
		  ResponseEntity<User> dto = restTemplate.exchange(userRestUrl+id,HttpMethod.GET, new HttpEntity<>(headers), User.class);		
		 
		  User userDto=dto.getBody();
		  System.out.println(userDto);
		  
		  return dto;
	}	
	
	@GetMapping("banco/{id}")	
	public ResponseEntity findBancoById(@PathVariable Integer id) {
		return restTemplate.exchange(bancoRestUrl+id,
				HttpMethod.GET, new HttpEntity<>(headers), String.class);	
	}	

	
}