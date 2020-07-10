package edu.es.eoi.user.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "CLIENTES")
public class Cliente {
	@Id
	@Column(name = "DNI", unique = true)
	private String dni;

	@Column(name = "NOMBRE")
	private String nombre;
	
	@Column(name = "APELLIDOS")
	private String apellidos;
	
	@Column(name = "MAIL")
	private String mail;
	
	@Column(name = "FECHA_ALTA")
	private Date fechaAlta;
	
	@Column(name = "TELEFONO")
	private String telefono;

	@Column(name = "DIRECCION")
	private String direccion;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cliente")
	private List<Cuenta> cuentas;	

}
