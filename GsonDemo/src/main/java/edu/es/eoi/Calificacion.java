package edu.es.eoi;

public class Calificacion {
	
	private double nota;
	private Materia materia;
			
	public Calificacion(double nota, Materia materia) {
		super();
		this.nota = nota;
		this.materia = materia;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	public Materia getMateria() {
		return materia;
	}
	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	
}
