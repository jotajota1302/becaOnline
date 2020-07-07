package com.es.eoi.repositories;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("JDBC")
public class AlumnoRepositoryImpl implements AlumnoRepository {

		
	@Override
	public String findName(int id) {
		// acceder a base de datos y recuperar el nombre
	
		return "JJ from BBDD";
	}

}
