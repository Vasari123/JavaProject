package sealedClasses;

public abstract sealed class PaymentMethod permits CreditCard, BankTransfer, OnlineWallet {

    public abstract void processPayment(PaymentMethod paymentMethod);
}
