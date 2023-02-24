package com.example.assignnment4.repoistery;

import com.example.assignnment4.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepo extends MongoRepository<User,String> {

    List<User> findAllByName(String name);
    Optional<User> findByName(String name);
}