package com.smart.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smart.course.entities.Category;



public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	

}
