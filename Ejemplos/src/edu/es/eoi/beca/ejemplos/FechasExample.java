package edu.es.eoi.beca.ejemplos;
import java.io.ObjectInputStream.GetField;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class FechasExample {

	public static void main(String[] args) throws ParseException {
		
		
		//para contenedor POJO o basicamente recipiente de datos
		
		Date date= new Date();

		Date date1= new Date(2020, 6, 5, 19, 00);
		
		Date date2= new Date(2020, 6, 5, 19, 15);
		
		date1.compareTo(date2);
		
		System.out.println(date1.compareTo(date2));
				
		//			
		
		Calendar calendar1=Calendar.getInstance();		
		System.out.println();
		
		System.out.println(calendar1.get(Calendar.DAY_OF_YEAR));
		System.out.println(calendar1.get(Calendar.DAY_OF_MONTH));
		System.out.println(calendar1.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println(calendar1.get(Calendar.WEEK_OF_YEAR));
		
		Calendar calendar2= new GregorianCalendar(2025, 01, 13);
		System.out.println();
		
		System.out.println(calendar2.get(Calendar.DAY_OF_YEAR));
		System.out.println(calendar2.get(Calendar.DAY_OF_MONTH));
		System.out.println(calendar2.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println(calendar2.get(Calendar.WEEK_OF_YEAR));
		
		calendar1.add(Calendar.MONTH, +1);
		System.out.println(calendar1.get(Calendar.DAY_OF_WEEK));
		
		Calendar calendar= new GregorianCalendar();
		calendar.setTime(new Date(calendar2.getTimeInMillis()-calendar1.getTimeInMillis()));
		
		calendar.set(Calendar.DAY_OF_YEAR, +90);
		
		//Ejercicios
		
		//1-Lista de 10 personas ordenada por fecha de nacimientos (DATE)
		Cliente cliente1= new Cliente("Pedro", new Date(1995, 01, 01));
		Cliente cliente2= new Cliente("Luisa", new Date(1993, 04, 01));
		Cliente cliente3= new Cliente("Miguel", new Date(1998, 01, 01));
		Cliente cliente4= new Cliente("Andres", new Date(1995, 06, 01));
		Cliente cliente5= new Cliente("Maria", new Date(1982, 06, 01));
		Cliente cliente6= new Cliente("Lucas", new Date(1999, 04, 01));
		Cliente cliente7= new Cliente("Ana", new Date(1991, 01, 01));
		Cliente cliente8= new Cliente("Marta", new Date(1992, 01, 01));
		Cliente cliente9= new Cliente("Jose", new Date(1999, 04, 02));
		
		List<Cliente> clientes= new ArrayList<Cliente>();
		clientes.add(cliente1);
		clientes.add(cliente2);
		clientes.add(cliente3);
		clientes.add(cliente4);
		clientes.add(cliente5);
		clientes.add(cliente6);
		clientes.add(cliente7);		
		clientes.add(cliente8);
		clientes.add(cliente9);	
	
//		Collections.sort(clientes);
//		clientes.stream().forEach(System.out::println);
		
		Collections.sort(clientes, new Comparator<Cliente>() {
			  public int compare(Cliente o1, Cliente o2) {			    
			      return o1.getBirthDate().compareTo(o2.getBirthDate());
			  }
			});
	
				
		clientes.stream().forEach(System.out::println);
		
		//2-Metodo que calcule la diferencia entre el nacimiento de dos personas
		
		System.out.println(getDiasDiferencia(cliente1, cliente2));
		
		//3-Utilizando calendar decirle a una personas si su cumpleaños el año que viene cae en fin de semana

		Calendar cal= new GregorianCalendar(2020,cliente1.getBirthDate().getMonth(),cliente1.getBirthDate().getDay());
			
		if(cal.get(Calendar.DAY_OF_WEEK)==5||cal.get(Calendar.DAY_OF_WEEK)==6) {
			System.out.println(" tu proximo cumpleaños cae en finde" + cal.get(Calendar.DAY_OF_WEEK) +","+cal.get(Calendar.MONTH));
		}	
		
		
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy zzzz");
		
//		String fecha= "01/07/2024";
		
//		Date date3=sdf.parse(fecha);
		
		Date date4= new GregorianCalendar(2018, 01, 06).getTime();
		
		System.out.println(sdf.format(date4));
		
		
		
	}
	
	static long getDiasDiferencia(Cliente cliente1, Cliente cliente2) {
				
	return TimeUnit.DAYS.convert(cliente1.getBirthDate().getTime()-cliente2.getBirthDate().getTime(), TimeUnit.MILLISECONDS);
		
	}

}
