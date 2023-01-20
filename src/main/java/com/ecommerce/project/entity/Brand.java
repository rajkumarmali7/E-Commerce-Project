package com.ecommerce.project.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="brand")
public class Brand {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int brandid;
	private String brandname;
//	@OneToOne(fetch = FetchType.LAZY)
//	private Product product;
	
	public int getBrandid() {
		return brandid;
	}
	public void setBrandid(int brandid) {
		this.brandid = brandid;
	}
	public String getBrandname() {
		return brandname;
	}
	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}
	
//	public Product getProduct() {
//		return product;
//	}
//	public void setProduct(Product product) {
//		this.product = product;
//	}
	@Override
	public String toString() {
		return "Brand [brandid=" + brandid + ", brandname=" + brandname + "]";
	}
	
	
}
