package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class PostService {

    List<Post> posts = new ArrayList<>();

    //метод возвращающий список из трёх постов с текстами на ваше усмотрение
    public List<Post> listAllPosts(){
        return posts;
    }

    //Сервис для добавления поста
    public void create(String text) {
        //posts.add(new Post("first", 1, new Date(2020, 01, 01)));
        //posts.add(new Post("second", 2, new Date(2021, 01, 01)));
        //posts.add(new Post("third", 3, new Date(2022, 01, 01)));
        posts.add(new Post(text, 0, new Date()));
    }
}
