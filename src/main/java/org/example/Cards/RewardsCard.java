package org.example.Cards;

public class RewardsCard extends CreditCard {

    private int rewardsPoints;

    public RewardsCard(double creditLimit) {
        super(creditLimit);
        this.rewardsPoints = 0;
    }

    @Override
    public boolean pay(double amount) {
        if (super.pay(amount)) {
            int pointsEarned = (int) (amount / 100);  // По 1 баллу за каждые 100 рублей
            rewardsPoints += pointsEarned;
            return true;
        } else {
            return false;
        }
    }

    public int getRewardsPoints() {
        return rewardsPoints;
    }
}