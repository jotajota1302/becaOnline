package edu.es.eoi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class App {
	
	public static void main(String[] args) throws FileNotFoundException, JavaLayerException {
			
		Player player= new Player(new FileInputStream(new File("C:/git beca online/becaOnline/mp3Player/src/main/resources/file.mp3")));
		
		player.play();
		
	}

}
