package edu.es.eoi.beca.ejemplos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Supermercado {

	public static void main(String[] args) {
		
		List<Producto> productos= new ArrayList<Producto>();
				
		for (int i = 1; i < 9; i++) {
			Producto p=new Producto("producto"+i,Double.valueOf(Math.random()*10).intValue(), Math.round(Math.random()*10));
			productos.add(p);			
		}
		
		System.out.println("**********Cantidad****Precio*****Total");
		
		double total=0;
		
		for (Producto producto : productos) {
			System.out.println(producto.getNombre()+"   "+ producto.getCantidad()+"u          "+producto.getPrecio()+ "€     "
					+producto.getCantidad()*producto.getPrecio()+"€");
			total=total+producto.getCantidad()*producto.getPrecio();
		}
		
		System.out.println("Total compra: " + total );
		
		Collections.sort(productos);
		
		System.out.println();
	}	

	
}
