package sealedClasses;

public final class BankTransfer extends PaymentMethod{
    @Override
    public void processPayment(PaymentMethod paymentMethod) {
        System.out.println("Bank transfer implementation..");

    }
}
