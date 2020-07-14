package edu.es.eoi.user;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UserRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserRestApplication.class, args);
	}
	
	@Bean
	@Qualifier("REST")
	public EntityManager getEntityManagerRest() {
		return Persistence.createEntityManagerFactory("REST_PERSISTENCE_UNIT").createEntityManager();	
	}	
	
	@Bean
	@Qualifier("BANCO")
	public EntityManager getEntityManagerTienda() {
		return Persistence.createEntityManagerFactory("BANCO_PERSISTENCE_UNIT").createEntityManager();	
	}	
	
	@Bean
	public ModelMapper modelMapper() {
	    return new ModelMapper();
	}
	
}
