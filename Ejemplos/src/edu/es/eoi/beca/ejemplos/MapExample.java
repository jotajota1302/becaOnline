package edu.es.eoi.beca.ejemplos;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		
		Map<String, Person> mapa= new TreeMap<String, Person>();
		
		mapa.put("34673823T", new Person("JOSE", 20, 2000));		
		mapa.put("34654823T", new Person("PEPE", 20, 2000));
	
		for (String clave : mapa.keySet()) {
			System.out.println(mapa.get(clave).getName());
		}
		
		
	}

}
