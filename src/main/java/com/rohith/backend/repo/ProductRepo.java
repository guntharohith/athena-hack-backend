package com.rohith.backend.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rohith.backend.entity.ProductEntity;

public interface ProductRepo extends JpaRepository<ProductEntity,String> {

}
