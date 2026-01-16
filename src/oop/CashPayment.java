package oop;

public class CashPayment extends Payment {
    private String name;

    public CashPayment(double amount, String currency, String name) {
        super(amount, currency);
        this.name = name;
    }

    public CashPayment(double amount, String currency) {
        super(amount, currency);
    }

    @Override
    public double calcTransactionCosts() {
        if (name == null || name.equals("")) {
            return 2;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "CashPayment{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                ", currency =" + getCurrency() +
                ", calcTransactionCosts=" + calcTransactionCosts() +
                '}';
    }
}
