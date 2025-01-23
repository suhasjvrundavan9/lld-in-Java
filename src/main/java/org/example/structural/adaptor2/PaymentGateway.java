package org.example.structural.adaptor2;

public interface PaymentGateway {

    //make a payment
    String makePayment(String cardNumber, String cardOwner, double amount);

    //check payment status
    String paymentStatusUpdate(String transactionID);

}
