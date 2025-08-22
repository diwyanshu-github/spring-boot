package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("email")
@Primary
public class EmailNotificationService2 implements NotificationService2 {

    @Value("${user.host:80}")
    private String host;

    @Value("${user.port:3000}")
    private String port;

    @Override
    public void send(String message, String receipientEmail){
        System.out.println(message + " sent to " + receipientEmail);
        System.out.println("Port: " + port);
        System.out.println("Host: " + host);
    }
}
