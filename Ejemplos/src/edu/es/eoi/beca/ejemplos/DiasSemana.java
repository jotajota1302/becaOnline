package edu.es.eoi.beca.ejemplos;

public enum DiasSemana {
	
	Lunes(1),Martes(2),Miercoles(3),Jueves(4),Viernes(5),Sabado(6),Domingo(7);

	private int valor;	
	
	private DiasSemana(int valor) {
		this.valor = valor;
	}


	public int getValor() {
		return valor;
	}

	
}
