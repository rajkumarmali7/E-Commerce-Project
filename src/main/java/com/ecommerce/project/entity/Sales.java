package com.ecommerce.project.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="sales")
public class Sales {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int salesid;
	private int usersid;
	private int shippingid;
	private float coupon_discount;
	private String fullname;
	private String contact;
	private String address;
	private String postcode;
	private Date date;
	private String payment;
	private String transactionid;
	
	@Transient
	private int usersduplicateid;
	@Transient
	private int shippingduplicateid;
	
	public int getSalesid() {
		return salesid;
	}
	public void setSalesid(int salesid) {
		this.salesid = salesid;
	}
	public int getUsersid() {
		return usersid;
	}
	public void setUsersid(int usersid) {
		this.usersid = usersid;
	}
	public int getShippingid() {
		return shippingid;
	}
	public void setShippingid(int shippingid) {
		this.shippingid = shippingid;
	}
	public float getCoupon_discount() {
		return coupon_discount;
	}
	public void setCoupon_discount(float coupon_discount) {
		this.coupon_discount = coupon_discount;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
	public String getTransactionid() {
		return transactionid;
	}
	public void setTransactionid(String transactionid) {
		this.transactionid = transactionid;
	}
	public int getUsersduplicateid() {
		return usersduplicateid;
	}
	public void setUsersduplicateid(int usersduplicateid) {
		this.usersduplicateid = usersduplicateid;
	}
	public int getShippingduplicateid() {
		return shippingduplicateid;
	}
	public void setShippingduplicateid(int shippingduplicateid) {
		this.shippingduplicateid = shippingduplicateid;
	}
	
}
