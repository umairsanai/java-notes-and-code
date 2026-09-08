package com.umairsanai.springbootpractice.NotificationSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service 
public class NotificationManager {
    private final NotificationService notificationService;

    @Autowired 
    public NotificationManager(@Qualifier("sms-notification") NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void sendNotification(String message) {
        notificationService.send(message);
        System.out.println("Notification Sent!");
    }
}
