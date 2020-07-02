package edu.es.eoi.entity;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Carrito {
	
	private List<Producto> productos= new ArrayList<Producto>();	

}
