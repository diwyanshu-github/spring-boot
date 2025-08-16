package com.example.demo;

public class PaypalPaymentService implements PaymentService {
    @Override
    public void pay(double amount){
        System.out.println("Paypal pays " + amount);
    }
}
