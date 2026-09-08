package com.umairsanai.springbootpractice.OrderSystem;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.beans.factory.annotation.Qualifier;
// import org.springframework.stereotype.Service;
import org.springframework.context.annotation.Lazy;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;



/*
    BEAN LIFECYCLE HOOKS:
        @PostConstruct 
        @PreDestroy 

        
    BEAN SCOPES:
        singleton
        prototype
        request
        session
    Explanation and details are in the Google Docs notes.

*/




// @Service 
@Lazy 
public class OrderService {
    private PaymentService paymentService = null;

    // public OrderService() {}
    
    @Autowired 
    public OrderService(PaymentService paymentService) {
        System.out.println("OrderService created!");
        this.paymentService = paymentService;
    }

    @PostConstruct 
    public void init() {
        System.out.println("Runs just after the constructor!");
    }
    
    @PreDestroy 
    public void cleanup() {
        System.out.println("\n\n");			
        System.out.println("Runs before the destruction of the instance!");
        System.out.println("\n\n");			
    }

    public void placeOrder() {
        if (paymentService != null)
            paymentService.processPayment();
    }

}
