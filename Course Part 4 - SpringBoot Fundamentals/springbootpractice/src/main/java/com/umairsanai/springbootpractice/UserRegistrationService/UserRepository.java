package com.umairsanai.springbootpractice.UserRegistrationService;

import org.springframework.stereotype.Repository;

@Repository 
public interface UserRepository {
    public void save(User user);
}
