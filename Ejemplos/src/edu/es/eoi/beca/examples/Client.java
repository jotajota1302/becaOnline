package edu.es.eoi.beca.examples;

public class Client extends Person implements Speakable,Castable {

	private String nif;
	
	private String name;
	
	private String surname;
	
	private String birthdate;

	public Client(String nif, String name, String surname, String birthdate) {
	
		this.nif = nif;
		this.name = name;
		this.surname = surname;
		this.birthdate = birthdate;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	@Override
	public String toString() {
		return "Client [nif=" + nif + ", name=" + name + ", surname=" + surname + ", birthdate=" + birthdate + "]";
	}

	@Override
	public void hablar(String param) {
		// TODO Auto-generated method stub
		Speakable.super.hablar(param);
	}

	
	
	
	
	
}
