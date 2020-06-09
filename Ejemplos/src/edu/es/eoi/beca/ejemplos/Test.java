package edu.es.eoi.beca.ejemplos;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class Test {
	
	public static void main(String[] args)  {
		
		List<Coche> coches= new ArrayList<Coche>();
		coches.add(new Coche("fiat"));
		coches.add(new Coche("porsche"));
		coches.add(new Coche("kia"));
		coches.add(new Coche("renault"));
		coches.add(new Coche("opel"));
		coches.add(new Coche("kia"));
		
		//cuantos kia hay
		

		Date fecha= Calendar.getInstance().getTime();

		Date fecha2= new GregorianCalendar().getTime();
		
		Calendar cal= new GregorianCalendar();
		
		cal.get(Calendar.DAY_OF_MONTH);		
		
		//Calificaciones
		
//		Alumno alumno1= new Alumno("Pedro",CalificacionesEnum.BIEN,GenderEnum.MALE);
		Alumno alumno2= new Alumno("Maria",CalificacionesEnum.SOBRESALIENTE,GenderEnum.FEMALE);	
					
//		System.out.println(alumno2.getNombre()+" evaluación :" + alumno2.getCalificacion().getValorMinimo()+"/"+alumno2.getCalificacion().getValorMaximo());
		System.out.println(alumno2.getGenero().name());
		
		Object alumno3=new Alumno("Maria",CalificacionesEnum.SOBRESALIENTE,GenderEnum.FEMALE);	
		
//		System.out.println(alumno3.getCalificacion());
		
//		int numero= Integer.valueOf("6");
		
//		String cadena=(String) alumno3; 
		
		List<Alumno> lista= new ArrayList<Alumno>();
		lista.add(alumno2);

//		if(lista.size()<2) {
//			throw new EoiException();
//		}
		
		Alumno alumno1= new Alumno("Admi",CalificacionesEnum.SOBRESALIENTE,GenderEnum.MALE);
		
		try {
			alumno1.getNombre();
		}catch (EoiException e) {		
			e.printStackTrace();
		}catch (NullPointerException e) {
			System.out.println("revisa el null pointer");
		} finally {
			System.out.println("excepcion gestionada");
		}
		
		
		//App
		
		//Personas (LIST o MAP) con su informacion: 5 personas
		
		//1- Pedirme mis datos (DNI)
		
		//2-Lista o Mapa, localizo a la persona y muestro info
		
		//Para la fecha de nacimiento vamos a mostrarla en formato 
		
		//Simple Date Format para sacar la fecha por pantalla en formato "Lunes , 6 de Marzo de 2015"
				
		//Ampliamos 							
		
		
	}
		

}
