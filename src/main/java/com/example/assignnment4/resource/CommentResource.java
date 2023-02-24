package com.example.assignnment4.resource;

import com.example.assignnment4.model.Comment;
import com.example.assignnment4.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/comment")
@CrossOrigin(origins = {"http://assi4and5.s3-website-us-west-2.amazonaws.com","http://localhost:4200","http://assi667766.s3-website-us-west-2.amazonaws.com"})
public class CommentResource {
    @Autowired
    private CommentService crs;
    @PostMapping()
    public Comment saveComment(@RequestBody @Valid Comment c1)
    {
        return crs.saveComment(c1);

    }
    @GetMapping()
    public List<Comment> getComment()
    {
        return crs.getComment();

    }

    @PutMapping()
    public Comment updateComment(@RequestBody Comment c1)
    {

        return crs.updateComment(c1);
    }
    @DeleteMapping()
    public void deleteComment(@RequestParam(name="commentId")String commentId)
    {
        crs.deleteComment(commentId);

    }


    @GetMapping("/photo/{photoId}")
    public List<Comment> getCommentByPhotoId(@RequestParam(required=false,name="id") String photoId,@RequestHeader(name="idToken")String idToken)
    {


        return  crs.getCommentByPhotoId(photoId);


    }
}