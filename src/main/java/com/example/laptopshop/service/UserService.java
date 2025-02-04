package com.example.laptopshop.service;

import com.example.laptopshop.domain.User;
import com.example.laptopshop.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String handHello(){
        return "Hello";
    }
    public User handSaveUser(User user){
        return this.userRepository.save(user);

    }
}
