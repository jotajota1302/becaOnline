package edu.es.eoi.UserREST;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Calendar;

import org.junit.jupiter.api.Test;

import edu.es.eoi.user.domain.User;
import edu.es.eoi.user.repository.UserRepository;

class UserRestApplicationTests {
		
	@Test
	void testFindUserById() {
		
		UserRepository repo=new UserRepository();
		User user=repo.findById(1);
		assertThat(user.getNombre().contentEquals("JJ"));
		
	}
	
	@Test
	void testCreateUser() {
		
		UserRepository repo=new UserRepository();
		User user=new User();
		user.setFecha(Calendar.getInstance().getTime());
		user.setNombre("prueba");
		user.setSaldo(33.0);
		user.setPremium(false);
		
		repo.create(user);		
		
	}
	
	@Test
	void testUpdateUser() {
		
		UserRepository repo=new UserRepository();
		User user=repo.findById(1);		
		user.setFecha(Calendar.getInstance().getTime());			
		repo.update(user);	
				
	}

}
