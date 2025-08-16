package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//This class will handle web requests and return either data or a view (HTML page).
@Controller
public class HelloController {
//When the browser visits http://localhost:8080/, Spring runs index()
    @RequestMapping("/")
    public String index(){
        System.out.println(appName);
        return "index";
    }

    @Value("${spring.application.name}")
    private String appName;
}
