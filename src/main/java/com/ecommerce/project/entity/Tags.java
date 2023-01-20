package com.ecommerce.project.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tags")
public class Tags {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int tagsid;
	private String tagename;
	
	public int getTagsid() {
		return tagsid;
	}
	public void setTagsid(int tagsid) {
		this.tagsid = tagsid;
	}
	public String getTagename() {
		return tagename;
	}
	public void setTagename(String tagename) {
		this.tagename = tagename;
	}

}
