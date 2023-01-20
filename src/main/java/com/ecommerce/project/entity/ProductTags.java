package com.ecommerce.project.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="producttags")
public class ProductTags {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int producttagsid;
	private int productid;
	private int tagsid;
	@Transient
	private int productduplicateid;
	@Transient
	private int tagesduplicateid;
	
	public int getProducttagsid() {
		return producttagsid;
	}
	public void setProducttagsid(int producttagsid) {
		this.producttagsid = producttagsid;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public int getTagsid() {
		return tagsid;
	}
	public void setTagsid(int tagsid) {
		this.tagsid = tagsid;
	}
	public int getProductduplicateid() {
		return productduplicateid;
	}
	public void setProductduplicateid(int productduplicateid) {
		this.productduplicateid = productduplicateid;
	}
	public int getTagesduplicateid() {
		return tagesduplicateid;
	}
	public void setTagesduplicateid(int tagesduplicateid) {
		this.tagesduplicateid = tagesduplicateid;
	}

}
