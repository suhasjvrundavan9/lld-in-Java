package org.example.structural.adaptor;

import org.example.structural.adaptor.razorpay.RazorpayGateway;

public class PaymentGatewayRazorpayAdaptor implements PaymentGateway{
    private RazorpayGateway razorpayGateway;

    public PaymentGatewayRazorpayAdaptor(RazorpayGateway razorpayGateway){
        this.razorpayGateway = razorpayGateway;
    }

    @Override
    public Long payViaCreditCard(String cardNumber, int cvv, int expiry, Long amount) {
        //convert our parameters to match with razorpay method parameters
        String cvvNumber = String.valueOf(cvv);
        String expiryDate = String.valueOf(expiry);
        String amountToPay = String.valueOf(amount);
        String transactionID = razorpayGateway.paymentByCreditCard(cardNumber, cvvNumber, expiryDate, amountToPay);

        //convert return type from string(razorpay) to long (as per our method)
        return Long.parseLong(transactionID);
    }

    @Override
    public PaymentStatus getPaymentStatus(Long transactionID) {

        String tID = String.valueOf(transactionID);

        String paymentResult = razorpayGateway.paymentStatusUpdate(tID);

        return PaymentStatus.SUCCESS;
    }
}
