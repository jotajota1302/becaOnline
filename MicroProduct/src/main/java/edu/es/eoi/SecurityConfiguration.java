package edu.es.eoi;

import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

@EnableResourceServer
@EnableOAuth2Client
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfiguration extends ResourceServerConfigurerAdapter {

	private static final String[] AUTH_WHITELIST = {
        
            "/v2/api-docs",
            "/swagger-resources",
            "/swagger-resources/**",
            "/configuration/ui",
            "/configuration/security",
            "/swagger-ui.html",
            "/webjars/**",         
            "/console/**",
            "/actuator/**"
    };

	
    @Override
    public void configure(HttpSecurity http) throws Exception {

    	http.       
        authorizeRequests().   
        antMatchers(AUTH_WHITELIST).permitAll().  
        antMatchers("/**").authenticated();  // require authentication for any endpoint that's not whitelisted

    	//only for dev purposes
    	http.csrf().disable();
    	http.headers().frameOptions().disable();
    }          
 
}