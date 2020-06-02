package edu.es.eoi;

import java.util.Scanner;

import edu.es.eoi.entities.Maquina;
import edu.es.eoi.entities.Producto;

public class Main {

	static Maquina maquina= new Maquina();
	final static Producto KITKAT= new Producto("KitKat", 1.5);
	final static Producto COCACOLA= new Producto("Coca cola", 1.0);
	final static Producto BOCABITS= new Producto("BocaBits", 1.5);
	final static Producto SANDWICH= new Producto("Sandwich", 3.5);
	
	
	public static void main(String[] args) {
	
		maquina.rellenar(KITKAT);
		maquina.rellenar(KITKAT);
		maquina.rellenar(COCACOLA);
		maquina.rellenar(COCACOLA);
		maquina.rellenar(COCACOLA);		
		maquina.rellenar(COCACOLA);
		maquina.rellenar(BOCABITS);
		maquina.rellenar(BOCABITS);
		maquina.rellenar(SANDWICH);		
		maquina.rellenar(SANDWICH);
		
		System.out.println("Elige producto: ");
		Scanner scanner= new Scanner(System.in);
		String producto=scanner.next();
	
		maquina.vender(getProductByName(producto));
		
		maquina.contarGanancias();

		main(null);
	}
	
	private static Producto getProductByName(String name) {
				
		 if(name.equalsIgnoreCase(KITKAT.getNombre())) {
			 return KITKAT;
		 }else if(name.equalsIgnoreCase(COCACOLA.getNombre())) {
			 return COCACOLA;			 
		 }else if(name.equalsIgnoreCase(BOCABITS.getNombre())) {
			 return BOCABITS;			 
		 }else {
			 return SANDWICH;
		 }
		 
			 
	}

}
