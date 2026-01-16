package oop;

import java.util.ArrayList;
import java.util.HashMap;

public class PaymentJournal {

    private ArrayList<Payment> payments = new ArrayList<>();

    public PaymentJournal() {
        payments = new ArrayList<>();
    }

    public void add(Payment p) {
        payments.add(p);
    }

    public void addMany(ArrayList<Payment> pa) {
        payments.addAll(pa);
    }

    public double totalTransactionCosts() {
        double sum = 0;
        for (Payment p : payments) {
            sum += p.calcTransactionCosts();
        }

        return sum;
    }

    public HashMap<String, Double> getPaymentsPerCurrency(){
        HashMap<String, Double> result = new HashMap<>();

        for (Payment p : payments) {
            // Eintrag enthalten
            if (result.containsKey(p.getCurrency())){
                // ja, Eintrag existiert
                // auslesen
                double value = result.get(p.getCurrency());
                // manipulieren
                value += 1.0;
                // ablegen
                result.put(p.getCurrency(), value);
            }
            else {
                // nein
                result.put(p.getCurrency(), 1.0);
            }
        }

        return result;
    }
}
