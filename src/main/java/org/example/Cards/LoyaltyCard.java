package org.example.Cards;

public class LoyaltyCard extends DebitCard {

    private int loyaltyPoints;

    public LoyaltyCard() {
        this.loyaltyPoints = 0;
    }

    @Override
    public boolean pay(double amount) {
        if (super.pay(amount)) {
            int pointsEarned = (int) (amount / 10);  // По 1 баллу за каждые 10 рублей
            loyaltyPoints += pointsEarned;
            return true;
        } else {
            return false;
        }
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }
}


