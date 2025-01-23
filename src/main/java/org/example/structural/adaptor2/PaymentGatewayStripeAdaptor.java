package org.example.structural.adaptor2;

import org.example.structural.adaptor2.stripe.StripePaymentService;

public class PaymentGatewayStripeAdaptor implements PaymentGateway{

    private StripePaymentService sps;

    public PaymentGatewayStripeAdaptor(StripePaymentService sps){
        this.sps = sps;
    }
    @Override
    public String makePayment(String cardNumber, String cardOwner, double amount) {
        String transId = sps.processCreditCardPayment(cardNumber, cardOwner, amount);
        return transId;
    }

    @Override
    public String paymentStatusUpdate(String transactionID) {
        String paymentStatus = sps.checkPaymentStatus(transactionID);
        return paymentStatus;
    }
}
