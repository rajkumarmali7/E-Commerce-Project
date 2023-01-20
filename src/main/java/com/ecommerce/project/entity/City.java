package com.ecommerce.project.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="city")
public class City {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ciryid;
	private String cityname;
	
	@Transient
	private int countryid;
	
	@OneToOne(targetEntity = Country.class, fetch = FetchType.EAGER)
	@JoinColumn(nullable = false,name = "country_id")
	private Country country;

	public int getCiryid() {
		return ciryid;
	}

	public void setCiryid(int ciryid) {
		this.ciryid = ciryid;
	}

	public String getCityname() {
		return cityname;
	}

	public void setCityname(String cityname) {
		this.cityname = cityname;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public int getCountryid() {
		return countryid;
	}

	public void setCountryid(int countryid) {
		this.countryid = countryid;
	}



}
