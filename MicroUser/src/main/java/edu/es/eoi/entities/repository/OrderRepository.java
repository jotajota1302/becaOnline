package edu.es.eoi.entities.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.es.eoi.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

}
