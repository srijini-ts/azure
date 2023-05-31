package com.example.azurepoc.controller;

import com.example.azurepoc.entity.User;
import com.example.azurepoc.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(path = "/add/{userName}")
    public String addNewUser(@PathVariable String userName){
        User user = new User();
        user.setUserName(userName);
        userRepository.save(user);
        return user.toString();
    }

    @GetMapping(path = "/users")
    public List<User> getAllUsers(){
        return (List<User>) userRepository.findAll();
    }
}
