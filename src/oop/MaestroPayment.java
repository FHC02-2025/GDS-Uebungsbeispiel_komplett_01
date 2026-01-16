package oop;

public class MaestroPayment extends Payment {
    private String cardNumber;

    public MaestroPayment(double amount, String currency, String cardNumber) {
        super(amount, currency);
        this.cardNumber = cardNumber;
    }

    @Override
    public double calcTransactionCosts() {

        double costs = exchangeToEUR() * 0.0075;

        if (costs < 0.95) {
            costs = 0.95;
        }

        //costs = costs < 0.95 ? 0.95 : costs;

        return costs;
    }

    @Override
    public String toString() {
        return "MaestroPayment{" +
                "cardNumber='" + cardNumber + '\'' +
                ", amount=" + amount +
                ", currency =" + getCurrency() +
                ", calcTransactionCosts =" + calcTransactionCosts() +
                '}';
    }
}
