package com.edmki.ws_course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edmki.ws_course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
