package com.smart.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smart.course.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {
	
	

}
