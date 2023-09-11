package com.bernardo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bernardo.course.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{

	
}
