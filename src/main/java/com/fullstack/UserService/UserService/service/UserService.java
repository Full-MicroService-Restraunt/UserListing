package com.fullstack.UserService.UserService.service;

import com.fullstack.UserService.UserService.entity.User;
import com.fullstack.UserService.UserService.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    public List<User> getAllUsers(){
        return userRepo.findAll();
    }

    public User getUserById(int id){
        return userRepo.findById(id).get();
    }

    public User saveUser(User user){
        return userRepo.save(user);
    }
}
