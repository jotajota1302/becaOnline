package edu.es.eoi.beca.examples;

import java.lang.reflect.Field;

public class AnnotationExamples {

	public static void main(String[] args) {
		
		
		MyClassWithAnnotation ejemplo= new MyClassWithAnnotation();		
		
		 Field[] fields= ejemplo.getClass().getDeclaredFields();
		 for(Field field: fields) {
		 
		 MYAnnotation annotation=field.getAnnotation(MYAnnotation.class);
		 System.out.println("Nombre :" +annotation.campo());
		 System.out.println("Tipo :"+ annotation.tipo());
		 
		 }
		
	}

}
