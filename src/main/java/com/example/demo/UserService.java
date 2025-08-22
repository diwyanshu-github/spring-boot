package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final NotificationService2 notificationService2;

    public UserService(UserRepository userRepository, NotificationService2 notificationService2){
        this.userRepository = userRepository;
        this.notificationService2 = notificationService2;
    }

    public void registerUser(User user){
        if(userRepository.findByEmail(user)){
            throw new IllegalArgumentException("email already exists");
        }
        userRepository.save(user);
    }
}
