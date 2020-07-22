package edu.es.eoi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;

import com.google.common.base.Predicates;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiKey;
import springfox.documentation.service.AuthorizationScope;
import springfox.documentation.service.SecurityReference;
import springfox.documentation.service.SecurityScheme;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.ApiKeyVehicle;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api() {
    	
    	 return new Docket(DocumentationType.SWAGGER_2)  
    		  .securityContexts(configureSecurityContext())
              .securitySchemes(configureSecurityScheme())
   	          .select()                                  
   	          .apis(RequestHandlerSelectors.basePackage("edu.es.eoi"))              
   	          .paths(PathSelectors.any())
   	          .build();         	 
    }
    
	
    /**
     * Configures the security context.
     *
     * @return the security context' list
     */
    private List<SecurityContext> configureSecurityContext() {
        final AuthorizationScope[] scopes =
                new AuthorizationScope[]{new AuthorizationScope(AuthorizationConstants.BEARER_TOKEN_TYPE, AuthorizationConstants.BEARER_TOKEN_TYPE)};

        final SecurityReference[] securityReferences =
                new SecurityReference[]{SecurityReference.builder().reference(AuthorizationConstants.AUTHORIZATION_HEADER).scopes(scopes).build()};

        final SecurityContext securityContext = SecurityContext.builder().forPaths(Predicates.alwaysTrue())
                .securityReferences(Arrays.asList(securityReferences)).build();

        final List<SecurityContext> securityContexts = new ArrayList<>();
        securityContexts.add(securityContext);
        return securityContexts;
    }

    /**
     * Configures the security scheme.
     *
     * @return the security scheme' list
     */
    private List<? extends SecurityScheme> configureSecurityScheme() {
        final List<ApiKey> securitySchemes = new ArrayList<>();
        securitySchemes.add(new ApiKey(AuthorizationConstants.AUTHORIZATION_HEADER, AuthorizationConstants.AUTHORIZATION_HEADER, ApiKeyVehicle.HEADER.getValue()));
        return securitySchemes;
    }
}