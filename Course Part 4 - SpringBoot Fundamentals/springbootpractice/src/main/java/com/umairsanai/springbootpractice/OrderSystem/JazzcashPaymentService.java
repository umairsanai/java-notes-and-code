package com.umairsanai.springbootpractice.OrderSystem;

// import org.springframework.context.annotation.Primary;
// import org.springframework.stereotype.Service;


// @Service("jazzcash")
// @Primary
public class JazzcashPaymentService implements PaymentService {

    @Override
    public void processPayment() {
        System.out.println("Processing Payment (Jazzcash) ...");
        System.out.println("Payment Processed!");
    }

}
