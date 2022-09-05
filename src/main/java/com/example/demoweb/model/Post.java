package com.example.demoweb.model;

public class Post {
    private String text;
    private Integer likes;

    public Post(String t, Integer l) {
        text = t;
        likes = l;
    }

    public String getText() {
        return text;
    }

    public Integer getLikes() {
        return likes;
    }
}
