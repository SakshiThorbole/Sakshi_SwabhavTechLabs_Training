package com.aurionpro.solution.model;

public class FixedDeposit {
    private int accountNumber;
    private String name;
    private double principal;
    private int duration;
    private IFestivalInterest festivalInterest;
    
    public FixedDeposit(int accountNumber, String name, double principal, int duration, IFestivalInterest festivalInterest) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.principal = principal;
        this.duration = duration;
        this.festivalInterest = festivalInterest;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrincipal() {
        return principal;
    }

    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public IFestivalInterest getFestivalInterest() {
        return festivalInterest;
    }

    public void setFestivalInterest(IFestivalInterest festivalInterest) {
        this.festivalInterest = festivalInterest;
    }
    
    public double calculateSimpleInterest() {
        double rate = festivalInterest.getInterestRates();
        return (principal * duration * rate) / 100;
    }
}
