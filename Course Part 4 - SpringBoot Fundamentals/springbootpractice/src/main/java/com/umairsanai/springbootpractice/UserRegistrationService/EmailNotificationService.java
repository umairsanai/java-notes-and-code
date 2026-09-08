package com.umairsanai.springbootpractice.UserRegistrationService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service 
public class EmailNotificationService implements NotificationService {

    @Value ("${app.email.host:0.0.0.0}")
    private String emailHost;

    @Value ("${app.email.port:6969}")
    private int emailPort;

    @Override
    public void send(String message, String recipientEmail) {
        System.out.println("\n\nSending Mail (" + emailHost + ":" + emailPort + ")\nTo: " + recipientEmail + "\nMessage: " + message + "\n\n");
    }
    
}
