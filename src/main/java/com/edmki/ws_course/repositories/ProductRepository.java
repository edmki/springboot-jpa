package com.edmki.ws_course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edmki.ws_course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
 
}
