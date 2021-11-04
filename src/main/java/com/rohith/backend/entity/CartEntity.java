package com.rohith.backend.entity;
//
//import com.fasterxml.jackson.annotation.JsonIgnore;
//
//import javax.persistence.*;
//
//@Entity(name="cart")
//public class CartEntity {
//
//    @Id
//    @GeneratedValue
//    int cartId;
//    String name;
//    String color;
//    String image;
//    double price;
//    int quantity;
//
//    @JsonIgnore
//    @ManyToOne
//    @JoinColumn(
//            name = "email",
//            referencedColumnName = "email"
//    )
//    private UserEntity userEntity;
//
//    public CartEntity(String name, String color, String image, double price, int quantity,UserEntity userEntity) {
//        this.name = name;
//        this.color = color;
//        this.image = image;
//        this.price = price;
//        this.quantity = quantity;
//        this.userEntity = userEntity;
//
//    }
//
//
//    public UserEntity getUserEntity() {
//        return userEntity;
//    }
//
//    public void setUserEntity(UserEntity userEntity) {
//        this.userEntity = userEntity;
//    }
//
//    public CartEntity(){
//        super();
//    }
//
//    public int getCartId() {
//        return cartId;
//    }
//
//    public void setCartId(int cartId) {
//        this.cartId = cartId;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    public String getImage() {
//        return image;
//    }
//
//    public void setImage(String image) {
//        this.image = image;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public void setPrice(double price) {
//        this.price = price;
//    }
//
//    public int getQuantity() {
//        return quantity;
//    }
//
//    public void setQuantity(int quantity) {
//        this.quantity = quantity;
//    }
//}

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="cart")
public class CartEntity {

    @Id
    @GeneratedValue
    int cartId;
    String name;
    String color;
    String image;
    double price;
    int quantity;
    double rent;
    String fromDate;
    String toDate;
    int numDays;
    String email;

    public CartEntity(String name, String color, String image, double price, int quantity, double rent, String fromDate, String toDate, int numDays, String email) {
        this.name = name;
        this.color = color;
        this.image = image;
        this.price = price;
        this.quantity = quantity;
        this.rent = rent;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.numDays = numDays;
        this.email = email;
    }

    public CartEntity(){
        super();
    }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    public int getNumDays() {
        return numDays;
    }

    public void setNumDays(int numDays) {
        this.numDays = numDays;
    }
}