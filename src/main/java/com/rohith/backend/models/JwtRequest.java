package com.rohith.backend.models;

public class JwtRequest {

    private String userName;
    private String password;

    public JwtRequest(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public JwtRequest(){
        super();
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
}
