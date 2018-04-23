package com.chezouam.chucknorrisfact.controller;

import com.chezouam.chucknorrisfact.service.FactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FactController {

    private FactService service;

    @Autowired
    public FactController(FactService service) {
        this.service = service;
    }

    @RequestMapping({ "/", ""})
    public String getJoke(Model model) {

        model.addAttribute("joke",service.getRandomJoke());
        return "chucknorris";
    }

}
