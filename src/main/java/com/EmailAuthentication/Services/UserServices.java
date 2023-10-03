package com.EmailAuthentication.Services;

import com.EmailAuthentication.Entities.User;
import com.EmailAuthentication.Repository.UserRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserServices {
    private final UserRepository userRepository;

    public UserServices(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean saveUser(User user){
        User newUser = userRepository.save(user);
        System.out.println(newUser);
        return true;
    }

    public Optional<User> getUserById(Long id){
        return userRepository.findById(id);
    }
}
