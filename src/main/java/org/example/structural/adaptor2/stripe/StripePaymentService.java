package org.example.structural.adaptor2.stripe;

// StripePaymentService.java
public class StripePaymentService {

    public String processCreditCardPayment(String cardNumber, String cardHolder, double amount) {
        // Simulate Stripe processing
        System.out.println("Processing credit card payment of " + amount + " via Stripe for " + cardHolder);
        return "STRIPE12345"; // Simulated transaction ID
    }

    public String checkPaymentStatus(String transactionId) {
        // Simulate payment status check
        System.out.println("Checking payment status for Stripe transaction " + transactionId);
        return "Payment Successful using STRIPE";
    }
}
