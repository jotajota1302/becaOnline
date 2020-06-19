package edu.es.eoi.beca.ejemplos;
import java.time.Month;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtilsMain {

	public static void main(String[] args) {

		//Ejercicio 1
		
		String cadena1="Esto es una prueba";
		System.out.println(cadena1.toUpperCase());		
		
		//Ejercicio 2
		String cadena2="La clase String, tiene varios métodos, muy útiles, como saber su longitud, trocear la cadena, etc";
		String[] frases = cadena2.split(",");		
		for (int i = 0; i < frases.length; i++) {
			System.out.println(frases[i]);
		}
		
		//Ejercicio 3
		String cadena3="Esto es un ejemplo usado para determinar un indice";
		System.out.println(cadena3.indexOf("ejemplo"));
				
		//Ejercicio 4
			
		System.out.println(getFecha("01/02/2016"));
		
		String texto="Lorem fistrum benemeritaar te voy a borrar el cerito por la gloria de mi madre no te digo trigo por no llamarte Rodrigor condemor de la pradera benemeritaar quietooor mamaar. Caballo blanco caballo negroorl apetecan ahorarr benemeritaar. Jarl ahorarr de la pradera la caidita tiene musho peligro. A gramenawer fistro quietooor diodeno no puedor ese que llega. De la pradera la caidita a peich te va a hasé pupitaa. Fistro papaar papaar benemeritaar ese pedazo de torpedo pecador ese pedazo de. Va usté muy cargadoo ese que llega a peich sexuarl me cago en tus muelas jarl te voy a borrar el cerito jarl.";
		//Ejercicio 5	
	
		Map<String, Integer> letras = getOcurrenciasLetra(texto,Arrays.asList("a","e","i","o","u"));
			
		for (String letra : letras.keySet()) {
			System.out.println("Tengo " + letras.get(letra)+ " " + letra);
		}
		
	}
	
	static String getFecha(String fecha) {
				
		Integer day= Integer.valueOf(fecha.substring(0, fecha.indexOf("/",1)));
		Integer month= Integer.valueOf(fecha.substring(fecha.indexOf("/",1)+1, fecha.lastIndexOf("/")));
		Integer year= Integer.valueOf(fecha.substring(fecha.lastIndexOf("/")+1));
		
		return "Es el " + day +" , de " + Month.of(month) + " del " + year;
	}
	
	static Map<String, Integer> getOcurrenciasLetra(String texto, List<String> letras){
		
		TreeMap< String, Integer> map= new TreeMap<String, Integer>();
		
		for (String letra : letras) {
			int count = cuentaLetras(letra,texto);		  
			map.put(letra, count);
		}			
		return map;
	}

	public static int cuentaLetras( String letra, String texto) {
				
		Pattern pattern = Pattern.compile("[^"+letra+"]*"+letra);
		Matcher matcher = pattern.matcher(texto);
		int count = 0;
		while (matcher.find()) {
		    count++;
		}
		return count;
	}

}
