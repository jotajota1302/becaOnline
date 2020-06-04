import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenarPersonas {

	public static void main(String[] args) {
		
		
		Person p1= new Person("Ana", 20, 2000);
		Person p2= new Person("Pedro", 30, 1990);
		Person p3= new Person("Javier", 20, 2000);
		Person p4= new Person("Ana", 18, 2000);
		
		List<Person> personas= new ArrayList<Person>();
		personas.add(p1);
		personas.add(p2);
		personas.add(p3);
		personas.add(p4);
		
		List<String> lista= new ArrayList<String>();		
		lista.add("Miguel");
		lista.add("Pedro");
		lista.add("Ana");
		
		Collections.sort(lista);		
		
		Collections.sort(personas);
		
		System.out.println(personas);

	}

}
