package org.example;

import org.example.Cards.CashbackCard;
import org.example.Cards.CreditCard;
import org.example.Cards.DebitCard;
import org.example.Cards.MilesCard;

public class Main {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard(1000);

        // Пополнение баланса
        creditCard.deposit(500);
        System.out.println("Баланс после пополнения: " + creditCard.getBalance()); // Баланс после пополнения: 500.0


        boolean paymentSuccessCredit = creditCard.pay(700);
        System.out.println("Статус оплаты: " + paymentSuccessCredit); // Статус оплаты true, пока сумма кредитного лемита не будет превышена
        System.out.println("Баланс после оплаты: " + creditCard.getBalance()); // Баланс после оплаты: -200.0

        // Получение информации о балансе и доступных средствах
        System.out.println(creditCard.getBalanceInfo()); // Баланс: -200.0, Кредитный лимит: 1000.0
        System.out.println(creditCard.getAvailableFundsInfo()); // Баланс: -200.0, Доступные средства: 800.
        System.out.println("Кредитка:");
        System.out.println("\n");


        DebitCard debitCard = new DebitCard();

        debitCard.deposit(75000);
        boolean paymentSuccessDebit = debitCard.pay(75000);
        System.out.println("Баланс после пополнения: " + debitCard.getBalance());  // Статус оплаты true, пока сумма покупки не превышает баланса дебетовой карты
        System.out.println("Баланс после оплаты: " + debitCard.getBalance());
        System.out.println("Статус оплаты: " + paymentSuccessDebit);
        System.out.println("Дебетовая:");
        System.out.println("\n");

        CashbackCard cashbackCard = new CashbackCard(0.05); // Устанавливаем процент кешбэка 5%

        // Пополнение баланса
        cashbackCard.deposit(500);
        System.out.println("Баланс после пополнения: " + cashbackCard.getBalance()); // Баланс после пополнения: 500.0

        // Оплата с использованием кешбэка
        boolean paymentSuccess = cashbackCard.pay(300);
        System.out.println("Статус оплаты: " + paymentSuccess); // Статус оплаты: true
        System.out.println("Баланс после оплаты с кешбэком: " + cashbackCard.getBalance()); // Баланс после оплаты с кешбэком: 215.0

        // Получение информации о балансе и доступных средствах
        System.out.println(cashbackCard.getBalanceInfo()); // Баланс: 215.0
        System.out.println(cashbackCard.getAvailableFundsInfo()); // Баланс: 215.0
        System.out.println("Дебетовая с Кэшбеком:");
        System.out.println("\n");


        MilesCard milesCard = new MilesCard(1000);

        // Покупка на 500 рублей
        milesCard.pay(500);

        // Покупка на 400 рублей
        milesCard.pay(400);

        // Получение накопленных миль
        int milesEarned = milesCard.getMiles();
        System.out.println("Накопленные мили: " + milesEarned); // Накопленные мили: 4

        // Получение информации о балансе, кредитном лимите и доступных средствах
        System.out.println(milesCard.getBalanceInfo()); // Баланс: -100.0, Кредитный лимит: 1000.0
        System.out.println(milesCard.getAvailableFundsInfo()); // Баланс: -900.0, Доступные средства: 100.0
        System.out.println("Кредитка с Бонусами:");
    }
}

