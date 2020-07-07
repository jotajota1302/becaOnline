package edu.es.eoi.whatsapp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
public class Message {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idMessage;
	
	@ManyToOne
	private User origin;
	
	@ManyToOne
	private User destiny;
	
	@Column
	private String content;
	
	@Column
	private String date;
}
