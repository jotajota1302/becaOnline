package edu.es.eoi.whatsapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import edu.es.eoi.whatsapp.entities.User;

@Configuration
@ComponentScan(basePackageClasses = Config.class)
@PropertySource("classpath:application.properties")
public class Config {
	
	@Bean
	public User me() {
		return new User("87654321", "JJ");
	}
	
}
