package com.example.demo;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

//@Service
public class OrderService {

    private PaymentService paymentService;
    public OrderService(PaymentService paymentService){
        this.paymentService = paymentService;

    }
    @PostConstruct
    public void post(){
        System.out.println("post construct order service");
    }
    @PreDestroy
    public void dest(){
        System.out.println("pre destroy order service");
    }
    public void processPayment(){
        paymentService.pay(123);
    }
    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
}
