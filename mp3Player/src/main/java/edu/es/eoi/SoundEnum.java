package edu.es.eoi;

public enum SoundEnum {
	
	PAJARO(1),GATO(2),GALLO(3),CABALLO(4),PERRO(5);
	
	private int valor;

	private SoundEnum(int valor) {
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	

}
