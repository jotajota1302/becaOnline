package edu.es.eoi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import edu.es.eoi.entities.repository.ProductRepository;
import edu.es.eoi.entity.ElectronicProduct;
import edu.es.eoi.entity.Product;



@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = SpringBootApp.class)
public class ProductRepositoryTest {
	
	@Autowired
	public ProductRepository repository;
	
	@Test
	public void testCreateProduct() {
		
		Product p= new Product();
		p.setName("Zapatilla");
		p.setPrize(50);
		
		ElectronicProduct e=new ElectronicProduct();
		e.setName("Television");
		e.setProperty("Tipo A");
		
//		repository.save(p);
//		repository.save(e);
		
		Product p3=repository.findById(1).get();
		Product p4=repository.findById(2).get();		
	
		System.out.println(p3.getName()+p4.getName());
		
	}

	
}