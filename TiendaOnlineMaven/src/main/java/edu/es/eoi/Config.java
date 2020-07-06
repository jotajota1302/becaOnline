package edu.es.eoi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import edu.es.eoi.entity.Carrito;
import edu.es.eoi.entity.Persona;

@Configuration
@ComponentScan(basePackageClasses = Config.class)
public class Config {
	
	
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
		String url = "jdbc:mysql://localhost:3306/tienda?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String user = "root";
		String pass = "root";
		return DriverManager.getConnection(url, user, pass);
	}
}
