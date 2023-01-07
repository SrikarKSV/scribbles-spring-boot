package com.srikar.scribbles.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.srikar.scribbles.entity.Scribble;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/scribble")
    public String getScribble(Scribble scribble) {
        return "form";
    }

    @PostMapping("/scribble")
    public String postScribble() {
        return "home";
    }

}
