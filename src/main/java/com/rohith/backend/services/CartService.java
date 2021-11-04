package com.rohith.backend.services;

import com.rohith.backend.entity.CartEntity;
import com.rohith.backend.repo.CartRepo;
import com.rohith.backend.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {

    @Autowired
    private CartRepo cartRepo;

//    public void addToCart(CartEntity cart){
//        cartRepo.save(cart);
//    }
//
//    public void deleteCartItem(int cartId){
//        cartRepo.deleteById(cartId);
//    }
//
//    public void deleteAllCart(String email){
//        cartRepo.clearCart(email);
//    }

    public CartEntity addToCart(CartEntity cart){

        return cartRepo.save(cart);
    }

    public List<CartEntity> fetchProducts(String email){
        return cartRepo.findByEmail(email);
    }

    public void deleteCartItem(int id){
        cartRepo.deleteById(id);
    }
    public void clearCart(String email){
        cartRepo.deleteAllByEmail(email);
    }

    public void removeCartItem(CartEntity cartEntity){
        cartRepo.delete(cartEntity);
    }

    public void updateCart(int id,int quantity){
        cartRepo.updateCartQuantity(id,quantity);
    }

}
