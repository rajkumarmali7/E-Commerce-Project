package com.ecommerce.project.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="shipping")
public class Shipping {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int shippingid;
	private String  shippingname;
	private int cityid;
	private float amount;
	@Transient
	private int cityduplicateid;
	
	
	public int getCityduplicateid() {
		return cityduplicateid;
	}
	public void setCityduplicateid(int cityduplicateid) {
		this.cityduplicateid = cityduplicateid;
	}
	public int getShippingid() {
		return shippingid;
	}
	public void setShippingid(int shippingid) {
		this.shippingid = shippingid;
	}
	public String getShippingname() {
		return shippingname;
	}
	public void setShippingname(String shippingname) {
		this.shippingname = shippingname;
	}
	public int getCityid() {
		return cityid;
	}
	public void setCityid(int cityid) {
		this.cityid = cityid;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	
	

}
