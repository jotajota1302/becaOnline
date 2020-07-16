package edu.es.eoi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ElectronicProduct extends Product {

	@Column
	private String property; 
	
}
