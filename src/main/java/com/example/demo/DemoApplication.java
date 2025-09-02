package com.example.demo;

import com.example.demo.entities.Address;
import com.example.demo.entities.Profile;
import com.example.demo.entities.Tag;
import com.example.demo.entities.User;
import lombok.Builder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
//        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);

        SpringApplication.run(DemoApplication.class, args);
//            var user = new User(1L, "abc", "xyz@com", "password");
//            var user2 = User.builder().name("abc").build();
//            var user3 = new User();
//            user3.setId(1L);
        var user = User.builder().name("abc").email("xyz@com").build();
        var profile = Profile.builder().bio("abc").build();

        user.addProfile(profile);
        System.out.println(user);

    }
}
