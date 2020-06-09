package edu.es.eoi.beca.ejemplos;
import java.util.Date;

public class Contact {

	private String name;
	private String birthDate;
	private String nif;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
	public Contact(String name, String birthDate, String nif) {
		super();
		this.name = name;
		this.birthDate = birthDate;
		this.nif = nif;
	}
	
	

	
	

}
