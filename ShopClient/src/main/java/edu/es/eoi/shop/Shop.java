package edu.es.eoi.shop;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import edu.es.eoi.dto.ProductDto;
import edu.es.eoi.dto.UserDto;

public class Shop {

	public static void main(String[] args) {
		
		String urlGateway="http://localhost:8080";
		String urlProducts=urlGateway.concat("/micro-product/products");
		String urlUsers=urlGateway.concat("/micro-user/users");		
		
		//Listado productos
		
		RestTemplate restTemplate= new RestTemplate();
		
		ResponseEntity<ProductDto[]> response = restTemplate.getForEntity(urlProducts,ProductDto[].class);		
		
		ProductDto[] product = response.getBody();
		
		System.out.println(product.length);

		ResponseEntity<UserDto[]> users = restTemplate.getForEntity(urlUsers,UserDto[].class);		
		
		System.out.println(users.getBody().length);
	}

}
