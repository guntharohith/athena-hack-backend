package com.rohith.backend.controllers;

import com.rohith.backend.entity.AddressEntity;
import com.rohith.backend.entity.CartEntity;
import com.rohith.backend.entity.OrderEntity;
import com.rohith.backend.entity.UserEntity;
import com.rohith.backend.models.JwtRequest;
import com.rohith.backend.models.JwtResponse;
import com.rohith.backend.models.UserModel;
import com.rohith.backend.services.AddressService;
import com.rohith.backend.services.OrderService;
import com.rohith.backend.services.UserService;
import com.rohith.backend.utility.JwtUtility;
import org.aspectj.weaver.ast.Or;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.security.Principal;

@RestController
public class UserController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtUtility jwtUtility;

    @Autowired
    private UserService userService;

    @Autowired
    private AddressService addressService;

    @Autowired
    private OrderService orderService;

    @PostMapping("/signup")
    public void addUser(@RequestBody UserEntity userEntity) throws Exception{
        String role = "user";
        if(userEntity.getEmail().equals("admin@gmail.com")){
            role = "admin";
        }
        UserEntity user = new UserEntity(userEntity.getEmail(),userEntity.getUserName(),userEntity.getPassword(), userEntity.getMobileNumber(), true,role);
        userService.createUser(user);
    }

    @PostMapping("/login")
    public JwtResponse authenticate(@RequestBody JwtRequest user) throws Exception {
        try{
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(user.getUserName(),user.getPassword())
            );
        }
        catch(BadCredentialsException e){
            throw new Exception("Invalid Credentials" + e);
        }

        final UserDetails userDetails = userService.loadUserByUsername(user.getUserName());
        final String token = jwtUtility.generateToken(userDetails);
        return new JwtResponse(token);
    }

    @GetMapping("/get-user-details")
    public UserEntity getUserDetails(Principal principal){
        return userService.fetchUser(principal.getName());
    }

    @PostMapping("/add-address")
    public AddressEntity addAddress(@RequestBody AddressEntity addressEntity,Principal principal){
        addressEntity.setEmail(principal.getName());
        return addressService.addAddress(addressEntity);
    }

    @GetMapping("/get-address")
    public List<AddressEntity> getAddress(Principal principal){
        return addressService.fetchAddress(principal.getName());
    }

    @PostMapping("/add-order")
    public OrderEntity addOrder(@RequestBody OrderEntity orderEntity, Principal principal){
        orderEntity.setEmail(principal.getName());
        return orderService.saveOrder(orderEntity);
    }

    @GetMapping("/get-orders")
    public List<OrderEntity> getOrders(Principal principal){
        return orderService.getOrders(principal.getName());
    }

    @GetMapping("/get-all-orders")
    public List<OrderEntity> getAllOrders(){
        return orderService.getAllOrders();
    }

    @DeleteMapping("/delete-order/{orderId}")
    public void deleteOrder(@PathVariable int orderId){
        orderService.removeOrder(orderId);
    }
}
