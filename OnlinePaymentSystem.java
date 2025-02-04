abstract class PaymentMethod {
    abstract void processPayment(double amount);
}

class CreditCard extends PaymentMethod {
    @Override
    void processPayment(double amount) {
        double fee = amount * 0.02; // 2% fee
        System.out.println("Processing credit card payment of: $" + (amount + fee) + " (including $" + fee + " fee)");
    }
}

class PayPal extends PaymentMethod {
    @Override
    void processPayment(double amount) {
        System.out.println("Processing PayPal payment of: $" + amount);
    }
}

public class OnlinePaymentSystem {
    public static void processTransaction(PaymentMethod paymentMethod, double amount) {
        paymentMethod.processPayment(amount);
    }

    public static void main(String[] args) {
        PaymentMethod creditCard = new CreditCard();
        PaymentMethod payPal = new PayPal();
        
        processTransaction(creditCard, 100.0);
        processTransaction(payPal, 100.0);
    }
}
