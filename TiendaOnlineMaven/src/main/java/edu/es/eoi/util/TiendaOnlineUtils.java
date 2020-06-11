package edu.es.eoi.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;

public class TiendaOnlineUtils {
	
	public File getFileFromResources(String fileName) throws FileNotFoundException {
		
        ClassLoader classLoader = getClass().getClassLoader();

        URL resource = classLoader.getResource(fileName);
        if (resource == null) {
            throw new IllegalArgumentException("file is not found!");
        } else {
            return new File(resource.getFile());
        }

    }
	

}
