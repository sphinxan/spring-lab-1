package com.example.demoweb.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Post implements Serializable {

    private String text;
    private Integer likes;
    private Date creationDate;
    @Id
    @GeneratedValue
    private Long id;

    public Post() {
    }

    public Post(Long i, String t, Date date) {
        text = t;
        likes = 0;
        creationDate = date;
        id = i;
    }

    public String getText() {
        return text;
    }

    public void setLikes(int likes){
        this.likes = likes;
    }

    public Integer getLikes() {
        return likes;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public Long getId(){
        return id;
    }
}
