package com.rohith.backend.controllers;

import com.rohith.backend.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.rohith.backend.entity.ProductEntity;
import com.rohith.backend.models.ProductModel;
import com.rohith.backend.services.ProductService;

import java.util.List;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	@Autowired
	private ProductRepo productRepo;
	
	@PostMapping("/addProduct")
	public void addProduct(@RequestBody ProductModel product) {
		ProductEntity p = new ProductEntity(product.getName(),product.getPrice(),product.getDescription(),
				product.getCompany(),product.getStock(),product.getStars(),product.getReviews(),product.getCategory(),product.isShipping(),
				product.getColors(),product.getImages());
		productService.createProduct(p);
	}

	@GetMapping("/getProduct/{id}")
	public ProductEntity getProduct(@PathVariable String id){
		return productService.fetchProduct(id);
	}
	@GetMapping("/getProducts")
	public List<ProductEntity> getProducts(){
		return productService.fetchProducts();
	}

	@PutMapping("/updateProduct/{id}")
	public ProductEntity updateProduct(@PathVariable String id, @RequestBody ProductEntity productEntity) {
		return productService.editProduct(id,productEntity);
	}
	@DeleteMapping("/deleteProduct/{id}")
	public void deleteProduct(@PathVariable String id) {
		productService.removeProduct(id);
	}


	

	

}
