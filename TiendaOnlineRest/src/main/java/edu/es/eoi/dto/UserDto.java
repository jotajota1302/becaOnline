package edu.es.eoi.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {
	
	private Integer id;
	
	private String username;

	private String password;
		
	private String role;
		
	List<OrderDto> orders;

}
