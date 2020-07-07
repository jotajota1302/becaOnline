package edu.es.eoi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import edu.es.eoi.entity.Carrito;
import edu.es.eoi.entity.Persona;

@Configuration
@ComponentScan(basePackageClasses = Config.class)
@PropertySource("classpath:application.properties")
public class Config {
	
	@Value("${bbdd.url}")
	private String dbUrl;
	
	@Value("${bbdd.user}")
	private String dbUser;
	
	@Value("${bbdd.password}")
	private String dbPassword;
	
	@Bean
	public Carrito getCarrito() {
		return new Carrito();
	}
	
	@Bean
	public Persona getUser() {
		Persona persona=new Persona();
		persona.setNif("987654321A");
		persona.setUsername("USER");
		persona.setPassword("password");
		
		return persona;
	}
	
	@Bean
	public Connection getConnection() throws SQLException {
		String url = dbUrl;
		String user = dbUser;
		String pass = dbPassword;
		return DriverManager.getConnection(url, user, pass);
	}
}
