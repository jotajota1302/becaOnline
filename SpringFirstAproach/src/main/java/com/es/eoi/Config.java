package com.es.eoi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.es.eoi.entities.Domain;

@Configuration
@ComponentScan(basePackageClasses = Config.class)
public class Config {
	
	@Bean
	public Domain getDomain(){	
		return new Domain("valor");
	}

}
