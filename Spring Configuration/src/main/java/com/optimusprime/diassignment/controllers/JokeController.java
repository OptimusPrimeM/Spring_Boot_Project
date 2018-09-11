package com.optimusprime.diassignment.controllers;

import com.optimusprime.diassignment.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/",""})
    public String displayJokeQuakes(Model model){
        model.addAttribute("jokes",jokeService.getJoke());
        return "chucknorris";

    }
}
