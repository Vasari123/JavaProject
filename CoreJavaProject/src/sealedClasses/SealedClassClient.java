package sealedClasses;

public class SealedClassClient {

    public static void handlePayments(PaymentMethod paymentMethod) {
        switch (paymentMethod) {
            case CreditCard creditCard -> creditCard.processPayment(paymentMethod);
            case BankTransfer bankTransfer -> bankTransfer.processPayment(paymentMethod);
            case OnlineWallet onlineWallet -> onlineWallet.processPayment(paymentMethod);
            default -> throw new RuntimeException("No payment found");
        }
    }

    public static void main(String[] args) {

        PaymentMethod paymentMethod = new CreditCard();
        handlePayments(paymentMethod);
        PaymentMethod paymentMethod1 = new BankTransfer();
        handlePayments(paymentMethod1);
        PaymentMethod paymentMethod2 = new OnlineWallet();
        handlePayments(paymentMethod2);

    }
}
