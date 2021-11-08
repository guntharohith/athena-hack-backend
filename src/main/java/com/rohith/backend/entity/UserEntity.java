package com.rohith.backend.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="users")
public class UserEntity {

    @Id
    String email;
    String userName;
    String password;
    String mobileNumber;
    boolean active;
    String role;

    public UserEntity(String email, String userName, String password,String mobileNumber, boolean active, String role) {
        this.email = email;
        this.userName = userName;
        this.password = password;
        this.mobileNumber = mobileNumber;
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

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
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