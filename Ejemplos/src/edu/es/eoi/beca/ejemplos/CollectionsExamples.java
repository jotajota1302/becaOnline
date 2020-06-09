package edu.es.eoi.beca.ejemplos;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsExamples {

	public static void main(String[] args) {
		
		//LIST
		List<Person> personas= new ArrayList<Person>();
		
		for (int i = 0; i < 3000; i++) {
			Person p= new Person("name_"+(i+1), new Long(Math.round(Math.random()*100)).intValue(), 0);
			personas.add(p);
		}
		
		List sublista= personas.subList(0,10);
		
		System.out.println(personas.get(24));
		
		//averiguar la edad del señor name_25
		
		Person p=null;
		
		for (Person person : personas) {
			if(person.getName().equals("name_25")) {
				p=person;
			}
		}
				
		System.out.println(p.getName()+" tiene :" +p.getAge()+ " años");
			
		//SET
		Set<Person> personasSet= new HashSet<Person>();
		personasSet.addAll(personas);
		
		for (Person person : personasSet) {
			if(person.getName().equals("name_25")) {
				p=person;
			}
		}
		
		System.out.println(p.getName()+" tiene :" +p.getAge()+ " años");
	
		//PROBLEMA DE LOS LIST Y SET -> BUSCAR UN ELEMENTO
		
		//MAP Clave(SET() - Valor   ID - Objeto		
		
		Map<String, Person> mapa= new HashMap<String, Person>();
		
		for (int i = 0; i < 3000; i++) {
			p= new Person("name_"+(i+1), new Long(Math.round(Math.random()*100)).intValue(), 0);
			mapa.put(p.getName(), p);
		}
		
		System.out.println(mapa.get("name_25"));
				Set<String> nombres= mapa.keySet();
		Collection<Person> var = mapa.values();
			
		
		
	}
	
	

}
