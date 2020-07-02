package edu.es.eoi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "personas")
@NoArgsConstructor
public class Persona {
	
	@Id	
	private String nif;
	@Column
	private String username;
	@Column
	private String password;
	@OneToOne(mappedBy = "persona")
	private Pedido pedido;
}
