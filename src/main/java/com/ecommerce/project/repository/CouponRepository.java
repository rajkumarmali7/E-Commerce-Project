package com.ecommerce.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.project.entity.Coupon;

public interface CouponRepository extends JpaRepository<Coupon, Integer>{

}
