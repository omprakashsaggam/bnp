package com.bnp.model;

public class SavingsAccount extends Account{
    private double interestRate;
    private double minimumBalance;
    private double withdrawalLimit;

    SavingsAccount(){
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

    public double getWithdrawalLimit() {
        return withdrawalLimit;
    }

    public void setWithdrawalLimit(double withdrawalLimit) {
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public String toString() {
        return "SavingsAccount{" + "interestRate=" + interestRate + ", minimumBalance=" + minimumBalance + ", withdrawalLimit=" + withdrawalLimit + '}';
    }
}

