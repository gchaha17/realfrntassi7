package com.example.assignnment4.repoistery;

import com.example.assignnment4.model.Album;
import com.example.assignnment4.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface AlbumRepo extends MongoRepository<Album,String> {
    List<Album> findAllById(String albumId);
}