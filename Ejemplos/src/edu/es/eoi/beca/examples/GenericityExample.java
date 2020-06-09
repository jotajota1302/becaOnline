package edu.es.eoi.beca.examples;

public class GenericityExample {

	public static void main(String[] args) {

		// PROBLEMA
		Container contenedor = new Container();
		contenedor.setContent("hola");
		String value = (String) contenedor.getContent();

		// Error de casting en tiempo de ejecuci�n.
//		Deposito deposito=(Deposito) contenedor.getContenido();

		GenericContainer<String> contenedorGenerico1 = new GenericContainer<String>();
		contenedorGenerico1.setContenido("hola");
		String valor1 = (String) contenedorGenerico1.getContenido();

		GenericContainer<Warehouse> contenedorGenerico2 = new GenericContainer<Warehouse>();
		contenedorGenerico2.setContenido(new Warehouse());
		Warehouse valor2 = (Warehouse) contenedor.getContent();

	}

}
