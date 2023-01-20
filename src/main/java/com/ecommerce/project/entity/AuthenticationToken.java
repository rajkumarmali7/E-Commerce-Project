package com.ecommerce.project.entity;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Entity
@Data
@Getter
@Setter
@Table(name="tokens")
public class AuthenticationToken {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="id")
	private int id;
	private String token;
	
	@Column(name = "create_date")
	private Date createDate;
	
	@OneToOne(targetEntity = User.class, fetch = FetchType.EAGER)
	@JoinColumn(nullable = false,name = "user_id")
	private User user;

	public AuthenticationToken(User user) {
		super();
		this.user = user;
		this.createDate = new Date();
		this.token = UUID.randomUUID().toString();
	}

	public AuthenticationToken() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
