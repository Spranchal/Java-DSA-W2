package com.firstproject.store;
import org.springframework.stereotype.Service;

@Service
public class PaytmPaymentService implements PaymentService{
    @Override
    public void processPayment(double amount) {
        System.out.println("PAYTM");
        System.out.println("Amount: " + amount);
    }

}
