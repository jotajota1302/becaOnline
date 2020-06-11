package edu.es.eoi.util;

import java.io.File;
import java.io.FileNotFoundException;

public class TiendaOnlineUtils {
	
	public File getFileFromResources(String fileName) throws FileNotFoundException {
		
		return  new File("src/main/resources/"+fileName);		

    }
	

}
