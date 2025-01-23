package org.example.structural.adaptor2;

import org.example.structural.adaptor2.paypal.PayPalPaymentService;

public class PaymentGatewayPayPalAdaptor implements PaymentGateway{

    PayPalPaymentService pps;

    public PaymentGatewayPayPalAdaptor(PayPalPaymentService pps){
        this.pps = pps;
    }

    @Override
    public String makePayment(String cardNumber, String cardOwner, double amount) {
        String transactionId = pps.makePayPalPayment(cardOwner, amount);
        return transactionId;
    }

    @Override
    public String paymentStatusUpdate(String transactionID) {
        return pps.getPayPalTransactionStatus(transactionID);
    }
}
