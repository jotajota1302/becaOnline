import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class FechasExample {

	public static void main(String[] args) {
		
		
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
		
	}

}
