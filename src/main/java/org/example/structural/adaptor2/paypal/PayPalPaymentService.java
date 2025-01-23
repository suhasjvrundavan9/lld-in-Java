package org.example.structural.adaptor2.paypal;

// PayPalPaymentService.java
public class PayPalPaymentService {

    public String makePayPalPayment(String paypalAccount, double amount) {
        // Simulate PayPal processing
        System.out.println("Processing payment of " + amount + " via PayPal account " + paypalAccount);
        return "PAYPAL98765"; // Simulated transaction ID
    }

    public String getPayPalTransactionStatus(String transactionId) {
        // Simulate PayPal status check
        System.out.println("Checking payment status for PayPal transaction " + transactionId);
        return "Payment Completed via PayPal";
    }
}

