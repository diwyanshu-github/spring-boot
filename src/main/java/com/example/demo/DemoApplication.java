package com.example.demo;

import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        var repo = context.getBean(UserRepository.class);
        var user = User.builder().name("john2").email("john@gmail.com").password("abc").build();
        repo.save(user);
        repo.deleteAll();
        var getUser = repo.findById(1L).orElseThrow();
//        System.out.println(getUser.getEmail());
    }
}
