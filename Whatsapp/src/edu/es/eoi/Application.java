package edu.es.eoi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Application {

	static Map<String, Contacto> agenda = new HashMap<String, Contacto>();
	static List<Mensaje> mensajes = new ArrayList<Mensaje>();
	static Contacto usuario;
	static Scanner scanner;

	public static void main(String[] args) {
		
		initAgenda();
		login();
		startApp();
	}

	private static void login() {
		
		System.out.println("Introduce tu telefono: ");
		scanner = new Scanner(System.in);
		String telefono = scanner.nextLine();
		if (agenda.containsKey(telefono)) {
			usuario = agenda.get(telefono);
		} else {
			System.out.println("Usuario no válido");
			login();
		}
	}

	private static void startApp() {
		
		System.out.println("Elige una opcion: ");
		System.out.println("1-Mandar mensaje: ");
		System.out.println("2-Leer mis mensajes: ");
		System.out.println("3-Ver todos los mensajes no leidos: ");
		System.out.println("4-Cambiar de usuario: ");
		scanner = new Scanner(System.in);
		int opcion = scanner.nextInt();

		switch (opcion) {
		case 1:
			mandarMensaje();
			startApp();
			break;
		case 2:
			leerMensajesContacto(usuario);
			startApp();
			break;
		case 3:
			leerNoLeidos();
			startApp();
			break;
		case 4:
			login();
			startApp();
			break;
		default:
			System.out.println("Opcion incorrecta");
			startApp();
		}
	}

	private static void leerMensajesContacto(Contacto contacto) {

		List<Mensaje> lista = new ArrayList<Mensaje>();

		for (Mensaje mensaje : mensajes) {
			if (mensaje.getDestino().equals(contacto)) {
				lista.add(mensaje);
			}
		}
		if (lista.isEmpty()) {
			System.out.println("No tienes mensajes :-(");
		} else {
			for (Mensaje mensaje : lista) {
				System.out.println(mensaje);
				mensaje.setLeido(true);
			}
		}
	}

	private static void leerNoLeidos() {
		
		for (Mensaje mensaje : mensajes) {
			if (!mensaje.isLeido()) {
				System.out.println(mensaje);
			}
		}
	}

	public static void mandarMensaje() {

		System.out.println("Introduce numero de tlf destino: ");
		scanner = new Scanner(System.in);
		String telefono = scanner.next();
		if (!agenda.containsKey(telefono)) {
			System.out.println("el numero no se encuentra en la agenda");
			main(null);
		} else {
			Contacto destino = agenda.get(telefono);
			System.out.println("Introduce el mensaje: ");
			scanner = new Scanner(System.in);
			String mensaje = scanner.nextLine();

			mensajes.add(new Mensaje(usuario, destino, mensaje));
			System.out.println("Mensaje enviado");
		}
	}

	public static void initAgenda() {
		
		Contacto contact1 = new Contacto("Jose", "Jimenez", "12345678");
		Contacto contact2 = new Contacto("Pedro", "Perez", "87654321");
		Contacto contact3 = new Contacto("Atención al cliente", "", "00000000");
		agenda.put(contact1.getNumeroTelefono(), contact1);
		agenda.put(contact2.getNumeroTelefono(), contact2);
		agenda.put(contact3.getNumeroTelefono(), contact3);
	}
}
