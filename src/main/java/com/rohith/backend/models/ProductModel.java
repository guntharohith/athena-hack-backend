package com.rohith.backend.models;

import com.rohith.backend.entity.ImageEntity;
import com.rohith.backend.entity.colorEntity;

import java.awt.*;
import java.util.List;

public class ProductModel {
	
	String name;
	double price;
	String description;
	String company;
	int stock;
	double stars;
	int reviews;
	String category;
	boolean shipping;
	List<ImageEntity> images;
	List<colorEntity> colors;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public  double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public double getStars() {
		return stars;
	}
	public void setStars(double stars) {
		this.stars = stars;
	}
	public int getReviews() {
		return reviews;
	}
	public void setReviews(int reviews) {
		this.reviews = reviews;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public boolean isShipping() {
		return shipping;
	}
	public void setShipping(boolean shipping) {
		this.shipping = shipping;
	}
	public List<ImageEntity> getImages() {
		return images;
	}
	public void setImages(List<ImageEntity> images) {
		this.images = images;
	}
	public List<colorEntity> getColors() {
		return colors;
	}
	public void setColors(List<colorEntity> colors) {
		this.colors = colors;
	}
	
	

}
