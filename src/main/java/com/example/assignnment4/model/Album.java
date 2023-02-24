package com.example.assignnment4.model;

import com.example.assignnment4.validation.ValidName1;
import org.hibernate.validator.constraints.Length;
import org.springframework.data.annotation.Id;

public class Album {
    @Id
    private String id;
    @Length(max = 10)
    private String name;
    private String coverPhotoUrl;
    @ValidName1
    private String createdBy ;
    private String dateCreated;

    public Album(String id, String name, String coverPhotoUrl, String createdBy, String dateCreated) {
        this.id = id;
        this.name = name;
        this.coverPhotoUrl = coverPhotoUrl;
        this.createdBy = createdBy;
        this.dateCreated = dateCreated;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoverPhotoUrl() {
        return coverPhotoUrl;
    }

    public void setCoverPhotoUrl(String coverPhotoUrl) {
        this.coverPhotoUrl = coverPhotoUrl;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }
}