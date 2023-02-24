package com.example.assignnment4.resource;

import com.example.assignnment4.exception.RestrictedInfo;
import com.example.assignnment4.model.Photo;
import com.example.assignnment4.model.User;
import com.example.assignnment4.service.UserService;
import com.google.api.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.awt.*;
import java.util.*;
import java.util.List;

@RestController
@CrossOrigin(origins = {"http://52.12.77.85","http://localhost:4200","http://assi4and5.s3-website-us-west-2.amazonaws.com","http://assi667766.s3-website-us-west-2.amazonaws.com"})
@RequestMapping("/api")
public class UserResource {
    @Autowired
    public UserService u2;

    @PostMapping("/user")
    public User saveUser(@RequestBody @Valid User u1) {
        return u2.saveUser(u1);

    }

    @GetMapping("/user")
    public List<User> getUser(@RequestHeader(name = "idToken") String idToken) {
        return u2.getUser();

    }

    @PutMapping("/user")
    public User updateUser(@RequestBody User u1) {

        return u2.updateUser(u1);
    }
    @PutMapping("/user/user")
    public User updateUser1(@RequestBody User u1, @RequestParam(name="photoUrl") Photo photoUrl,@RequestHeader(name="idToken")String idToken) {

        return u2.updateUser1(u1);
    }

    @DeleteMapping
    public void deleteUser(@RequestParam(name = "userId") String userId) {
        u2.deleteUser(userId);

    }


    @GetMapping("/find")
       public List<User> getuserByName(@RequestParam (name="name")String name,@RequestHeader(name="idToken")String idToken) throws RestrictedInfo {
           if (name.equalsIgnoreCase("root")) {
               throw new RestrictedInfo();



           }
           return u2.getuserByName(name);
       }
    @GetMapping("/user/me")
    public List<User> getuser(@RequestHeader(name = "idToken") String idToken) {
        return u2.getUser();
    }
    @GetMapping("/user/me/me")
    public Optional<User> getUserByName(String name,@RequestHeader(name = "idToken") String idToken) {
        return u2.findByName(name);
    }
}