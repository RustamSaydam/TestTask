package org.example.Cards;

public class MilesCard extends CreditCard {

    private int miles;

    public MilesCard(double creditLimit) {
        super(creditLimit);
        this.miles = 0;
    }

    @Override
    public boolean pay(double amount) {
        if (super.pay(amount)) {
            int milesEarned = (int) (amount / 200); // По 1 миле за каждые 200 рублей
            miles += milesEarned;
            return true;
        } else {
            return false;
        }
    }

    public int getMiles() {
        return miles;
    }
}
