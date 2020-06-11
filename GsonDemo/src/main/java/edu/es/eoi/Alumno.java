package edu.es.eoi;

import java.util.List;

public class Alumno {

	private String nombre;
	private String apellido;
	private int edad;
	List<Calificacion> notas;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public List<Calificacion> getNotas() {
		return notas;
	}
	public void setNotas(List<Calificacion> notas) {
		this.notas = notas;
	}
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", notas=" + notas + "]";
	}
	
	
}
