package com.ecommerce.project.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="color")
public class Color {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int colorid;
	private String colorname;
	
	
	public int getColorid() {
		return colorid;
	}
	public void setColorid(int colorid) {
		this.colorid = colorid;
	}
	public String getColorname() {
		return colorname;
	}
	public void setColorname(String colorname) {
		this.colorname = colorname;
	}
	@Override
	public String toString() {
		return "Color [colorid=" + colorid + ", colorname=" + colorname + "]";
	}
	
	

}
