package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("stripe")
@Primary
public class StripePaymentService implements PaymentService {
    @Value("${stripe.apiUrl: abc}")
    private String apiUrl;
    @Value("${stripe.enabled}")
    private boolean enabled;
    @Value("${stripe.timeOut: 3000}")
    private Integer timeOut;
    @Value("${stripe.currencies}")
    private List<String> currencies;
    @Override
    public void pay(double amount){
        System.out.println("apiUrl: " + apiUrl);
        System.out.println("enabled: " + enabled);
        System.out.println("timeOut: " + timeOut);
        System.out.println("currencies: " + currencies);

        System.out.println("Stripe pays " + amount);
    }
}
