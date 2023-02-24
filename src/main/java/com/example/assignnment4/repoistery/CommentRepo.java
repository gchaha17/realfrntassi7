package com.example.assignnment4.repoistery;

import com.example.assignnment4.model.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CommentRepo extends MongoRepository<Comment,String> {

    List<Comment> findByPhotoId(String photoId);

// Optional<User> findByName(String name);



    List<Comment> findAllByPhotoId(String photoId);
}