package org.example.structural.adaptor;

public interface PaymentGateway {
    Long payViaCreditCard(String cardNumber, int cvv, int expiry, Long amount);

    PaymentStatus getPaymentStatus(Long transactionID);
}
