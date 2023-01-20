package com.ecommerce.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.project.entity.Sales;

public interface SalesRepository extends JpaRepository<Sales, Integer> {

}
