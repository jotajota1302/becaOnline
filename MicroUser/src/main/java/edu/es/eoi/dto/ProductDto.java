package edu.es.eoi.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDto {

	private Integer id;		

	private String reference;

	private String name;
	
	private double prize;
	
	private String description;

	private int stock;	

	private List<OrderDto> orders;
	
}
