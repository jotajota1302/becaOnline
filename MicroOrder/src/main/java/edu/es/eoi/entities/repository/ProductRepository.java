package edu.es.eoi.entities.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.es.eoi.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
