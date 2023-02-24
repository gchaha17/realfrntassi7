package com.example.assignnment4.service;

import com.example.assignnment4.model.User;
import com.example.assignnment4.repoistery.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

@Service
public class UserService {

    @Autowired
    private UserRepo u3;


    public User saveUser(User u1) {
        return u3.save(u1);

    }


    public List<User> getUser() {
        return u3.findAll();

    }

    public User updateUser(User u1) {
        return u3.save(u1);
    }

    public void deleteUser(String userId) {
        u3.deleteById(userId);
    }

    public List<User> getuserByName(String name) {
        return u3.findAllByName(name);
    }


    public Optional<User> findByName(String name) {
        return  u3.findByName(name);
    }

    public User updateUser1(User u1) {
        return u3.save(u1);
    }
}