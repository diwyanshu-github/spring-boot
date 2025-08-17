package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class NotificationManager {
    private NotificationService obj;
    public NotificationManager(NotificationService notificationService){
        this.obj = notificationService;
    }

    public void sendNotification(String message){
        obj.send(message);
    }
}
