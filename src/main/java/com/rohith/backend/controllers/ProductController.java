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

	@PutMapping("/updateProduct/{productId}")
	public ProductEntity updateCollege(@PathVariable("productId") String productId, @RequestBody ProductEntity productEntity) {

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
		productRepo.save(p);

		return p;

	}
	@DeleteMapping("/deleteProduct/{productId}")
	public void deleteCollege(@PathVariable("productId") String productId) {

		ProductEntity p = productRepo.findProductById(productId);
		productRepo.delete(p);

	}


	

	

}
