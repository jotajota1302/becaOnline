package edu.es.eoi.whatsapp.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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

	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "origin")   
	private User origin;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "destiny")   
	private User destiny;
	
	@Column
	private String content;
	
	@Column
	private Date date;
	
	@Column
	private Boolean readed;
}
