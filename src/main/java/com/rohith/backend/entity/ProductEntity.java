package com.rohith.backend.entity;


import javax.persistence.*;
import java.util.*;
import org.hibernate.annotations.GenericGenerator;

@Entity(name="product")
public class ProductEntity {
	
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	String productId;
	String name;
	double price;
	@Lob
	String description;
	String company;
	int stock;
	double stars;
	int reviews;
	String category;
	boolean shipping;

	@OneToMany(
			cascade = CascadeType.ALL
	)
	@JoinColumn(
			name="product_id",
			referencedColumnName = "productId"
	)
	private List<colorEntity> colors;

	@OneToMany(
			cascade = CascadeType.ALL
	)
	@JoinColumn(
			name = "product_id",
			referencedColumnName = "productId"
	)
	private List<ImageEntity> images;

	public ProductEntity(String name, double price, String description, String company, int stock, double stars, int reviews, String category, boolean shipping, List<colorEntity> colors, List<ImageEntity> images) {
		this.name = name;
		this.price = price;
		this.description = description;
		this.company = company;
		this.stock = stock;
		this.stars = stars;
		this.reviews = reviews;
		this.category = category;
		this.shipping = shipping;
		this.colors = colors;
		this.images = images;
	}



	public ProductEntity(){
		super();
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
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

	public List<colorEntity> getColors() {
		return colors;
	}

	public void setColors(List<colorEntity> colors) {
		this.colors = colors;
	}

	public List<ImageEntity> getImages() {
		return images;
	}

	public void setImages(List<ImageEntity> images) {
		this.images = images;
	}
}

