package edu.es.eoi;

public class Mensaje {

	private Contacto origen;
	private Contacto destino;
	private String mensaje;
	private boolean leido;
	
	public Mensaje(Contacto origen, Contacto destino, String mensaje) {
		super();
		this.origen = origen;
		this.destino = destino;
		this.mensaje = mensaje;
	}
	public Contacto getOrigen() {
		return origen;
	}
	public void setOrigen(Contacto origen) {
		this.origen = origen;
	}
	public Contacto getDestino() {
		return destino;
	}
	public void setDestino(Contacto destino) {
		this.destino = destino;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}	
	public boolean isLeido() {
		return leido;
	}
	public void setLeido(boolean leido) {
		this.leido = leido;
	}
	@Override
	public String toString() {
		return "Mensaje de: " + origen.getNombre() + " para: "+ destino.getNombre() + ": "+ mensaje;
	}
	
	
}
