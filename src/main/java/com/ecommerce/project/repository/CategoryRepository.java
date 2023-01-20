package com.ecommerce.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.ecommerce.project.entity.Category;

@EnableJpaRepositories
public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
