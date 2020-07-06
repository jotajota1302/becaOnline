package com.es.eoi.repositories;

import org.springframework.stereotype.Repository;


public class AlumnoRepositoryXml implements AlumnoRepository{

	@Override
	public String findName(int id) {
		
		return "JJ from XML";
	}
	

}
