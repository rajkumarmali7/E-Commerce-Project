package com.ecommerce.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.project.entity.SalesDetails;

public interface SalesDetailsRepository extends JpaRepository<SalesDetails, Integer> {

}
