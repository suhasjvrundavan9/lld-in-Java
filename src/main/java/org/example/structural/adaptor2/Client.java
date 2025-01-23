package org.example.structural.adaptor2;

import org.example.structural.adaptor2.bank.BankTransferPaymentService;
import org.example.structural.adaptor2.paypal.PayPalPaymentService;
import org.example.structural.adaptor2.stripe.StripePaymentService;

public class Client {
    public static void main(String[] args) {


        //create our adaptor class object and inject stripe object to this
        PaymentGateway paymentGateway;
        String option = "bank";
        String transId = "";
        String status = "";

        if(option == "stripe"){
            StripePaymentService sps = new StripePaymentService();
            paymentGateway = new PaymentGatewayStripeAdaptor(sps);
            transId = paymentGateway.makePayment("123456", "suhas", 1000L);
            status = paymentGateway.paymentStatusUpdate(transId);
        }else if(option == "paypal"){
            PayPalPaymentService pps = new PayPalPaymentService();
            paymentGateway = new PaymentGatewayPayPalAdaptor(pps);
            transId = paymentGateway.makePayment("123456", "suhas", 1000L);
            status = paymentGateway.paymentStatusUpdate(transId);
        }else if(option == "bank"){
            BankTransferPaymentService btps = new BankTransferPaymentService();
            paymentGateway = new PaymentGatewayBankTransferAdaptor(btps);
            transId = paymentGateway.makePayment("123456", "suhas", 1000L);
            status = paymentGateway.paymentStatusUpdate(transId);
        }


        System.out.println(transId);
        System.out.println(status);

    }
}
