package oop;

public class CreditCardPayment extends Payment{

    private String cardNumber;
    private String securityCode;

    public CreditCardPayment(double amount, String currency,
                             String cardNumber, String securityCode) {
        super(amount, currency);
        this.cardNumber = cardNumber;
        this.securityCode = securityCode;
    }

    @Override
    public double calcTransactionCosts() {

        if (getCurrency().equals("EUR")) {
            return 0.5 + exchangeToEUR() * 0.011;
        }
        else {
            // Fremdwährung
            return 1.5 + exchangeToEUR() * 0.0275;
        }
    }

    @Override
    public String toString() {
        return "CreditCardPayment{" +
                "cardNumber='" + cardNumber + '\'' +
                ", securityCode='" + securityCode + '\'' +
                ", amount ='" + amount + '\'' +
                ", currency ='" + getCurrency() + '\'' +
                ", TransactionCosts ='" + calcTransactionCosts() + '\'' +
                '}';
    }
}
