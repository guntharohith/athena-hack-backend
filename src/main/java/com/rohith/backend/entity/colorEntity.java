package com.rohith.backend.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="color")
public class colorEntity {
	
	@Id
	@GeneratedValue
	int colorId;
	String color;

	public colorEntity(String color) {
		this.color = color;
	}

	public colorEntity(){
		super();
	}

	public int getColorId() {
		return colorId;
	}

	public void setColorId(int colorId) {
		this.colorId = colorId;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
