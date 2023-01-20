package com.ecommerce.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.project.entity.Brand;

public interface BrandRepository extends JpaRepository<Brand, Integer>{

}
