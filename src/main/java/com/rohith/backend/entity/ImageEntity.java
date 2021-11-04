package com.rohith.backend.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="image")
public class ImageEntity {
	
	@Id
	@GeneratedValue
	int imageId;
	String imageUrl;
	public ImageEntity(String imageUrl) {
		super();
		this.imageUrl = imageUrl;
	}
	
	public ImageEntity() {
		super();
	}

	public int getImageId() {
		return imageId;
	}

	public void setImageId(int imageId) {
		this.imageId = imageId;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}


	
	
	

}
