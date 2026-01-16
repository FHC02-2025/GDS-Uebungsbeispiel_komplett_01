package oop;

import java.util.ArrayList;

public class DemoApp {

    public static void main(String[] args) {

        CreditCardPayment creditCardPayment = new CreditCardPayment(10000.0, "HUF", "cardnumber", "secCode");
        System.out.println("creditCardPayment.calcTransactionCosts = " + creditCardPayment.calcTransactionCosts());
        System.out.println("creditCardPayment.exchangeToEUR = " + creditCardPayment.exchangeToEUR());

        CashPayment cp = new CashPayment(100, "SEK");
        System.out.println("cp.calcTransactionCosts() = " + cp.calcTransactionCosts());

        MaestroPayment mp = new MaestroPayment(300, "SEK", "cardNumber");
        System.out.println("mp.calcTransactionCosts() = " + mp.calcTransactionCosts());

        PaymentJournal paymentJournal = new PaymentJournal();
        paymentJournal.add(cp);
        paymentJournal.add(mp);
        paymentJournal.add(creditCardPayment);

        System.out.println("paymentJournal.getPaymentsPerCurrency() = " + paymentJournal.getPaymentsPerCurrency());
        System.out.println("paymentJournal.getPaymentsPerCurrency() = " + paymentJournal.totalTransactionCosts());

    }
}
