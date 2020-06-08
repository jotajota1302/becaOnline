import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PersonalInfo {

	public static void main(String[] args) throws ParseException {
		
		
		Map<String,Contact> personas= new HashMap<String,Contact>();

		Contact p1= new Contact("Jose", "13/02/1983",  "012345678");
		Contact p2= new Contact("Ramon", "01/01/1981", "876543210");
		Contact p3= new Contact("Maria", "18/06/2001", "111111111");
		
		personas.put(p1.getNif(), p1);
		personas.put(p2.getNif(), p2);
		personas.put(p3.getNif(), p3);
		
		
		System.out.println("Introduce NIF : ");
		
		Scanner scanner= new Scanner(System.in);
		String nif=scanner.next();
		
		Contact p= personas.get(nif);
		
		SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/yyyy");
		Date date=formatter.parse(p.getBirthDate());
		
		SimpleDateFormat printer= new SimpleDateFormat("'El' EEEEEEEEEE ,dd 'de' MMMMMMMM 'de' yyyy");
		System.out.println("La fecha de nacimiento es: " + printer.format(date));
		
		//2-controlar las excepciones utilizando los bloques try catch, haciendola robusta antes errores de entrada de datos
		
	
		
		//3-Enum -> Lista de errores posibles fuera un ENUM y en el catch imprimamos el tipo de error que tenemos
		
		//MalFormatoDeFecha
		//NoVieneLaFecha
		//UsuarioNoExistente
		//NifIncorrecto(minimo 8 digitos)
		
	}
	
	
}
