package edu.es.eoi.user.dto;

import java.sql.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import edu.es.eoi.user.entity.Cuenta;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClienteDto {

	private String dni;
	
	private String nombre;	
	
	private Date fechaAlta;	
	
	@JsonIgnore
	private List<Cuenta> cuentas;	

}
