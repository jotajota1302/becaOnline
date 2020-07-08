package edu.es.eoi.whatsapp.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "user")
@Getter
@Setter
@NoArgsConstructor
public class User {
	
	@Id
	private String phone;
	@Column
	private String username;
	
	@OneToMany(mappedBy = "origin",fetch = FetchType.LAZY)
	List<Message> sended;
	
	@OneToMany(mappedBy = "destiny",fetch = FetchType.LAZY)
	List<Message> received;

	public User(String phone, String username) {
		super();
		this.phone = phone;
		this.username = username;
	}
	
	
	
}
