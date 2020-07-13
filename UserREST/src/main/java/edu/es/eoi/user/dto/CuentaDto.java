package edu.es.eoi.user.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CuentaDto {
	
	private double saldo;
	
	private BancoDto banco;
	
	private ClienteDto cliente;
	
}
