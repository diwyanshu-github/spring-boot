package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
        ApplicationContext context  = SpringApplication.run(DemoApplication.class, args);
        var orderService = context.getBean(OrderService.class);
//        var orderService = new OrderService(new PaypalPaymentService());
        orderService.processPayment();

//        var notificationManager = context.getBean(NotificationManager.class);
//        var notificationManager = new NotificationManager(new SMSNotificationService());
//        notificationManager.sendNotification("hello");


//        var service = new SMSNotificationService();
//        service = new EmailNotificationService(); // ❌ compile-time error
//       At compile time, the type of service is fixed as SMSNotificationService.
//        NotificationService service = new SMSNotificationService();
//        service = new EmailNotificationService(); // ✅ allowed
	}


}
