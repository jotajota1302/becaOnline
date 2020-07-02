package edu.es.eoi.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "pedidos")
@NoArgsConstructor
public class Pedido {
	
	@Id
	private String referencia;	
	@Column
	private Date fecha;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "persona")   
	private Persona persona;
	
}
