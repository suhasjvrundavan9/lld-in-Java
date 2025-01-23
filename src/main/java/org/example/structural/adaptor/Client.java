package org.example.structural.adaptor;

import org.example.structural.adaptor.razorpay.RazorpayGateway;

public class Client {
    public static void main(String[] args) {

        //step 1 instantiate razorpay gateway object
        RazorpayGateway razorpayGateway = new RazorpayGateway();

        //step 2 create adaptor instance/object and inject razor pay object to this adaptor object
        PaymentGateway paymentGateway = new PaymentGatewayRazorpayAdaptor(razorpayGateway);

        //step 3 call our methods payViaCreditCard
        Long transactionId = paymentGateway.payViaCreditCard("123456789", 123, 01/01, 1000L);

        //print transaction id
        System.out.println("Transaction ID = " + transactionId);


    }
}
