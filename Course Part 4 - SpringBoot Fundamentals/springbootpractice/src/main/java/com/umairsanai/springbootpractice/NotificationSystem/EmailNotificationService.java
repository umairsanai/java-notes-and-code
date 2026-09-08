package com.umairsanai.springbootpractice.NotificationSystem;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("email-notification")
@Primary 
public class EmailNotificationService implements NotificationService {

    @Override
    public void send(String message) {
        System.out.println("Sending Email Notification....");
        System.out.println(message);
    }   
}
