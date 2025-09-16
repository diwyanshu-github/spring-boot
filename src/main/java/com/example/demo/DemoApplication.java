package com.example.demo;

import com.example.demo.Serives.UserService;
import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

        var userService = context.getBean(UserService.class);
        userService.fetchAddress();
    }
}
