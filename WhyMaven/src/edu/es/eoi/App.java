package edu.es.eoi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class App {
	
	public static void main(String[] args) throws FileNotFoundException, JavaLayerException {
				
		System.out.println("Welcome " + args[0]);
		
		Player player= new Player(new FileInputStream(new File("C:/git beca online/becaOnline/WhyMaven/src/ficheros/file.mp3")));
		
		player.play();
		
	}

}
