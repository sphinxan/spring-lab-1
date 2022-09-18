package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class PostService {

    //метод возвращающий список из трёх постов с текстами на ваше усмотрение
    public List<Post> listAllPosts(){
        List<Post> posts = Arrays.asList(new Post("first", 1),
                new Post("second", 2),
                new Post("third", 3));
        return posts;
    }
}
