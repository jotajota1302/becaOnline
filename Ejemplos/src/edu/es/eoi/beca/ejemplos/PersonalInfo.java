package edu.es.eoi.beca.ejemplos;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PersonalInfo {

	public static void main(String[] args) {
		
		
		Map<String,Contact> personas= new HashMap<String,Contact>();

		Contact p1= new Contact("Jose", "13/02/1983",  "012345678");
		Contact p2= new Contact("Ramon", "01/01/1981", "876543210");
		Contact p3= new Contact("Maria", "18/06/2001", "111111111");
		
		personas.put(p1.getNif(), p1);
		personas.put(p2.getNif(), p2);
		personas.put(p3.getNif(), p3);
		
		
		start(personas);
		
	}

	public static void start(Map<String, Contact> personas) {
	
		System.out.println("Introduce NIF : ");
		
		Scanner scanner= new Scanner(System.in);
		String nif=scanner.next();
		
		Contact p= personas.get(nif);
		
		SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/yyyy");
		Date date = null;
		try {
			date = formatter.parse(p.getBirthDate());	
			
		} catch (ParseException e) {			
			System.out.println("Formato de fecha incorrecto: ");
			System.out.println("Introduce fecha correcta: " );
			scanner= new Scanner(System.in);
			String fecha=scanner.next();
			p.setBirthDate(fecha);
			start(personas);
		}			
		
		SimpleDateFormat printer= new SimpleDateFormat("'El' EEEEEEEEEE ,dd 'de' MMMMMMMM 'de' yyyy");
		try {
			System.out.println("La fecha de nacimiento es: " + printer.format(date));
		} catch (Exception e) {
			System.out.println("Revisa el patron:");
			throw e;
		}
		//3-Enum -> Lista de errores posibles fuera un ENUM y en el catch imprimamos el tipo de error que tenemos
		
		//MalFormatoDeFecha
		//NoVieneLaFecha
		//UsuarioNoExistente
		//NifIncorrecto(minimo 8 digitos)
	}
	
	
}
