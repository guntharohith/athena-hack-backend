package com.rohith.backend.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="address")
public class AddressEntity {
    @Id
    @GeneratedValue
    int addressId;
    String hNoStreet;
    String city;
    String state;
    String pinCode;
    String email;

    public AddressEntity(String hNoStreet, String city, String state, String pinCode, String email) {
        this.hNoStreet = hNoStreet;
        this.city = city;
        this.state = state;
        this.pinCode = pinCode;
        this.email = email;
    }

    public AddressEntity(){
        super();
    }
    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String gethNoStreet() {
        return hNoStreet;
    }

    public void sethNoStreet(String hNoStreet) {
        this.hNoStreet = hNoStreet;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
