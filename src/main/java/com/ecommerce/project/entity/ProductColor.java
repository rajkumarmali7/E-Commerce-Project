package com.ecommerce.project.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="productcolor")
public class ProductColor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int productcolorid;
	private int productid;
	private int colorid;
	@Transient
	private int productduplicateid;
	@Transient
	private int colorduplicateid;
	
	
	
	public int getProductduplicateid() {
		return productduplicateid;
	}
	public void setProductduplicateid(int productduplicateid) {
		this.productduplicateid = productduplicateid;
	}
	public int getColorduplicateid() {
		return colorduplicateid;
	}
	public void setColorduplicateid(int colorduplicateid) {
		this.colorduplicateid = colorduplicateid;
	}
	public int getProductcolorid() {
		return productcolorid;
	}
	public void setProductcolorid(int productcolorid) {
		this.productcolorid = productcolorid;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public int getColorid() {
		return colorid;
	}
	public void setColorid(int colorid) {
		this.colorid = colorid;
	}
	
	

}
