package com.aurionpro.controllers;

public class CustomerDetails {
    private int customerId;
    private String firstName;

    public CustomerDetails(int customerId, String firstName) {
        this.customerId = customerId;
        this.firstName = firstName;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getFirstName() {
        return firstName;
    }
}
