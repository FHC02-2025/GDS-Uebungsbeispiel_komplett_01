package oop;

public abstract class Payment {
    protected double amount;
    private String currency;

    public Payment(double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public abstract double calcTransactionCosts();

    public double exchangeToEUR() {

        switch (currency) {
            case "USD":
                return amount / 1.1;
            case "GBP":
                return amount / 0.85;
            case "SEK":
                return amount / 9.5;
            case "HUF":
                return amount / 310;
            default:
                return amount / 2;
        }
    }

    public String getCurrency() {
        return currency;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "amount=" + amount +
                ", currency='" + currency + '\'' +
                '}';
    }
}
