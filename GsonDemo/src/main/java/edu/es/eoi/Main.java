package edu.es.eoi;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		Alumno alumno= new Alumno();
		alumno.setNombre("Pepe");
		alumno.setApellido("Perez");
		alumno.setEdad(14);
		
		List<Calificacion> notas= new ArrayList<Calificacion>();
		notas.add(new Calificacion(5, new Materia("Historia")));
		notas.add(new Calificacion(2, new Materia("Matematicas")));
		notas.add(new Calificacion(8, new Materia("Fisica")));
		
		alumno.setNotas(notas);
		
//		Gson gson =new Gson();
		Gson gson =new GsonBuilder().setPrettyPrinting().create();
		String alumnoJson=gson.toJson(alumno);
		
		FileWriter writer= new FileWriter(new File("src/main/resources/alumnos.json"));
		writer.write(alumnoJson);
		writer.close();
		
		FileReader reader=new FileReader(new File("src/main/resources/alumnos.json"));
		Alumno alumnoFromJson=gson.fromJson(reader, Alumno.class);
		
		System.out.println(alumnoFromJson);
		
	}

}
