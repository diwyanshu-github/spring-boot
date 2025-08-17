package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class EmailNotificationService implements NotificationService {

    @Override
    public void send(String message){
        System.out.println("Email Notification: " + message);
    }
}
