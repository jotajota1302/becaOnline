package edu.es.eoi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Ahorcado {

	public static void main(String[] args) throws IOException {

		int numeroVidas = 10;
		List<String> palabras = new ArrayList<String>();
		FileReader reader = new FileReader(new File("src/main/resources/palabras.txt"));
		BufferedReader br = new BufferedReader(reader);
		String palabra;
		while ((palabra = br.readLine()) != null) {
			palabras.add(palabra);
		}
		int numPalabra = ThreadLocalRandom.current().nextInt(0, palabras.size());
		String solucion = palabras.get(numPalabra);
		System.out.println("La palabra tiene " + solucion.length() + " letras");
		char[] letras = solucion.toCharArray();
		String utilizadas = "";

		while (numeroVidas > 0) {
			System.out.println("Introduce letra: ");
			Scanner scanner = new Scanner(System.in);
			char letra = scanner.next().toCharArray()[0];
			if (!utilizadas.contains(String.valueOf(letra))) {
				utilizadas = utilizadas.concat(String.valueOf(letra));
			}
			char[] salida = solucion.toCharArray();
			for (int i = 0; i < letras.length; i++) {

				if (!utilizadas.contains(String.valueOf(letras[i]))) {
					if (letras[i] != letra) {
						salida[i] = '_';
					}
				}
			}
			if (String.valueOf(salida).equalsIgnoreCase(solucion)) {			
				break;
			} else {
				System.out.println("Te quedan " + numeroVidas + " intentos");
				System.out.println("Ya has utilizado " + utilizadas);
				numeroVidas--;
			}
			System.out.println("Palabra: " + String.copyValueOf(salida));
		}
		System.out.println("La solucion era: " +solucion);
		br.close();
	}

}
