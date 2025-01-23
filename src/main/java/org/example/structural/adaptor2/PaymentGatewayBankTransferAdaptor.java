package org.example.structural.adaptor2;

import org.example.structural.adaptor2.bank.BankTransferPaymentService;

public class PaymentGatewayBankTransferAdaptor implements PaymentGateway{

    private BankTransferPaymentService btps;

    public PaymentGatewayBankTransferAdaptor(BankTransferPaymentService btps){
        this.btps = btps;
    }

    @Override
    public String makePayment(String cardNumber, String cardOwner, double amount) {
        return btps.processBankTransfer(cardNumber, amount);
    }

    @Override
    public String paymentStatusUpdate(String transactionID) {
        return btps.getBankTransferStatus(transactionID);
    }
}
