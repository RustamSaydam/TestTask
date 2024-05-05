package org.example.Cards;

public class DebitCard extends BankCard {
    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    @Override
    public boolean pay(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String getBalanceInfo() {
        return "Баланс: " + balance;
    }

    @Override
    public String getAvailableFundsInfo() {
        return "Баланс: " + balance;
    }
}
