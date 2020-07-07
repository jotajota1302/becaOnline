package com.es.eoi;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.es.eoi.controller.AlumnoController;
import com.es.eoi.entities.Dog;
import com.es.eoi.entities.Domain;

public class Main {

	private static Logger logger = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) throws IOException {		
		
		logger.info("Init app");
		
		//tengo que instanciar un contexto de spring
		
		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);		

		//load properties old way
		Properties prop= new Properties();
		
		InputStream input = new FileInputStream("src/main/resources/application.properties");         
		prop.load(input);

		System.out.println(prop.get("exampleproperty"));
		
		Dog dog= context.getBean(Dog.class);
		System.out.println(dog);
		
		Domain domain = context.getBean(Domain.class); 		
		System.out.println(domain.getField());			
			
		AlumnoController controller = context.getBean(AlumnoController.class);
		
//		AlumnoService service= context.getBean(AlumnoService.class);
//		
//		AlumnoRepository repository=context.getBean(AlumnoRepository.class);
				
		System.out.println("hola " + controller.findName(1));
//		System.out.println("hola " + service.findName(1));
//		System.out.println("hola " + repository.findName(1));
		
//		Alumno alumno= new Alumno();
//		Dog dog= new Dog();
//		alumno.dog=dog;
		
//		Alumno al=context.getBean(Alumno.class);
//		System.out.println(al.dog.name);
	
	}

}
