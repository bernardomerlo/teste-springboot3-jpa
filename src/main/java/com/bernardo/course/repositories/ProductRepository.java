package com.bernardo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bernardo.course.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{

	
}
