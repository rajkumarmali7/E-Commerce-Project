package com.ecommerce.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ecommerce.project.entity.ProductColor;

public interface ProductColorRepository extends JpaRepository<ProductColor, Integer> {

	
}
