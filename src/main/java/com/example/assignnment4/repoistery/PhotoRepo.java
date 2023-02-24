package com.example.assignnment4.repoistery;

import com.example.assignnment4.model.Album;
import com.example.assignnment4.model.Photo;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PhotoRepo extends MongoRepository<Photo,String> {

    List<Photo> findAllById(String photoId);
}