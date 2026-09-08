package com.umairsanai.springbootpractice.OrderSystem;

// import org.springframework.stereotype.Service;


/*
    We give the service a name like this so that if we have to 
    use it as a bean somewhere over the @Primary bean,
    we can use it, as it's used in the OrderService class.

    Syntax:

    processPayment(@Qualifier("serviceName") PaymentService paymentService)

    In this case, if the JazzcashPaymentService is set as @Primary bean,
    but if we want to qualify stripe payment somewhere, we can use it like this:

    processPayment(@Qualifier("stripe") PaymentService paymentService)


    THIS IS USED IN OrderService class in placeOrder() function's arguments.

*/

// @Service("stripe")
public class StripePaymentService implements PaymentService {

    @Override
    public void processPayment() {
        System.out.println("Processing Payment (Stripe) ...");
        System.out.println("Payment Processed!");
    }

}
