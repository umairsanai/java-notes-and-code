package com.umairsanai.springbootpractice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller   
public class HomeController {

    // This is how we access application.properties
    // It's the same as .env for the node environment.

    @Value ("${app.developerName}")
    private String devName;
    
    // This is how we use default values for environment variables, with a (:) colon.
    @Value ("${app.developerAge:20}")
    private String devAge;
    
    @Value ("${auth.passwordSecret}")
    private String passwordSecret;

    @RequestMapping ("/home") 
    public String main() {
        System.out.println("Developer " + devName + " is " + devAge + " years old!");
        System.out.println("Password Secret: " + passwordSecret);
        return "index.html";
    }
}
