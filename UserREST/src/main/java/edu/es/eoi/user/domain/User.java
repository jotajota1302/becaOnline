package edu.es.eoi.user.domain;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
	
	private Integer idUsuario;
	private String nombre;
	private Date fecha;
	private Boolean premium;
	private Double saldo;
}
