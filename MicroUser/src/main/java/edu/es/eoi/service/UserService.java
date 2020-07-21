package edu.es.eoi.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.es.eoi.dto.UserDto;
import edu.es.eoi.entities.repository.UserRepository;
import edu.es.eoi.entity.User;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;	
	@Autowired
	private ModelMapper mapper;
	
	public List<UserDto> findAll(){		
		return repository.findAll().
				stream().
				map(e->mapper.map(e, UserDto.class)).
				collect(Collectors.toList());		
	}

	public Optional<UserDto> findById(Integer id) {			
		return Optional.of(mapper.map(repository.findById(id), UserDto.class));
	}
	
	public void create(UserDto entity) {		
		repository.save(mapper.map(entity, User.class));
	}
	
	public void update(UserDto entity) {		
		repository.save(mapper.map(entity, User.class));
	}
	
	public void delete(Integer id) {		
		repository.deleteById(id);
	}
	
}
