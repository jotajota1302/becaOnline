package edu.es.eoi.user.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "CLIENTES", schema = "BANCO")
public class Cliente {
	@Id
	@Column(name = "DNI", unique = true)
	private String dni;

	@Column(name = "NOMBRE")
	private String nombre;
	
	@Column(name = "FECHA_ALTA")
	private Date fechaAlta;		
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cliente")
	private List<Cuenta> cuentas;	

}
