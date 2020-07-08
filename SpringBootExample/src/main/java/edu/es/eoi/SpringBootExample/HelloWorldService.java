package edu.es.eoi.SpringBootExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

	@Autowired
	HelloWorldRepository repository;
	
	public void sayHello() {
		repository.sayHelloFromRepository();
	}
	
}
