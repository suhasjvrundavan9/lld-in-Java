package org.example.structural.adaptor.razorpay;

public class RazorpayGateway {

    public String paymentByCreditCard(String cardNo, String cvvNo, String expiry, String amount){
        return "827186182";
    }

    public String paymentStatusUpdate(String id){
        return "Payment success via Credit Card";
    }
}
