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
	
	public List<ProductEntity> fetchProducts(){
		return productRepo.findAll();
	}

}
