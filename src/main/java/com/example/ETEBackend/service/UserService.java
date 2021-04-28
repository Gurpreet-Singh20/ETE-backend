package com.example.ETEBackend.service;


import com.example.ETEBackend.model.UserDetails;
import com.example.ETEBackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public void registerUser(UserDetails newUser){
        userRepository.register(newUser);
    }


}
