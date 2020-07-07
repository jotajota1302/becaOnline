package com.es.eoi.repositories;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("XML")
public class AlumnoRepositoryXml implements AlumnoRepository{

	@Override
	public String findName(int id) {
		
		return "JJ from XML";
	}
	

}
