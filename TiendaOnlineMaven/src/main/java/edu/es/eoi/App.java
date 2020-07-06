package edu.es.eoi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import edu.es.eoi.view.MenuPrincipalView;

public class App {
	
	static MenuPrincipalView menuPrincipalView;
	
	public static void main(String[] args) throws Exception {		
			inicializarApp();			
			start();		
	}
	
	public static void start() throws Exception {		
		menuPrincipalView.imprimirMenu();		
		start();		
	}
	
	public static void inicializarApp() {				
		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);	
		menuPrincipalView=context.getBean(MenuPrincipalView.class);
	}
	
}
