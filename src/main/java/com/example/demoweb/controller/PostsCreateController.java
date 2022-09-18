package com.example.demoweb.controller;

import com.example.demoweb.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostsCreateController {

    @Autowired
    PostService postsService;

    @ResponseBody
    @RequestMapping(path = "/new", method = RequestMethod.GET)
    public String create(Model model) {
        return "create";
    }

    // Метод обработки запроса
    // метод который обрабатывает http запросы на тот же url но методом POST.
    // И в качестве аргумента принимал бы @ModelAttribute("text") String text
    @RequestMapping(path = "/new", method = RequestMethod.POST)
    public String doCreate(@ModelAttribute("text") String text){
        postsService.create(text);
        //Сделайте редирект в методе doCreate, для этого возвращайте
        return "redirect:/";
    }

}
