import java.util.ArrayList;
import java.util.List;

public class ListasExample {

	public static void main(String[] args) {
		
		List<Coche> coches= new ArrayList<Coche>();
		
		Coche coche1=new Coche("1");
		Coche coche2=new Coche("2");
		Coche coche3=new Coche("3");
		
		coches.add(coche1);
		coches.add(coche2);
		coches.add(coche2);
		coches.add(coche3);
			
		int i=coches.indexOf(coche2);
		
		Coche coche=coches.get(i);
		
		System.out.println(coche.modelo);
	
		for (Coche cocheTemp : coches) {
			System.out.println(cocheTemp.modelo);
		}

	}

}
