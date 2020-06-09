package edu.es.eoi.beca.ejemplos;

public class Alumno {

	private String nombre;	
	private CalificacionesEnum calificacion;
	private GenderEnum genero;

	public String getNombre() throws EoiException {		
		
		if(nombre.equals("Admin")) {
			throw new EoiException();
		}else {
			throw new NullPointerException();
		}	
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;

	}
	public CalificacionesEnum getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(CalificacionesEnum calificacion) {
		this.calificacion = calificacion;
	}

	public GenderEnum getGenero() {
		return genero;
	}

	public void setGenero(GenderEnum genero) {
		this.genero = genero;
	}

	public Alumno(String nombre, CalificacionesEnum calificacion, GenderEnum genero) {
		super();
		this.nombre = nombre;
		this.calificacion = calificacion;
		this.genero = genero;
	}
	
	
	

}
