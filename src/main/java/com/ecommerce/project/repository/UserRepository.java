package com.ecommerce.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.ecommerce.project.entity.User;

@EnableJpaRepositories
public interface UserRepository extends JpaRepository<User, Integer>{

	User findByEmail(String email);
}
