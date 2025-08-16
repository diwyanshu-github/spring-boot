package com.example.demo;

public class StripePaymentService implements PaymentService {
    @Override
    public void pay(double amount){
        System.out.println("Stripe pays " + amount);
    }
}
