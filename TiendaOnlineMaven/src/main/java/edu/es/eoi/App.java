package edu.es.eoi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import edu.es.eoi.view.MenuPrincipalView;

public class App {
	
	private static MenuPrincipalView menuPrincipalView;
	private static Logger logger = LoggerFactory.getLogger(App.class);
	
	public static void main(String[] args) throws Exception {		
			inicializarApp();			
			start();		
	}
	
	public static void start() throws Exception {
		logger.info("Start App");
		menuPrincipalView.imprimirMenu();		
		start();		
	}
	
	public static void inicializarApp() {	
		logger.debug("Init spring context");
		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);	
		logger.debug("Spring context loaded");
		
		menuPrincipalView=context.getBean(MenuPrincipalView.class);
	}
	
}
