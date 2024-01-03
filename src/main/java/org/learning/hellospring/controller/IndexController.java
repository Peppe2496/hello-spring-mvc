package org.learning.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Random;

@Controller
@RequestMapping ("/")
public class IndexController {

    @GetMapping
    public String index(Model model){
        Random random = new Random();
        int randomNumber = random.nextInt(1,6);
        model.addAttribute("randomNumber", randomNumber);
        return "index";

    }
}
