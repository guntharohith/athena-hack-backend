package com.rohith.backend.models;

public class PaymentResponse {
    private String id;
    private int amount;
    private String currency;
    private String receipt;

    public PaymentResponse(String id, int amount, String currency, String receipt) {
        this.id = id;
        this.amount = amount;
        this.currency = currency;
        this.receipt = receipt;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getReceipt() {
        return receipt;
    }

    public void setReceipt(String receipt) {
        this.receipt = receipt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
