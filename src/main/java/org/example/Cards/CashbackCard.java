package org.example.Cards;

public class CashbackCard extends DebitCard {

    private final double cashbackRate;

    public CashbackCard(double cashbackRate) {
        this.cashbackRate = cashbackRate;
    }

    @Override
    public boolean pay(double amount) {
        if (super.pay(amount)) {
            double cashback = amount * cashbackRate;
            deposit(cashback);
            return true;
        } else {
            return false;
        }
    }
}

