package com.example.demo;

import com.example.demo.entities.Address;
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

//        SpringApplication.run(DemoApplication.class, args);
//            var user = new User(1L, "abc", "xyz@com", "password");
//            var user2 = User.builder().name("abc").build();
//            var user3 = new User();
//            user3.setId(1L);
        var user = User.builder().name("abc").email("xyz@com").build();
        var address = Address.builder().city("city").street("street").build();

//        user.getAddresses().add(address);
//        address.setUser(user);
        user.addAddress(address);
        System.out.println(user);

    }
}
