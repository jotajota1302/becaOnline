package edu.es.eoi.dto;

import java.util.Date;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class OrderDto {
	
	
	private Integer id;

	private String reference;	
	
	private Date orderDate;	

    private List<ProductDto> products;	

	private UserDto User;
	
}
