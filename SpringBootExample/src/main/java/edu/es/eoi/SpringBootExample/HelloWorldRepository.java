package edu.es.eoi.SpringBootExample;

import org.springframework.stereotype.Repository;

@Repository
public class HelloWorldRepository {
	
	public void sayHelloFromRepository() {
		System.out.println("Helloworld");
	}

}
