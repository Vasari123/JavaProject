package sealedClasses;

public final class OnlineWallet extends PaymentMethod {
    @Override
    public void processPayment(PaymentMethod paymentMethod) {
        System.out.println("Online wallet implementation");
    }
}
