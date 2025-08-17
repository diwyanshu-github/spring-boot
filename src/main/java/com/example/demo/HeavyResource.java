package com.example.demo;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Lazy
@Scope("prototype")
public class HeavyResource {

    public HeavyResource(){
        System.out.println("heavy resource created");
    }
}
