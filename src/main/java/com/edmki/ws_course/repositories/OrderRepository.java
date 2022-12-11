package com.edmki.ws_course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edmki.ws_course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
 
}
