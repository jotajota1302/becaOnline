package edu.es.eoi.shop;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import edu.es.eoi.dto.ProductDto;

public class Shop {

	public static void main(String[] args) {
		
		//Listado productos
		
		RestTemplate restTemplate= new RestTemplate();
		
		ResponseEntity<ProductDto[]> response =  restTemplate.getForEntity(
				  "http://localhost:8080/micro-product/products",ProductDto[].class);		
		
		ProductDto[] product = response.getBody();

		System.out.println(product);
	}

}
