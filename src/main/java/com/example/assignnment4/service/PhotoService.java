package com.example.assignnment4.service;

import com.example.assignnment4.model.Photo;
import com.example.assignnment4.repoistery.PhotoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PhotoService {
    @Autowired
    private PhotoRepo u4;

    public Photo savePhoto(Photo p1) {
        return u4.save(p1);
    }

    public List<Photo> getPhoto() {
        return u4.findAll();
    }

    public Photo updatePhoto(Photo p1) {
        return  u4.save(p1);
    }

    public void deletePhoto(String photoId) {
        u4.deleteById(photoId);
    }
    public Optional<Photo> getPhotoById(String photoId) {

        return  u4.findById(photoId);
    }

    public Photo updatePhoto1(String photoId,Photo p1) {
        return  u4.save(p1);
    }
}