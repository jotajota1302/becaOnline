package edu.es.eoi.beca.ejemplos;

public enum CategoriasEnum {

	ELECTRONICA(0,"A"),DEPORTE(1,"B"),ALIMENTACION(2,"C");
	
	private Integer planta;
	private String seccion;
	
	private CategoriasEnum(Integer planta, String seccion) {
		this.planta = planta;
		this.seccion = seccion;
	}

	public Integer getPlanta() {
		return planta;
	}

	public void setPlanta(Integer planta) {
		this.planta = planta;
	}

	public String getSeccion() {
		return seccion;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}

	
	
	
	
	
}
