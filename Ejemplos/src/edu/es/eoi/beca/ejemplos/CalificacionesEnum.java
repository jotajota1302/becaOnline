package edu.es.eoi.beca.ejemplos;

public enum CalificacionesEnum {
		
	SOBRESALIENTE(9),
	NOTABLE(7),
	BIEN(6),
	SUFICIENTE(5),
	INSUFICIENTE(3);


	private int valor;

	private CalificacionesEnum(int valor) {
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	


	
}
