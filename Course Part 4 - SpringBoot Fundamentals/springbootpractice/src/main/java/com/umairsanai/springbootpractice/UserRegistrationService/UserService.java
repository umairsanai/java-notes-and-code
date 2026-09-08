package com.umairsanai.springbootpractice.UserRegistrationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
public class UserService {
    private UserRepository userRepository;
    private NotificationService notificationService;

    @Autowired 
    public UserService(UserRepository userRepository, NotificationService notificationService) {
        this.userRepository = userRepository;
        this.notificationService = notificationService;
    }

    public void registerUser(User user) {
        userRepository.save(user);
        notificationService.send("Welcome to the SpringBoot Exercise!", user.getEmail());
    }
    
}
