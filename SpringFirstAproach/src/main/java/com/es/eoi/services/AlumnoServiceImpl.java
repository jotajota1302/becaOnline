package com.es.eoi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.es.eoi.repositories.AlumnoRepository;

@Service
public class AlumnoServiceImpl implements AlumnoService {
	
	@Autowired
	@Qualifier("JDBC")
	AlumnoRepository repository;

	@Override
	public String findName(int id) {
		
		//logica de la muerte
		return this.repository.findName(id);
	}

}
