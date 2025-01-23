package org.example.structural.adaptor2.bank;

// BankTransferPaymentService.java
public class BankTransferPaymentService {

    public String processBankTransfer(String accountNumber, double amount) {
        // Simulate bank transfer processing
        System.out.println("Processing bank transfer of " + amount + " to account " + accountNumber);
        return "BANKTRANSFER56789"; // Simulated transaction ID
    }

    public String getBankTransferStatus(String transactionId) {
        // Simulate bank transfer status check
        System.out.println("Checking payment status for Bank Transfer transaction " + transactionId);
        return "Transfer Completed from BANK";
    }
}
