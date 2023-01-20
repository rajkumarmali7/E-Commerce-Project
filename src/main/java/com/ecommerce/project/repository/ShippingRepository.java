package com.ecommerce.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.project.entity.Shipping;

public interface ShippingRepository extends JpaRepository<Shipping, Integer>{

}
