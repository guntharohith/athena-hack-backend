package com.rohith.backend.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="orders")
public class OrderEntity {
    @Id
    @GeneratedValue
    int orderId;
    String date;
    double price;
    int quantity;
    String image;
    String name;
    String status;
    String total;
    String email;

    public OrderEntity(String date, double price, int quantity, String image, String name, String status, String total, String email) {
        this.date = date;
        this.price = price;
        this.quantity = quantity;
        this.image = image;
        this.name = name;
        this.status = status;
        this.total = total;
        this.email = email;
    }
    public OrderEntity(){
        super();
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
