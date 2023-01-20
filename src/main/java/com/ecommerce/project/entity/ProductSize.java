package com.ecommerce.project.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="productsize")
public class ProductSize {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int productsizeid;
	private int productid;
	private int sizeid;
	@Transient
	private int Sizeduplicateid;
	@Transient
	private int productduplicateid;
	
	public int getProductsizeid() {
		return productsizeid;
	}
	public void setProductsizeid(int productsizeid) {
		this.productsizeid = productsizeid;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public int getSizeid() {
		return sizeid;
	}
	public void setSizeid(int sizeid) {
		this.sizeid = sizeid;
	}
	public int getSizeduplicateid() {
		return Sizeduplicateid;
	}
	public void setSizeduplicateid(int sizeduplicateid) {
		Sizeduplicateid = sizeduplicateid;
	}
	public int getProductduplicateid() {
		return productduplicateid;
	}
	public void setProductduplicateid(int productduplicateid) {
		this.productduplicateid = productduplicateid;
	}

}
