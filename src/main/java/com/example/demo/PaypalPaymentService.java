package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class PaypalPaymentService implements PaymentService {
    @Override
    public void pay(double amount) {
        System.out.println("Paypal pays " + amount);
    }

}
