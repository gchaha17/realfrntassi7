package com.example.assignnment4.service;

import com.example.assignnment4.model.Comment;
import com.example.assignnment4.repoistery.CommentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommentService {
    @Autowired
    private CommentRepo ur3;
    public Comment saveComment(Comment c1) {
        return ur3.save(c1);
    }

    public List<Comment> getComment() {
        return ur3.findAll();
    }

    public Comment updateComment(Comment c1) {
        return ur3.save(c1);
    }

    public void deleteComment(String commentId) {
        ur3.deleteById(commentId);
    }





    public List<Comment> getCommentByPhotoId(String photoId) {
        return ur3.findAllByPhotoId(photoId);
    }
}