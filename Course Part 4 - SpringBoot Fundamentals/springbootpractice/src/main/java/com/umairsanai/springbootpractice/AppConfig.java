package com.umairsanai.springbootpractice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

// import com.umairsanai.springbootpractice.NotificationSystem.EmailNotificationService;
// import com.umairsanai.springbootpractice.NotificationSystem.NotificationService;

import com.umairsanai.springbootpractice.OrderSystem.JazzcashPaymentService;
import com.umairsanai.springbootpractice.OrderSystem.OrderService;
import com.umairsanai.springbootpractice.OrderSystem.PaymentService;
import com.umairsanai.springbootpractice.OrderSystem.StripePaymentService;

/*

    We use this class to configure the "Beans" manually with code:
    It helps because if we want to configure a bean based on condition,
    we can't do it with the Annotations. Also, if we use other
    external libraries and configure their classes as beans
    we can't modify there code and use annotations there.
    In such situations, we configure the beans through code if we want
    more control over the configuration.

*/


@Configuration 
public class AppConfig {

    @Value ("${app.paymentGateway}")
    private String paymentGateway;

    @Bean 
    public PaymentService stripePaymentService() {
        return new StripePaymentService();
    } 

    @Bean 
    public PaymentService jazzcashPaymentService() {
        return new JazzcashPaymentService();
    }


    
    // A type of producer function: Produces payment services.
    
    // BEAN SCOPE:
    // @Scope ("prototype")
    @Bean 
    @Lazy 
    public OrderService orderService() {
        return paymentGateway.equals("jazzcash") ?
            new OrderService(jazzcashPaymentService()) :            
            new OrderService(stripePaymentService());
    }
}
