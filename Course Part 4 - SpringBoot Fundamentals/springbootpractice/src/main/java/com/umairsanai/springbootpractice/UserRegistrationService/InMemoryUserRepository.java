package com.umairsanai.springbootpractice.UserRegistrationService;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository 
public class InMemoryUserRepository implements UserRepository {
    Map<String, User> users = new HashMap<>();

    @Override
    public void save(User user) {        
        if (users.containsKey(user.getEmail())) return;
        users.put(user.getEmail(), user);
    }    
}
