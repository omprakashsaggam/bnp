package com.bnp.model;

public class CurrentAccount extends Account{
    private double interestRate;
    private double minimumBalance;

    CurrentAccount(){
        super();
    }

    public double getInterestRate() {
        return interestRate;
    }
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    public double getMinimumBalance() {
        return minimumBalance;
    }
    public void setMinimumBalance(double minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

    @Override
    public String toString() {
        return "CurrentAccount{" + "interestRate=" + interestRate + ", minimumBalance=" + minimumBalance + '}';
    }
}
