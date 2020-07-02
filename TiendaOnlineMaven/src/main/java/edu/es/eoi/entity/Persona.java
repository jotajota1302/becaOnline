package edu.es.eoi.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
	@OneToMany(mappedBy = "persona")
	private List<Pedido> pedidos;
}
