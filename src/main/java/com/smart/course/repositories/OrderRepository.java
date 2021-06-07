package com.smart.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smart.course.entities.Order;



public interface OrderRepository extends JpaRepository<Order, Long> {
	
	

}
