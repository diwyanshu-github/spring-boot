package com.example.demo;

import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class InMemoryUserRepository implements UserRepository {

    private final HashMap<String,User> map = new HashMap<>();

    @Override
    public void save(User user){
        map.put(user.getEmail(),user);
        System.out.println(user.getEmail() + " saved");
    }
    @Override
    public boolean findByEmail(User user){
        return map.containsKey(user.getEmail());
    }
}
