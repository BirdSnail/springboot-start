package com.birdsnail.springboot.training.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author BirdSnail
 * @date 2019/12/17
 */
@Controller
public class SimpleController {

    @Value("${spring.application.name}")
    private String appName;

    @GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("name", appName);
        return "home";
    }

}
