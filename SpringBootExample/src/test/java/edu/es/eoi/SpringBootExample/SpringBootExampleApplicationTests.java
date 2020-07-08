package edu.es.eoi.SpringBootExample;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootExampleApplicationTests {

	@Autowired
	HelloWorldService service;	
	
	@Test
	void test() {
		service.sayHello();
	}

}
