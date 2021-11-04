package com.rohith.backend.controllers;

import com.rohith.backend.entity.CartEntity;
import com.rohith.backend.repo.CartRepo;
import com.rohith.backend.services.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@RestController
public class CartController {



//    @PostMapping("/add-cart")
//    public void addToCart(@RequestBody CartEntity cart, Principal principal){
//        UserEntity user = userService.fetchUser(principal.getName());
//        cart.setUserEntity(user);
//        cartService.addToCart(cart);
//    }
//
//    @GetMapping("/get-cart")
//    public List<CartEntity> getCartItems(Principal principal){
//        UserEntity user = userService.fetchUser(principal.getName());
//        return user.getCartItems();
//    }
//
//    @DeleteMapping("/delete-cart/{id}")
//    public void deleteCartItem(@PathVariable int id){
//        cartService.deleteCartItem(id);
//    }
//
//    @DeleteMapping("/clear-cart")
//    public void removeCart(Principal principal){
//        cartService.deleteAllCart(principal.getName());
//    }

    @Autowired
    private  CartRepo cartRepo;

    @Autowired
    private CartService cartService;
    @PostMapping("/add-cart")
    public CartEntity addToCart(@RequestBody CartEntity cartEntity, Principal principal){
        cartEntity.setEmail(principal.getName());
        return cartService.addToCart(cartEntity);
    }

    @GetMapping("/get-cart")
    public List<CartEntity> getCartItems(Principal principal){
        return cartService.fetchProducts(principal.getName());
    }

    @DeleteMapping("/delete-cart/{id}")
    public void deleteCartItem(@PathVariable int id){
        cartRepo.deleteById(id);
    }

    @DeleteMapping("/clear-cart")
    public void clearCart(Principal principal){
        cartService.clearCart(principal.getName());
    }


    @PutMapping("/update-cart/{id}")
    public void updateCartQuantity(@PathVariable int id, @RequestBody CartEntity cartEntity){
        cartService.updateCart(id,cartEntity.getQuantity());
    }

}
