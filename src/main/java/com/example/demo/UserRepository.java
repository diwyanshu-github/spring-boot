package com.example.demo;

public interface UserRepository {
    void save(User user);
    boolean findByEmail(User user);
}
