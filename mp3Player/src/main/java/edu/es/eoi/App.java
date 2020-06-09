package edu.es.eoi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class App {
	
	public static void main(String[] args) throws FileNotFoundException, JavaLayerException {
			
		Player player;
		
		// de una lista de sonidos, elegir uno y que se reproduzca ( UTILIZAR ENUMERADO para los sonidos )
	
		System.out.println("Adivina el sonido del 1-4:");		
		Scanner scan= new Scanner(System.in);
		int sonido=scan.nextInt();
		
		player= new Player(getFile(sonido));
		
		player.play();
		
		main(null);
		
	}
	
	public static FileInputStream getFile(int sound) throws FileNotFoundException {
		
		switch (sound) {
		case 1:
			return new FileInputStream(new File("C:/git beca online/becaOnline/mp3Player/src/main/resources/pajaro.mp3"));
		case 2:
			return new FileInputStream(new File("C:/git beca online/becaOnline/mp3Player/src/main/resources/gato.mp3"));	
		case 3:
			return new FileInputStream(new File("C:/git beca online/becaOnline/mp3Player/src/main/resources/gallo.mp3"));	
		case 4:
			return new FileInputStream(new File("C:/git beca online/becaOnline/mp3Player/src/main/resources/caballo.mp3"));	
		default:
			break;
		}
		
		return null;
		
	}

}
