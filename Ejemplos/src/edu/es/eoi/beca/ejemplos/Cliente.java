package edu.es.eoi.beca.ejemplos;
import java.util.Date;

public class Cliente {
	
	private String name;
	private Date birthDate;	
	
	public Cliente(String name, Date birthDate) {
		super();
		this.name = name;
		this.birthDate = birthDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	@Override
	public String toString() {
		return "Cliente [name=" + name + ", birthDate= year " + birthDate.getYear() +", month: "+  birthDate.getMonth()+ ", day "+birthDate.getDay()+ "]";
	}
	
}
