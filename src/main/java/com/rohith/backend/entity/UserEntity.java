package com.rohith.backend.entity;
//
//import javax.persistence.*;
//import java.util.List;
//
//@Entity(name="users")
//public class UserEntity {
//
//    @Id
//    String email;
//    String userName;
//    String password;
//    boolean active;
//    String role;
//
//    @OneToMany(mappedBy = "userEntity", cascade = CascadeType.ALL)
//    private List<CartEntity> cartItems;
//
//    public UserEntity(String email, String userName, String password, boolean active, String role) {
//        this.email = email;
//        this.userName = userName;
//        this.password = password;
//        this.active = active;
//        this.role = role;
//    }
//
//    public UserEntity(){
//        super();
//    }
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//    public List<CartEntity> getCartItems() {
//        return cartItems;
//    }
//
//    public void setCartItems(List<CartEntity> cartItems) {
//        this.cartItems = cartItems;
//    }
//
//    public String getUserName() {
//        return userName;
//    }
//
//    public void setUserName(String userName) {
//        this.userName = userName;
//    }
//
//
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public boolean isActive() {
//        return active;
//    }
//
//    public void setActive(boolean active) {
//        this.active = active;
//    }
//
//    public String getRole() {
//        return role;
//    }
//
//    public void setRole(String role) {
//        this.role = role;
//    }
//}

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="users")
public class UserEntity {

    @Id
    String email;
    String userName;
    String password;
    boolean active;
    String role;

    public UserEntity(String email, String userName, String password, boolean active, String role) {
        this.email = email;
        this.userName = userName;
        this.password = password;
        this.active = active;
        this.role = role;
    }

    public UserEntity(){
        super();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}