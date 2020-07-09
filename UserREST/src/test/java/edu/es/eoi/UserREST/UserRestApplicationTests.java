package edu.es.eoi.UserREST;

import static org.assertj.core.api.Assertions.assertThat;

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

}
