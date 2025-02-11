package com.example.laptopshop.service;

import com.example.laptopshop.domain.User;
import com.example.laptopshop.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.security.PublicKey;
import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String handHello(){
        return "Hello";
    }
    public List<User> getAllUser(){
        return userRepository.findAll();

    }
    public List<User> getAllUserByEmail(String email){
        return userRepository.findByEmail(email);

    }
    public List<User> getAllUserByid(long id){
        return userRepository.findByid(id);
    }


    public User getUserById(long userID) {
        return userRepository.findById(userID).orElse(null);
    }


    public User handSaveUser(User user){
        User eric = userRepository.save(user);
//        System.out.println(eric);
        return eric;

    }

    public void deleteUser(long id){
         this.userRepository.deleteById(id);
    }
}
