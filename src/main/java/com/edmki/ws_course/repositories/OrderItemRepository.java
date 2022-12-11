package com.edmki.ws_course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edmki.ws_course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
