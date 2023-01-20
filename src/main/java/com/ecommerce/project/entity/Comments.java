package com.ecommerce.project.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="comments")
public class Comments {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int commentsid;
	private String discription;	
	@Transient
	private int userrid;


	@ManyToOne
	private User user;
	@Transient
	private int prodid;

	@ManyToOne
	private Product product;
	private int rating;
	private Date createDate ;
	public int getCommentsid() {
		return commentsid;
	}
	public void setCommentsid(int commentsid) {
		this.commentsid = commentsid;
	}
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	public int getUserrid() {
		return userrid;
	}
	public void setUserrid(int userrid) {
		this.userrid = userrid;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public int getProdid() {
		return prodid;
	}
	public void setProdid(int prodid) {
		this.prodid = prodid;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Comments(int commentsid, String discription, int userrid, User user, int prodid, Product product, int rating,
			Date createDate) {
		super();
		this.commentsid = commentsid;
		this.discription = discription;
		this.userrid = userrid;
		this.user = user;
		this.prodid = prodid;
		this.product = product;
		this.rating = rating;
		this.createDate = createDate;
	}
	
	
	
	
}
