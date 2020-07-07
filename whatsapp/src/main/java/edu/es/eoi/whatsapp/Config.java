package edu.es.eoi.whatsapp;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackageClasses = Config.class)
@PropertySource("classpath:application.properties")
public class Config {
	
}
