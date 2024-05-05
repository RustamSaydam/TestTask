package org.example.Cards;

public abstract class BankCard {

    protected double balance;

    public abstract double getBalance();

    public abstract void deposit(double amount);

    public abstract boolean pay(double amount);

    public abstract String getBalanceInfo();

    public abstract String getAvailableFundsInfo();

}
