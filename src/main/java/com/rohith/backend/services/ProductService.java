package com.rohith.backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rohith.backend.entity.ProductEntity;
import com.rohith.backend.repo.ProductRepo;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepo productRepo;
	
	public void createProduct(ProductEntity product) {
		productRepo.save(product);
	}

	public ProductEntity fetchProduct(String productId){
		return productRepo.findById(productId).orElse(null);
	}
	
	public List<ProductEntity> fetchProducts(){
		return productRepo.findAll();
	}

	public ProductEntity editProduct(String productId, ProductEntity productEntity){
		ProductEntity p = productRepo.findProductById(productId);
		p.setName(productEntity.getName());
		p.setPrice(productEntity.getPrice());
		p.setDescription(productEntity.getDescription());
		p.setCompany(productEntity.getCompany());
		p.setStock(productEntity.getStock());
		p.setStars(productEntity.getStars());
		p.setReviews(productEntity.getReviews());
		p.setCategory(productEntity.getCategory());
		p.setShipping(productEntity.isShipping());
		p.setImages(productEntity.getImages());
		p.setColors(productEntity.getColors());
		productRepo.save(p);
		return p;
	}

	public void removeProduct(String productId){
		productRepo.deleteById(productId);
	}

}
