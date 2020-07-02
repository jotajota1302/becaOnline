package edu.es.eoi.util;

import java.util.Calendar;

import edu.es.eoi.entity.Persona;

public class Utils {
	
	public static String getIdentificadorPedido(Persona persona) {
		
		String day=String.valueOf(Calendar.getInstance().get(Calendar.DAY_OF_MONTH));	
		String year=String.valueOf(Calendar.getInstance().get(Calendar.YEAR));
		String month=String.valueOf(Calendar.getInstance().get(Calendar.MONTH));		
		
		return persona.getUsername().concat("-").concat(day).concat(month).concat(year);
	}

}
