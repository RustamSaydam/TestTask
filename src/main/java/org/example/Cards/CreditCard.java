package org.example.Cards;

public class CreditCard extends BankCard {
    private final double creditLimit;

    public CreditCard(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            if (balance < 0) {
                double creditRepayment = Math.min(amount, -balance);
                balance += creditRepayment;
                amount -= creditRepayment;
            }
            balance += amount;
        }
    }

    @Override
    public boolean pay(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        } else if (amount <= balance + creditLimit) {
            double creditUsed = amount - balance;
            balance = -creditUsed;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String getBalanceInfo() {
        return "Баланс: " + balance + ", Кредитный лимит: " + creditLimit;
    }

    @Override
    public String getAvailableFundsInfo() {
        double availableFunds = balance + creditLimit;
        return "Баланс: " + balance + ", Доступные средства: " + availableFunds;
    }
}
