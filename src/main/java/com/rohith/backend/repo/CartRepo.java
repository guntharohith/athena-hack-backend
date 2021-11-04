package com.rohith.backend.repo;

import com.rohith.backend.entity.CartEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface CartRepo extends JpaRepository<CartEntity,Integer> {



    public List<CartEntity> findByEmail(String email);

    @Transactional
    @Modifying
    public void deleteAllByEmail(String email);

    @Transactional
    @Modifying
    @Query("update cart c set c.quantity=?2 where c.cartId = ?1")
    public void updateCartQuantity(int cartId,int quantity);
}
