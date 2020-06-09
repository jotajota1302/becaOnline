package edu.es.eoi.beca.examples;

import java.util.List;

public class GenericityExample {

	public static void main(String[] args) {

		// PROBLEMA
		Container contenedor = new Container();
		contenedor.setContent("hola");
		String value =  (String) contenedor.getContent();

		// Error de casting en tiempo de ejecución.
//		Client client=(Client) contenedor.getContent();
		
		GenericContainer<String> contenedorGenerico1 = new GenericContainer<String>();
		contenedorGenerico1.setContenido("hola");
		String valor1 = contenedorGenerico1.getContenido();
			
		GenericContainer<Client> clientes= new GenericContainer<Client>();
		contenedor.setContent(new Client("nif", "name", "surname", "birthdate"));
				
		GenericContainer<Warehouse> contenedorGenerico2 = new GenericContainer<Warehouse>();
		contenedorGenerico2.setContenido(new Warehouse());
		Warehouse valor2 = (Warehouse) contenedor.getContent();					
	}

}
