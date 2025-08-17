package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public PaymentService paypal(){
        return new PaypalPaymentService();
    }

    @Bean
    public PaymentService stripe(){
        return new StripePaymentService();
    }
    @Value("${paymentGateway}")
    private String paymentGateway;

    @Bean
    public OrderService orderService(){
        if(paymentGateway.equals("stripe"))
        return new OrderService(stripe());
        else
            return new OrderService(paypal());
    }

}
