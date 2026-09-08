package com.umairsanai.springbootpractice.UserRegistrationService;

import org.springframework.stereotype.Service;

@Service 
public interface NotificationService {
    public void send(String message, String recipientEmail);
}
