package com.example.demo;

public class OrderService {
    private PaymentService paymentService;
    public OrderService(PaymentService paymentService){
        this.paymentService = paymentService;
    }
    public void processPayment(){
        paymentService.pay(123);
    }
}
