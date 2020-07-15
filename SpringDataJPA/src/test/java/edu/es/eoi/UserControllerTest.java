package edu.es.eoi;

import org.json.JSONException;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import edu.es.eoi.entity.User;
import edu.es.eoi.repository.UserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ContextConfiguration(classes = SpringDataJpaApplication.class)
public class UserControllerTest {

	public static final String URI = "/users";
	
    @LocalServerPort
    private int port;   
    
    @Autowired
    UserRepository repository;
    
    final HttpHeaders headers = new HttpHeaders();

    final TestRestTemplate restTemplate = new TestRestTemplate();
	
	private User dbEntity;
    
    @Before
	public void fillDatabase() {
		this.dbEntity = this.repository.save(new User());
	}

	@After
	public void clearDatabase() {
		this.repository.deleteAll();
	}
    
    
    @Test
	public void FindEntity_IdAsParam_EntityFound() throws JSONException {
		// Arrange
	
		// Act
		ResponseEntity<String> response = restTemplate.exchange(
				createURLWithPort(URI + "/" + this.dbEntity.getId()),
				HttpMethod.GET, new HttpEntity<>(headers), String.class);
		// Assert	
		Assert.assertEquals(HttpStatus.OK, response.getStatusCode());
		
	}
    
	@Test
	public void CreateEntity_EntityCreated() throws JSONException {
		// Arrange	
		User entity = new User();
		entity.setNombre("JJJJJJ");
		// Act
		ResponseEntity<String> response = restTemplate.postForEntity(
				createURLWithPort(URI), new HttpEntity<>(entity, headers),
				String.class);
		// Assert		
		Assert.assertEquals(HttpStatus.CREATED, response.getStatusCode());
	}
	
	
	 protected String createURLWithPort(String uri) {
	        return "http://localhost:" + port + uri;
	    }

	
}
