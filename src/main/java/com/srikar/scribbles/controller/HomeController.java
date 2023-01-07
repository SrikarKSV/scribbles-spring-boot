package com.srikar.scribbles.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.srikar.scribbles.entity.Scribble;
import com.srikar.scribbles.service.ScribbleService;

import jakarta.validation.Valid;

@Controller
public class HomeController {

    @Autowired
    private ScribbleService scribbleService;

    @GetMapping("/")
    public String home(Model model) {
        List<Scribble> scribbles = scribbleService.getScribbles();
        model.addAttribute("scribbles", scribbles);
        return "home";
    }

    @GetMapping("/scribble")
    public String getScribble(Scribble scribble) {
        return "form";
    }

    @GetMapping("/{id}")
    public String getPost(@PathVariable Long id, Model model) {
        Scribble scribble = scribbleService.getScribbleById(id);
        model.addAttribute("scribble", scribble);
        return "post";
    }

    @PostMapping("/scribble")
    public String postScribble(@Valid Scribble scribble, Errors errors, RedirectAttributes redirectAttrs) {
        if (errors.hasErrors()) {
            return "form";
        } else {
            Scribble newScribble = scribbleService.addScribble(scribble);
            redirectAttrs.addFlashAttribute("message", "Scribble created!");
            return "redirect:/" + newScribble.getId();
        }
    }
}
