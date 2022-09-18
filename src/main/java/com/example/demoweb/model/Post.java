package com.example.demoweb.model;

import java.util.Date;

public class Post {
    private final String text;
    private Integer likes;
    private final Date creationDate;
    private final long id;

    public Post(long i, String t, Integer l, Date date) {
        text = t;
        likes = l;
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
