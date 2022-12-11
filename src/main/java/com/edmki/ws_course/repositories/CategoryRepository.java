package com.edmki.ws_course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edmki.ws_course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
 
}
