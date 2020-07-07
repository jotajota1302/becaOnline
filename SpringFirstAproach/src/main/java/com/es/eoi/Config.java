package com.es.eoi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.es.eoi.entities.Dog;
import com.es.eoi.entities.Domain;

import lombok.Getter;

@Configuration
@ComponentScan(basePackageClasses = Config.class)
@PropertySource("classpath:application.properties")
@Getter
public class Config {
	
	@Value("${exampleproperty}")
	private String example;
	
	@Bean
	public Domain getDomain(){	
		return new Domain(example, new Dog());
	}	
	
	
	
	
}
