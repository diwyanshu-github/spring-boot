package com.example.demo;

public class User {
    private String id;
    private String email;
    private String password;
    private String name;
    
    public User(String id, String email, String password, String name){
        this.email = email;
        this.id = id;
        this.password = password;
        this.name = name;
    }
    public void setId(String id){
        this.id = id;
    }
    public void setEmail(String id){
        this.email = id;
    }
    public void setPassword(String id){
        this.password = id;
    }
    public void setName(String id){
        this.name = id;
    }
    public String getEmail(){
        return this.email;
    }
}
