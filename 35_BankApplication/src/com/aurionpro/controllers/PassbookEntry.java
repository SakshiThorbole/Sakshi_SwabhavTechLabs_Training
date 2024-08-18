package com.aurionpro.controllers;

import java.sql.Timestamp;

public class PassbookEntry {
    private long senderAccountNumber;
    private long receiverAccountNumber;
    private double amount;
    private Timestamp transactionDate;
    private String transactionType;

    
    public PassbookEntry(long senderAccountNumber, long receiverAccountNumber, double amount, Timestamp transactionDate, String transactionType) {
        this.senderAccountNumber = senderAccountNumber;
        this.receiverAccountNumber = receiverAccountNumber;
        this.amount = amount;
        this.transactionDate = transactionDate;
        this.transactionType = transactionType;
    }

    
    public long getSenderAccountNumber() {
        return senderAccountNumber;
    }

    public void setSenderAccountNumber(long senderAccountNumber) {
        this.senderAccountNumber = senderAccountNumber;
    }

    public long getReceiverAccountNumber() {
        return receiverAccountNumber;
    }

    public void setReceiverAccountNumber(long receiverAccountNumber) {
        this.receiverAccountNumber = receiverAccountNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Timestamp getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Timestamp transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    @Override
    public String toString() {
        return "PassbookEntry [senderAccountNumber=" + senderAccountNumber + ", receiverAccountNumber=" + receiverAccountNumber 
            + ", amount=" + amount + ", transactionDate=" + transactionDate + ", transactionType=" + transactionType + "]";
    }
}
