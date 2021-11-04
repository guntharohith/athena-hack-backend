package com.rohith.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rohith.backend.entity.ProductEntity;
import com.rohith.backend.models.ProductModel;
import com.rohith.backend.services.ProductService;

import java.util.List;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@PostMapping("/addProduct")
	public void addProduct(@RequestBody ProductModel product) {
		ProductEntity p = new ProductEntity(product.getName(),product.getPrice(),product.getDescription(),
				product.getCompany(),product.getStock(),product.getStars(),product.getReviews(),product.getCategory(),product.isShipping(),
				product.getColors(),product.getImages());
		productService.createProduct(p);
	}

	@GetMapping("/getProducts")
	public List<ProductEntity> getProducts(){
		return productService.fetchProducts();

	}
	

	

}
