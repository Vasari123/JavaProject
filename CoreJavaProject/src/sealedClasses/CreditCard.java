package sealedClasses;

public final class CreditCard extends PaymentMethod {
    @Override
    public void processPayment(PaymentMethod paymentMethod) {
        System.out.println("Credit card implementation");
    }
}
