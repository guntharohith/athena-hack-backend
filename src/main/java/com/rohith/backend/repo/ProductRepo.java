package com.rohith.backend.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rohith.backend.entity.ProductEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProductRepo extends JpaRepository<ProductEntity,String> {

    @Query("select p from product p where productId =:productId")
    ProductEntity findProductById(@Param("productId") String productId);

}
