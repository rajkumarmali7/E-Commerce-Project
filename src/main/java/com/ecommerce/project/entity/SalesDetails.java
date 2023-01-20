package com.ecommerce.project.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="salesdetails")
public class SalesDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int saledetailsid;
	private int salesid;
	private int productid;
	private int quantity;
	@Transient
	private int productduplicateid;
	@Transient
	private int salesduplicateid;
	

	public int getProductduplicateid() {
		return productduplicateid;
	}
	public void setProductduplicateid(int productduplicateid) {
		this.productduplicateid = productduplicateid;
	}
	public int getSalesduplicateid() {
		return salesduplicateid;
	}
	public void setSalesduplicateid(int salesduplicateid) {
		this.salesduplicateid = salesduplicateid;
	}
	public int getSaledetailsid() {
		return saledetailsid;
	}
	public void setSaledetailsid(int saledetailsid) {
		this.saledetailsid = saledetailsid;
	}
	public int getSalesid() {
		return salesid;
	}
	public void setSalesid(int salesid) {
		this.salesid = salesid;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}
