package com.ecommerce.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.ecommerce.project.entity.AuthenticationToken;
import com.ecommerce.project.entity.User;

@EnableJpaRepositories
public interface TokenRepository extends JpaRepository<AuthenticationToken, Integer>{

	AuthenticationToken findByUser(User user);

}
