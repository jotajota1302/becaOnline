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

		int numeroVidas=5; 
		
		List<String> palabras = new ArrayList<String>();

		FileReader reader = new FileReader(new File("src/main/resources/palabras.txt"));
		BufferedReader br = new BufferedReader(reader);
		String palabra;
		while ((palabra = br.readLine()) != null) {
			palabras.add(palabra);
		}

		int numPalabra = ThreadLocalRandom.current().nextInt(0, palabras.size());
		String solucion=palabras.get(numPalabra);
		
		System.out.println("La palabra tiene " + solucion.length() +" letras");
			
		char[] letras = solucion.toCharArray();
				
		while (numeroVidas>0) {					
		
			System.out.println("Introduce letra: ");
			Scanner scanner= new Scanner(System.in);
			char letra=scanner.next().toCharArray()[0];
			
			char[] salida=solucion.toCharArray();
			
			for (int i = 0; i < letras.length; i++) {
				if(letras[i]!=letra) {
					salida[i]='_';
				}
			}
			
			if(String.valueOf(salida).equalsIgnoreCase(solucion)) {
				System.out.println("has ganado");
			}else {
				System.out.println("Te quedan " + numeroVidas +" intentos");
				numeroVidas--;
			}		
			
			System.out.println("Palabra: " + String.copyValueOf(salida));
		}
		
		
		
	}

}
